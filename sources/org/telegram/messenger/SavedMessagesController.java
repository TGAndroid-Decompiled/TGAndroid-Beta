package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.LaunchActivity;

public class SavedMessagesController {
    private final int currentAccount;
    private int dialogsCount;
    private int dialogsCountHidden;
    public boolean dialogsEndReached;
    private boolean dialogsLoaded;
    private boolean dialogsLoading;
    private boolean loadedCache;
    private boolean loadingCache;
    private boolean loadingCacheOnly;
    private boolean saving;
    public boolean unsupported;
    private ArrayList<SavedDialog> cachedDialogs = new ArrayList<>();
    private ArrayList<SavedDialog> loadedDialogs = new ArrayList<>();
    public ArrayList<SavedDialog> allDialogs = new ArrayList<>();
    private final Runnable saveCacheRunnable = new Runnable() {
        @Override
        public final void run() {
            SavedMessagesController.this.saveCache();
        }
    };
    private final LongSparseArray checkMessagesCallbacks = new LongSparseArray();

    public static class SavedDialog {
        public long dialogId;
        private int localDate;
        public MessageObject message;
        public int messagesCount;
        public boolean messagesCountLoaded;
        public boolean pinned;
        private int pinnedOrder;
        public int top_message_id;

        public static SavedDialog fromMessage(int i, TLRPC.Message message) {
            SavedDialog savedDialog = new SavedDialog();
            savedDialog.dialogId = MessageObject.getSavedDialogId(UserConfig.getInstance(i).getClientUserId(), message);
            savedDialog.pinned = false;
            savedDialog.top_message_id = message.id;
            savedDialog.message = new MessageObject(i, message, null, null, null, null, null, false, false, 0L, false, false, true);
            return savedDialog;
        }

        public static SavedDialog fromTL(int i, TLRPC.TL_savedDialog tL_savedDialog, ArrayList<TLRPC.Message> arrayList) {
            TLRPC.Message message;
            SavedDialog savedDialog = new SavedDialog();
            savedDialog.dialogId = DialogObject.getPeerDialogId(tL_savedDialog.peer);
            savedDialog.pinned = tL_savedDialog.pinned;
            savedDialog.top_message_id = tL_savedDialog.top_message;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    message = null;
                    break;
                }
                message = arrayList.get(i2);
                if (savedDialog.top_message_id == message.id) {
                    break;
                }
                i2++;
            }
            TLRPC.Message message2 = message;
            if (message2 != null) {
                savedDialog.message = new MessageObject(i, message2, null, null, null, null, null, false, false, 0L, false, false, true);
            }
            return savedDialog;
        }

        public int getDate() {
            TLRPC.Message message;
            MessageObject messageObject = this.message;
            return (messageObject == null || (message = messageObject.messageOwner) == null) ? this.localDate : ((message.flags & 32768) == 0 || message.edit_hide) ? message.date : message.edit_date;
        }

        public boolean isHidden() {
            TLRPC.Message message;
            MessageObject messageObject = this.message;
            return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
        }
    }

    public SavedMessagesController(int i) {
        this.currentAccount = i;
        this.unsupported = MessagesController.getMainSettings(i).getBoolean("savedMessagesUnsupported", true);
    }

    private void deleteCache() {
        if (this.saving) {
            return;
        }
        this.saving = true;
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.this.lambda$deleteCache$13(messagesStorage);
            }
        });
    }

    private ArrayList<Long> getCurrentPinnedOrder(ArrayList<SavedDialog> arrayList) {
        ArrayList<Long> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            SavedDialog savedDialog = arrayList.get(i);
            if (savedDialog.pinned) {
                arrayList2.add(Long.valueOf(savedDialog.dialogId));
            }
        }
        return arrayList2;
    }

    private void invalidate() {
        SavedDialog savedDialog;
        if (this.dialogsLoaded && this.loadedDialogs.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.loadedDialogs.size(); i++) {
            SavedDialog savedDialog2 = this.loadedDialogs.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= this.cachedDialogs.size()) {
                    savedDialog = null;
                    break;
                }
                savedDialog = this.cachedDialogs.get(i2);
                if (savedDialog.dialogId == savedDialog2.dialogId) {
                    break;
                } else {
                    i2++;
                }
            }
            if (savedDialog == null && !savedDialog2.pinned) {
                this.cachedDialogs.add(savedDialog2);
            }
        }
        this.loadedDialogs.clear();
        this.dialogsLoaded = false;
        this.dialogsCount = 0;
        this.dialogsEndReached = false;
        update();
        loadDialogs(false);
    }

    public void lambda$deleteCache$12() {
        this.saving = false;
        this.loadedCache = false;
    }

    public void lambda$deleteCache$13(MessagesStorage messagesStorage) {
        try {
            messagesStorage.getDatabase().executeFast("DELETE FROM saved_dialogs").stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.this.lambda$deleteCache$12();
            }
        });
    }

    public void lambda$hasSavedMessages$14(TLObject tLObject, long j) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int size = messages_messages.messages.size();
            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            boolean z = size > 0;
            if (size > 0) {
                if (!updatedDialogCount(j, size)) {
                    if (!messages_messages.messages.isEmpty()) {
                        SavedDialog fromMessage = SavedDialog.fromMessage(this.currentAccount, messages_messages.messages.get(0));
                        fromMessage.messagesCount = size;
                        fromMessage.messagesCountLoaded = true;
                        this.cachedDialogs.add(fromMessage);
                    }
                }
                update();
            }
            ArrayList arrayList = (ArrayList) this.checkMessagesCallbacks.get(j);
            this.checkMessagesCallbacks.remove(j);
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ((Utilities.Callback) arrayList.get(i)).run(Boolean.valueOf(z));
                }
            }
        }
    }

    public void lambda$hasSavedMessages$15(final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.this.lambda$hasSavedMessages$14(tLObject, j);
            }
        });
    }

    public void lambda$loadCache$6(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.loadingCache = false;
        this.loadedCache = true;
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList2, true);
        AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).processDocuments(arrayList3);
        this.cachedDialogs.clear();
        this.cachedDialogs.addAll(arrayList4);
        updateAllDialogs(true);
        if (runnable == null || this.loadingCacheOnly) {
            return;
        }
        runnable.run();
    }

    public void lambda$loadCache$7(org.telegram.messenger.MessagesStorage r36, long r37, final java.lang.Runnable r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SavedMessagesController.lambda$loadCache$7(org.telegram.messenger.MessagesStorage, long, java.lang.Runnable):void");
    }

    public void lambda$loadDialogs$1() {
        loadDialogs(false);
    }

    public void lambda$loadDialogs$2(org.telegram.tgnet.TLObject r19, java.util.ArrayList r20, org.telegram.tgnet.TLRPC.TL_error r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SavedMessagesController.lambda$loadDialogs$2(org.telegram.tgnet.TLObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$loadDialogs$3(final ArrayList arrayList, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.this.lambda$loadDialogs$2(tLObject, arrayList, tL_error);
            }
        });
    }

    public void lambda$saveCache$10() {
        this.saving = false;
    }

    public void lambda$saveCache$11(org.telegram.messenger.MessagesStorage r7, java.util.ArrayList r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SavedMessagesController.lambda$saveCache$11(org.telegram.messenger.MessagesStorage, java.util.ArrayList):void");
    }

    public static int lambda$updateAllDialogs$0(SavedDialog savedDialog, SavedDialog savedDialog2) {
        return savedDialog2.getDate() - savedDialog.getDate();
    }

    public void lambda$updateDialogsLastMessage$8(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, LongSparseArray longSparseArray) {
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList2, true);
        AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).processDocuments(arrayList3);
        for (int i = 0; i < arrayList4.size(); i++) {
            removeDialog(((Long) arrayList4.get(i)).longValue());
        }
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            long keyAt = longSparseArray.keyAt(i2);
            MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC.Message) longSparseArray.valueAt(i2), null, null, null, null, null, false, false, 0L, false, false, true);
            for (int i3 = 0; i3 < this.loadedDialogs.size(); i3++) {
                SavedDialog savedDialog = this.loadedDialogs.get(i3);
                if (savedDialog.dialogId == keyAt) {
                    savedDialog.top_message_id = messageObject.getId();
                    savedDialog.message = messageObject;
                }
            }
            for (int i4 = 0; i4 < this.cachedDialogs.size(); i4++) {
                SavedDialog savedDialog2 = this.cachedDialogs.get(i4);
                if (savedDialog2.dialogId == keyAt) {
                    savedDialog2.top_message_id = messageObject.getId();
                    savedDialog2.message = messageObject;
                }
            }
        }
        update();
    }

    public void lambda$updateDialogsLastMessage$9(org.telegram.messenger.MessagesStorage r19, java.util.ArrayList r20, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SavedMessagesController.lambda$updateDialogsLastMessage$9(org.telegram.messenger.MessagesStorage, java.util.ArrayList, long):void");
    }

    public static int lambda$updatePinnedOrder$4(SavedDialog savedDialog, SavedDialog savedDialog2) {
        return savedDialog2.getDate() - savedDialog.getDate();
    }

    public static int lambda$updatePinnedOrder$5(SavedDialog savedDialog, SavedDialog savedDialog2) {
        return savedDialog.pinnedOrder - savedDialog2.pinnedOrder;
    }

    private void loadCache(final Runnable runnable) {
        if (this.loadingCache) {
            return;
        }
        this.loadingCache = true;
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.this.lambda$loadCache$7(messagesStorage, clientUserId, runnable);
            }
        });
    }

    public static void openSavedMessages() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(lastFragment.getCurrentAccount()).getClientUserId());
        lastFragment.presentFragment(new ChatActivity(bundle));
    }

    private boolean processUpdateInternal(TLRPC.Update update) {
        if (update instanceof TLRPC.TL_updateSavedDialogPinned) {
            TLRPC.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TLRPC.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (!(dialogPeer instanceof TLRPC.TL_dialogPeer)) {
                return false;
            }
            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_dialogPeer) dialogPeer).peer);
            ArrayList<Long> arrayList = new ArrayList<>();
            arrayList.add(Long.valueOf(peerDialogId));
            return updatePinned(arrayList, tL_updateSavedDialogPinned.pinned, false);
        }
        if (!(update instanceof TLRPC.TL_updatePinnedSavedDialogs)) {
            return false;
        }
        TLRPC.TL_updatePinnedSavedDialogs tL_updatePinnedSavedDialogs = (TLRPC.TL_updatePinnedSavedDialogs) update;
        ArrayList<Long> arrayList2 = new ArrayList<>(tL_updatePinnedSavedDialogs.order.size());
        for (int i = 0; i < tL_updatePinnedSavedDialogs.order.size(); i++) {
            TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i);
            if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
            }
        }
        return updatePinnedOrder(this.loadedDialogs, arrayList2) || updatePinnedOrder(this.cachedDialogs, arrayList2);
    }

    private int removeDialog(long j) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.allDialogs.size()) {
            if (this.allDialogs.get(i2).dialogId == j) {
                this.allDialogs.remove(i2);
                i3++;
                i2--;
            }
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.loadedDialogs.size()) {
            if (this.loadedDialogs.get(i4).dialogId == j) {
                this.loadedDialogs.remove(i4);
                i5++;
                i4--;
            }
            i4++;
        }
        while (i < this.cachedDialogs.size()) {
            if (this.cachedDialogs.get(i).dialogId == j) {
                this.cachedDialogs.remove(i);
                i--;
            }
            i++;
        }
        return Math.max(i3, i5);
    }

    private boolean sameOrder(ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (!Objects.equals(arrayList.get(i), arrayList2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void saveCache() {
        if (this.saving) {
            return;
        }
        this.saving = true;
        final ArrayList arrayList = new ArrayList(this.allDialogs);
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.this.lambda$saveCache$11(messagesStorage, arrayList);
            }
        });
    }

    private void saveCacheSchedule() {
        AndroidUtilities.cancelRunOnUIThread(this.saveCacheRunnable);
        AndroidUtilities.runOnUIThread(this.saveCacheRunnable, 450L);
    }

    private void updateAllDialogs(boolean z) {
        this.allDialogs.clear();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.cachedDialogs.size(); i++) {
            SavedDialog savedDialog = this.cachedDialogs.get(i);
            if (savedDialog.pinned && !hashSet.contains(Long.valueOf(savedDialog.dialogId)) && !savedDialog.isHidden()) {
                this.allDialogs.add(savedDialog);
                hashSet.add(Long.valueOf(savedDialog.dialogId));
            }
        }
        for (int i2 = 0; i2 < this.loadedDialogs.size(); i2++) {
            SavedDialog savedDialog2 = this.loadedDialogs.get(i2);
            if (savedDialog2.pinned && !hashSet.contains(Long.valueOf(savedDialog2.dialogId)) && !savedDialog2.isHidden()) {
                this.allDialogs.add(savedDialog2);
                hashSet.add(Long.valueOf(savedDialog2.dialogId));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < this.loadedDialogs.size(); i3++) {
            SavedDialog savedDialog3 = this.loadedDialogs.get(i3);
            if (!hashSet.contains(Long.valueOf(savedDialog3.dialogId)) && !savedDialog3.isHidden()) {
                arrayList.add(savedDialog3);
                hashSet.add(Long.valueOf(savedDialog3.dialogId));
            }
        }
        if (!this.dialogsEndReached) {
            for (int i4 = 0; i4 < this.cachedDialogs.size(); i4++) {
                SavedDialog savedDialog4 = this.cachedDialogs.get(i4);
                if (!hashSet.contains(Long.valueOf(savedDialog4.dialogId)) && !savedDialog4.isHidden()) {
                    arrayList.add(savedDialog4);
                    hashSet.add(Long.valueOf(savedDialog4.dialogId));
                }
            }
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$updateAllDialogs$0;
                lambda$updateAllDialogs$0 = SavedMessagesController.lambda$updateAllDialogs$0((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
                return lambda$updateAllDialogs$0;
            }
        });
        this.allDialogs.addAll(arrayList);
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedMessagesDialogsUpdate, new Object[0]);
            if (hasDialogs() || !MessagesController.getInstance(this.currentAccount).savedViewAsChats) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).setSavedViewAs(false);
        }
    }

    private void updateDialogsLastMessage(final ArrayList<SavedDialog> arrayList) {
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.this.lambda$updateDialogsLastMessage$9(messagesStorage, arrayList, clientUserId);
            }
        });
    }

    private boolean updatePinnedOrder(ArrayList<SavedDialog> arrayList, ArrayList<Long> arrayList2) {
        if (sameOrder(arrayList2, getCurrentPinnedOrder(arrayList))) {
            return false;
        }
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        while (i < arrayList.size()) {
            SavedDialog savedDialog = arrayList.get(i);
            if (savedDialog.pinned) {
                savedDialog.pinned = false;
                arrayList3.add(savedDialog);
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            SavedDialog savedDialog2 = arrayList.get(i2);
            int indexOf = arrayList2.indexOf(Long.valueOf(savedDialog2.dialogId));
            if (indexOf >= 0) {
                savedDialog2.pinnedOrder = indexOf;
                savedDialog2.pinned = true;
                arrayList4.add(savedDialog2);
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$updatePinnedOrder$4;
                lambda$updatePinnedOrder$4 = SavedMessagesController.lambda$updatePinnedOrder$4((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
                return lambda$updatePinnedOrder$4;
            }
        });
        Collections.sort(arrayList4, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$updatePinnedOrder$5;
                lambda$updatePinnedOrder$5 = SavedMessagesController.lambda$updatePinnedOrder$5((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
                return lambda$updatePinnedOrder$5;
            }
        });
        arrayList.addAll(0, arrayList4);
        return true;
    }

    private void updatePinnedOrderToServer(ArrayList<Long> arrayList) {
        boolean updatePinnedOrder = updatePinnedOrder(this.loadedDialogs, arrayList);
        boolean updatePinnedOrder2 = updatePinnedOrder(this.cachedDialogs, arrayList);
        if (updatePinnedOrder || updatePinnedOrder2) {
            TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
            tL_messages_reorderPinnedSavedDialogs.force = true;
            for (int i = 0; i < arrayList.size(); i++) {
                long longValue = arrayList.get(i).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(longValue);
                tL_inputDialogPeer.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_reorderPinnedSavedDialogs.order.add(tL_inputDialogPeer);
                }
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedSavedDialogs, null);
            update();
        }
    }

    public void checkSavedDialogCount(long j) {
        SavedDialog findSavedDialog = findSavedDialog(j);
        if (findSavedDialog == null || findSavedDialog.messagesCountLoaded) {
            return;
        }
        hasSavedMessages(j, null);
    }

    public void cleanup() {
        this.cachedDialogs.clear();
        this.loadedDialogs.clear();
        this.dialogsLoaded = false;
        this.dialogsCount = 0;
        this.dialogsCountHidden = 0;
        this.dialogsEndReached = false;
        this.loadedCache = true;
        deleteCache();
        this.unsupported = true;
        MessagesController.getMainSettings(this.currentAccount).edit().remove("savedMessagesUnsupported").apply();
    }

    public boolean containsDialog(long j) {
        for (int i = 0; i < this.allDialogs.size(); i++) {
            if (this.allDialogs.get(i).dialogId == j) {
                return true;
            }
        }
        return false;
    }

    public void deleteAllDialogs() {
        this.dialogsCount = 0;
        this.allDialogs.clear();
        this.loadedDialogs.clear();
        this.cachedDialogs.clear();
        update();
    }

    public void deleteDialog(long j) {
        this.dialogsCount -= removeDialog(j);
        update();
    }

    public void deleteDialogs(ArrayList<Long> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            this.dialogsCount -= removeDialog(arrayList.get(i).longValue());
        }
        update();
    }

    public SavedDialog findSavedDialog(long j) {
        return findSavedDialog(this.allDialogs, j);
    }

    public SavedDialog findSavedDialog(ArrayList<SavedDialog> arrayList, long j) {
        for (int i = 0; i < arrayList.size(); i++) {
            SavedDialog savedDialog = arrayList.get(i);
            if (savedDialog.dialogId == j) {
                return savedDialog;
            }
        }
        return null;
    }

    public int getAllCount() {
        return this.dialogsEndReached ? this.allDialogs.size() : this.dialogsLoaded ? this.dialogsCount - this.dialogsCountHidden : this.cachedDialogs.size();
    }

    public int getLoadedCount() {
        return this.loadedDialogs.size();
    }

    public int getMessagesCount(long j) {
        for (int i = 0; i < this.allDialogs.size(); i++) {
            SavedDialog savedDialog = this.allDialogs.get(i);
            if (savedDialog.dialogId == j) {
                return savedDialog.messagesCount;
            }
        }
        return 0;
    }

    public int getPinnedCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.allDialogs.size(); i2++) {
            if (this.allDialogs.get(i2).pinned) {
                i++;
            }
        }
        return i;
    }

    public boolean hasDialogs() {
        if (getAllCount() <= 0) {
            return false;
        }
        return (this.allDialogs.size() == 1 && this.allDialogs.get(0).dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? false : true;
    }

    public void hasSavedMessages(final long j, Utilities.Callback<Boolean> callback) {
        SavedDialog findSavedDialog = findSavedDialog(j);
        if (findSavedDialog != null && findSavedDialog.messagesCount > 0 && findSavedDialog.messagesCountLoaded) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) this.checkMessagesCallbacks.get(j);
        if (arrayList != null) {
            if (callback != null) {
                arrayList.add(callback);
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (callback != null) {
            arrayList2.add(callback);
        }
        this.checkMessagesCallbacks.put(j, arrayList2);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        tL_messages_getSavedHistory.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSavedHistory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SavedMessagesController.this.lambda$hasSavedMessages$15(j, tLObject, tL_error);
            }
        });
    }

    public void loadDialogs(boolean z) {
        SavedDialog savedDialog;
        TLRPC.InputPeer tL_inputPeerEmpty;
        this.loadingCacheOnly = z;
        if (this.dialogsLoading || this.dialogsEndReached || this.loadingCache) {
            return;
        }
        if (!this.loadedCache) {
            loadCache(new Runnable() {
                @Override
                public final void run() {
                    SavedMessagesController.this.lambda$loadDialogs$1();
                }
            });
            return;
        }
        if (z) {
            return;
        }
        this.dialogsLoading = true;
        TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
        if (this.loadedDialogs.isEmpty()) {
            savedDialog = null;
        } else {
            ArrayList<SavedDialog> arrayList = this.loadedDialogs;
            savedDialog = arrayList.get(arrayList.size() - 1);
        }
        if (savedDialog != null) {
            tL_messages_getSavedDialogs.offset_id = savedDialog.top_message_id;
            tL_messages_getSavedDialogs.offset_date = savedDialog.getDate();
            tL_inputPeerEmpty = MessagesController.getInstance(this.currentAccount).getInputPeer(savedDialog.dialogId);
        } else {
            tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
            tL_messages_getSavedDialogs.offset_date = 0;
            tL_inputPeerEmpty = new TLRPC.TL_inputPeerEmpty();
        }
        tL_messages_getSavedDialogs.offset_peer = tL_inputPeerEmpty;
        tL_messages_getSavedDialogs.limit = 20;
        final ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(this.allDialogs.subList(Math.min(this.loadedDialogs.size(), this.allDialogs.size()), Math.min(this.loadedDialogs.size() + tL_messages_getSavedDialogs.limit, this.allDialogs.size())));
        for (int i = 0; i < arrayList2.size(); i++) {
            SavedDialog savedDialog2 = (SavedDialog) arrayList2.get(i);
            long calcHash = MediaDataController.calcHash(tL_messages_getSavedDialogs.hash, savedDialog2.pinned ? 1L : 0L);
            tL_messages_getSavedDialogs.hash = calcHash;
            long calcHash2 = MediaDataController.calcHash(calcHash, Math.abs(savedDialog2.dialogId));
            tL_messages_getSavedDialogs.hash = calcHash2;
            long calcHash3 = MediaDataController.calcHash(calcHash2, savedDialog2.top_message_id);
            tL_messages_getSavedDialogs.hash = calcHash3;
            tL_messages_getSavedDialogs.hash = MediaDataController.calcHash(calcHash3, savedDialog2.getDate());
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSavedDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SavedMessagesController.this.lambda$loadDialogs$3(arrayList2, tLObject, tL_error);
            }
        });
    }

    public void preloadDialogs(boolean z) {
        if (this.dialogsLoaded) {
            return;
        }
        loadDialogs(z);
    }

    public void processUpdate(TLRPC.Update update) {
        if (processUpdateInternal(update)) {
            update();
        }
    }

    public ArrayList<SavedDialog> searchDialogs(String str) {
        String str2;
        ArrayList<SavedDialog> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String translitSafe = AndroidUtilities.translitSafe(str.toLowerCase());
        for (int i = 0; i < this.allDialogs.size(); i++) {
            SavedDialog savedDialog = this.allDialogs.get(i);
            long j = savedDialog.dialogId;
            String str3 = null;
            if (j == 2666000) {
                str2 = LocaleController.getString(R.string.AnonymousForward);
            } else if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                str2 = LocaleController.getString(R.string.MyNotes);
                str3 = LocaleController.getString(R.string.SavedMessages);
            } else {
                long j2 = savedDialog.dialogId;
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                long j3 = savedDialog.dialogId;
                if (j2 >= 0) {
                    str2 = UserObject.getUserName(messagesController.getUser(Long.valueOf(j3)));
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
                    str2 = chat != null ? chat.title : "";
                }
            }
            if (str2 != null) {
                String translitSafe2 = AndroidUtilities.translitSafe(str2.toLowerCase());
                if (!translitSafe2.startsWith(translitSafe)) {
                    if (!translitSafe2.contains(" " + translitSafe)) {
                        if (str3 != null) {
                            String translitSafe3 = AndroidUtilities.translitSafe(str3.toLowerCase());
                            if (!translitSafe3.startsWith(translitSafe)) {
                                if (!translitSafe3.contains(" " + translitSafe)) {
                                }
                            }
                        }
                    }
                }
                arrayList.add(savedDialog);
            }
        }
        return arrayList;
    }

    public void update() {
        updateAllDialogs(true);
        saveCacheSchedule();
    }

    public void update(long r3, org.telegram.tgnet.TLRPC.messages_Messages r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SavedMessagesController.update(long, org.telegram.tgnet.TLRPC$messages_Messages):void");
    }

    public void updateDeleted(LongSparseArray longSparseArray) {
        SavedDialog savedDialog;
        ArrayList<SavedDialog> arrayList = new ArrayList<>();
        boolean z = false;
        for (int i = 0; i < longSparseArray.size(); i++) {
            long keyAt = longSparseArray.keyAt(i);
            ArrayList arrayList2 = (ArrayList) longSparseArray.valueAt(i);
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                i2 = Math.max(i2, ((Integer) arrayList2.get(i3)).intValue());
            }
            int i4 = 0;
            while (true) {
                if (i4 >= this.allDialogs.size()) {
                    savedDialog = null;
                    break;
                } else {
                    if (this.allDialogs.get(i4).dialogId == keyAt) {
                        savedDialog = this.allDialogs.get(i4);
                        break;
                    }
                    i4++;
                }
            }
            if (savedDialog != null) {
                if (savedDialog.messagesCountLoaded) {
                    int max = Math.max(0, savedDialog.messagesCount - arrayList2.size());
                    int i5 = savedDialog.messagesCount;
                    if (max != i5) {
                        savedDialog.messagesCount = Math.max(0, i5 - arrayList2.size());
                        z = true;
                    }
                }
                if (savedDialog.messagesCountLoaded && savedDialog.messagesCount <= 0) {
                    removeDialog(savedDialog.dialogId);
                } else if (savedDialog.top_message_id <= i2) {
                    arrayList.add(savedDialog);
                }
                z = true;
            }
        }
        if (z) {
            if (arrayList.isEmpty()) {
                update();
            } else {
                updateDialogsLastMessage(arrayList);
            }
        }
    }

    public boolean updatePinned(ArrayList<Long> arrayList, boolean z, boolean z2) {
        ArrayList<Long> currentPinnedOrder = getCurrentPinnedOrder(this.allDialogs);
        ArrayList<Long> arrayList2 = new ArrayList<>(currentPinnedOrder);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Long l = arrayList.get(size);
            l.longValue();
            if (z && !arrayList2.contains(l)) {
                arrayList2.add(0, l);
            } else if (!z) {
                arrayList2.remove(l);
            }
        }
        if (arrayList2.size() > (UserConfig.getInstance(this.currentAccount).isPremium() ? MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitPremium : MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitDefault) || sameOrder(currentPinnedOrder, arrayList2)) {
            return false;
        }
        if (!z2) {
            return updatePinnedOrder(this.loadedDialogs, arrayList2) || updatePinnedOrder(this.cachedDialogs, arrayList2);
        }
        updatePinnedOrderToServer(arrayList2);
        return true;
    }

    public boolean updatePinnedOrder(ArrayList<Long> arrayList) {
        ArrayList<Long> currentPinnedOrder = getCurrentPinnedOrder(this.allDialogs);
        if (arrayList.size() > (UserConfig.getInstance(this.currentAccount).isPremium() ? MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitPremium : MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitDefault)) {
            return false;
        }
        if (sameOrder(currentPinnedOrder, arrayList)) {
            return true;
        }
        updatePinnedOrderToServer(arrayList);
        return true;
    }

    public boolean updateSavedDialog(TLRPC.Message message) {
        if (message == null) {
            return false;
        }
        long savedDialogId = MessageObject.getSavedDialogId(UserConfig.getInstance(this.currentAccount).getClientUserId(), message);
        for (int i = 0; i < this.allDialogs.size(); i++) {
            SavedDialog savedDialog = this.allDialogs.get(i);
            if (savedDialog.dialogId == savedDialogId) {
                MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
                savedDialog.message = messageObject;
                savedDialog.top_message_id = messageObject.getId();
                return true;
            }
        }
        return false;
    }

    public boolean updateSavedDialogs(ArrayList<TLRPC.Message> arrayList) {
        boolean z;
        boolean z2;
        if (arrayList == null) {
            return false;
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        LongSparseArray longSparseArray2 = new LongSparseArray();
        new HashSet();
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = arrayList.get(i);
            long savedDialogId = MessageObject.getSavedDialogId(clientUserId, message);
            if (savedDialogId == clientUserId || (message.id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) longSparseArray.get(savedDialogId);
                if (message2 == null || message2.id < message.id) {
                    longSparseArray.put(savedDialogId, message);
                }
                Integer num = (Integer) longSparseArray2.get(savedDialogId);
                longSparseArray2.put(savedDialogId, Integer.valueOf((num == null ? 0 : num.intValue()) + 1));
            }
        }
        boolean z3 = false;
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            long keyAt = longSparseArray.keyAt(i2);
            TLRPC.Message message3 = (TLRPC.Message) longSparseArray.valueAt(i2);
            Integer num2 = (Integer) longSparseArray2.get(keyAt);
            int i3 = 0;
            while (true) {
                if (i3 >= this.cachedDialogs.size()) {
                    z = false;
                    break;
                }
                SavedDialog savedDialog = this.cachedDialogs.get(i3);
                if (savedDialog.dialogId == keyAt) {
                    int i4 = savedDialog.top_message_id;
                    int i5 = message3.id;
                    if (i4 < i5 || (i5 < 0 && message3.date > savedDialog.getDate())) {
                        if (savedDialog.top_message_id < message3.id) {
                            int i6 = 0;
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                if (arrayList.get(i7).id > savedDialog.top_message_id) {
                                    i6++;
                                }
                            }
                            savedDialog.messagesCount += i6;
                        }
                        MessageObject messageObject = new MessageObject(this.currentAccount, message3, false, false);
                        savedDialog.message = messageObject;
                        savedDialog.top_message_id = messageObject.getId();
                        z3 = true;
                    }
                    z = true;
                } else {
                    i3++;
                }
            }
            if (!z) {
                SavedDialog fromMessage = SavedDialog.fromMessage(this.currentAccount, message3);
                if (num2 != null) {
                    fromMessage.messagesCount = num2.intValue();
                }
                this.cachedDialogs.add(fromMessage);
                z3 = true;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= this.loadedDialogs.size()) {
                    z2 = false;
                    break;
                }
                SavedDialog savedDialog2 = this.loadedDialogs.get(i8);
                if (savedDialog2.dialogId == keyAt) {
                    int i9 = savedDialog2.top_message_id;
                    int i10 = message3.id;
                    if (i9 < i10 || (i10 < 0 && message3.date > savedDialog2.getDate())) {
                        if (savedDialog2.top_message_id < message3.id) {
                            int i11 = 0;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                if (arrayList.get(i12).id > savedDialog2.top_message_id) {
                                    i11++;
                                }
                            }
                            savedDialog2.messagesCount += i11;
                        }
                        MessageObject messageObject2 = new MessageObject(this.currentAccount, message3, false, false);
                        savedDialog2.message = messageObject2;
                        savedDialog2.top_message_id = messageObject2.getId();
                        z3 = true;
                    }
                    z2 = true;
                } else {
                    i8++;
                }
            }
            if (!z2) {
                SavedDialog fromMessage2 = SavedDialog.fromMessage(this.currentAccount, message3);
                if (num2 != null) {
                    fromMessage2.messagesCount = num2.intValue();
                }
                this.loadedDialogs.add(fromMessage2);
                z3 = true;
            }
        }
        return z3;
    }

    public boolean updatedDialogCount(long j, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.allDialogs.size()) {
                break;
            }
            SavedDialog savedDialog = this.allDialogs.get(i2);
            if (savedDialog.dialogId != j) {
                i2++;
            } else if (savedDialog.messagesCount != i) {
                savedDialog.messagesCount = i;
                savedDialog.messagesCountLoaded = true;
                return true;
            }
        }
        return false;
    }
}
