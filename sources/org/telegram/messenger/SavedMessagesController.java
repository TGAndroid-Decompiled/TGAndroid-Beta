package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
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
    private final Runnable saveCacheRunnable = new hi(this, 1);
    private final a0.i checkMessagesCallbacks = new a0.i();

    public static class SavedDialog {
        public long dialogId;
        private int lastDate;
        private int localDate;
        public MessageObject message;
        public int messagesCount;
        public boolean messagesCountLoaded;
        public boolean pinned;
        private int pinnedOrder;
        public long readInboxMaxId;
        public long readOutboxMaxId;
        public int top_message_id;
        public long unreadCount;

        public static SavedDialog fromMessage(int i10, TLRPC.Message message, boolean z10) {
            SavedDialog savedDialog = new SavedDialog();
            savedDialog.dialogId = MessageObject.getSavedDialogId(UserConfig.getInstance(i10).getClientUserId(), message);
            savedDialog.pinned = false;
            savedDialog.top_message_id = message.f17216id;
            savedDialog.message = new MessageObject(i10, message, null, null, null, null, null, false, false, 0L, false, false, z10);
            return savedDialog;
        }

        public static SavedDialog fromTL(int i10, TLRPC.savedDialog saveddialog, ArrayList<TLRPC.Message> arrayList, boolean z10) {
            TLRPC.Message message;
            SavedDialog savedDialog = new SavedDialog();
            savedDialog.dialogId = DialogObject.getPeerDialogId(saveddialog.peer);
            savedDialog.pinned = saveddialog.pinned;
            savedDialog.top_message_id = saveddialog.top_message;
            savedDialog.unreadCount = saveddialog.unread_count;
            savedDialog.readInboxMaxId = saveddialog.read_inbox_max_id;
            savedDialog.readOutboxMaxId = saveddialog.read_outbox_max_id;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    message = arrayList.get(i11);
                    if (savedDialog.top_message_id == message.f17216id) {
                        break;
                    }
                    i11++;
                } else {
                    message = null;
                    break;
                }
            }
            TLRPC.Message message2 = message;
            if (message2 != null) {
                savedDialog.message = new MessageObject(i10, message2, null, null, null, null, null, false, false, 0L, false, false, z10);
            }
            return savedDialog;
        }

        private int getDateInternal() {
            TLRPC.Message message;
            MessageObject messageObject = this.message;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                if ((message.flags & 32768) != 0) {
                    return message.edit_date;
                }
                return message.date;
            }
            return this.localDate;
        }

        public int getDate() {
            int dateInternal = getDateInternal();
            this.lastDate = dateInternal;
            return dateInternal;
        }

        public boolean isHidden() {
            TLRPC.Message message;
            MessageObject messageObject = this.message;
            if (messageObject != null && (message = messageObject.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                return true;
            }
            return false;
        }
    }

    public SavedMessagesController(int i10) {
        this.currentAccount = i10;
        this.unsupported = MessagesController.getMainSettings(i10).getBoolean("savedMessagesUnsupported", true);
    }

    private void deleteCache() {
        if (this.saving) {
            return;
        }
        this.saving = true;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new eh(6, this, messagesStorage));
    }

    private ArrayList<Long> getCurrentPinnedOrder(ArrayList<SavedDialog> arrayList) {
        ArrayList<Long> arrayList2 = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            SavedDialog savedDialog = arrayList.get(i10);
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
        for (int i10 = 0; i10 < this.loadedDialogs.size(); i10++) {
            SavedDialog savedDialog2 = this.loadedDialogs.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < this.cachedDialogs.size()) {
                    savedDialog = this.cachedDialogs.get(i11);
                    if (savedDialog.dialogId == savedDialog2.dialogId) {
                        break;
                    }
                    i11++;
                } else {
                    savedDialog = null;
                    break;
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
            SQLitePreparedStatement executeFast = messagesStorage.getDatabase().executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
            executeFast.requery();
            executeFast.bindLong(1, 0L);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new hi(this, 2));
    }

    public void lambda$hasSavedMessages$14(TLObject tLObject, long j3) {
        boolean z10;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int size = messages_messages.messages.size();
            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            if (size > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (size > 0) {
                if (!updatedDialogCount(j3, size, true)) {
                    if (!messages_messages.messages.isEmpty()) {
                        SavedDialog fromMessage = SavedDialog.fromMessage(this.currentAccount, messages_messages.messages.get(0), true);
                        fromMessage.messagesCount = size;
                        fromMessage.messagesCountLoaded = true;
                        this.cachedDialogs.add(fromMessage);
                        update();
                    }
                } else {
                    update();
                }
            }
            ArrayList arrayList = (ArrayList) this.checkMessagesCallbacks.f(j3);
            this.checkMessagesCallbacks.l(j3);
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((Utilities.Callback) arrayList.get(i10)).run(Boolean.valueOf(z10));
                }
            }
        }
    }

    public void lambda$hasSavedMessages$15(long j3, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new g4(this, tLObject, j3, 26));
    }

    public void lambda$loadCache$6(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.loadingCache = false;
        this.loadedCache = true;
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList2, true);
        org.telegram.ui.Components.p5.h(this.currentAccount).d(arrayList3);
        this.cachedDialogs.clear();
        this.cachedDialogs.addAll(arrayList4);
        updateAllDialogs(true);
        if (runnable != null && !this.loadingCacheOnly) {
            runnable.run();
        }
    }

    public void lambda$loadCache$7(org.telegram.messenger.MessagesStorage r36, long r37, java.lang.Runnable r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SavedMessagesController.lambda$loadCache$7(org.telegram.messenger.MessagesStorage, long, java.lang.Runnable):void");
    }

    public void lambda$loadDialogs$1() {
        loadDialogs(false);
    }

    public void lambda$loadDialogs$2(TLObject tLObject, ArrayList arrayList, TLRPC.TL_error tL_error) {
        boolean z10;
        boolean z11;
        boolean z12 = this.unsupported;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            this.dialogsLoaded = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_savedDialogs.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_messages_savedDialogs.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            MessagesStorage.getInstance(this.currentAccount).putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            for (int i10 = 0; i10 < tL_messages_savedDialogs.dialogs.size(); i10++) {
                SavedDialog fromTL = SavedDialog.fromTL(this.currentAccount, tL_messages_savedDialogs.dialogs.get(i10), tL_messages_savedDialogs.messages, true);
                int i11 = 0;
                while (true) {
                    if (i11 >= this.cachedDialogs.size()) {
                        break;
                    } else if (this.cachedDialogs.get(i11).dialogId == fromTL.dialogId) {
                        fromTL.messagesCount = this.cachedDialogs.get(i11).messagesCount;
                        this.cachedDialogs.get(i11).pinned = fromTL.pinned;
                        break;
                    } else {
                        i11++;
                    }
                }
                int i12 = 0;
                while (true) {
                    if (i12 < this.loadedDialogs.size()) {
                        if (this.loadedDialogs.get(i12).dialogId == fromTL.dialogId) {
                            break;
                        }
                        i12++;
                    } else {
                        this.loadedDialogs.add(fromTL);
                        if (fromTL.isHidden()) {
                            this.dialogsCountHidden++;
                        }
                    }
                }
            }
            this.dialogsEndReached = true;
            this.dialogsCount = tL_messages_savedDialogs.dialogs.size();
            updateAllDialogs(true);
            saveCacheSchedule();
            this.unsupported = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            this.dialogsLoaded = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_savedDialogsSlice.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_messages_savedDialogsSlice.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            MessagesStorage.getInstance(this.currentAccount).putMessages(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i13 = 0; i13 < tL_messages_savedDialogsSlice.dialogs.size(); i13++) {
                SavedDialog fromTL2 = SavedDialog.fromTL(this.currentAccount, tL_messages_savedDialogsSlice.dialogs.get(i13), tL_messages_savedDialogsSlice.messages, true);
                int i14 = 0;
                while (true) {
                    if (i14 >= this.cachedDialogs.size()) {
                        break;
                    } else if (this.cachedDialogs.get(i14).dialogId == fromTL2.dialogId) {
                        fromTL2.messagesCount = this.cachedDialogs.get(i14).messagesCount;
                        this.cachedDialogs.get(i14).pinned = fromTL2.pinned;
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = 0;
                while (true) {
                    if (i15 < this.loadedDialogs.size()) {
                        if (this.loadedDialogs.get(i15).dialogId == fromTL2.dialogId) {
                            break;
                        }
                        i15++;
                    } else {
                        this.loadedDialogs.add(fromTL2);
                        if (fromTL2.isHidden()) {
                            this.dialogsCountHidden++;
                        }
                    }
                }
            }
            this.dialogsCount = tL_messages_savedDialogsSlice.count;
            if (this.loadedDialogs.size() + getPinnedCount() < this.dialogsCount && tL_messages_savedDialogsSlice.dialogs.size() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.dialogsEndReached = z11;
            updateAllDialogs(true);
            saveCacheSchedule();
            this.unsupported = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            this.dialogsLoaded = true;
            this.loadedDialogs.addAll(arrayList);
            this.dialogsCount = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            this.dialogsCountHidden = 0;
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                if (((SavedDialog) arrayList.get(i16)).isHidden()) {
                    this.dialogsCountHidden++;
                }
            }
            boolean z13 = this.dialogsEndReached;
            if (this.loadedDialogs.size() >= this.dialogsCount) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.dialogsEndReached = z10;
            this.unsupported = false;
            if (z10 && !z13) {
                updateAllDialogs(true);
            }
        } else if (tL_error != null) {
            this.dialogsLoaded = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                this.unsupported = true;
            }
        }
        if (this.unsupported != z12) {
            MessagesController.getMainSettings(this.currentAccount).edit().putBoolean("savedMessagesUnsupported", this.unsupported).apply();
        }
        this.dialogsLoading = false;
    }

    public void lambda$loadDialogs$3(ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ii(this, tLObject, arrayList, tL_error, 0));
    }

    public void lambda$saveCache$10() {
        this.saving = false;
    }

    public void lambda$saveCache$11(org.telegram.messenger.MessagesStorage r10, java.util.ArrayList r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SavedMessagesController.lambda$saveCache$11(org.telegram.messenger.MessagesStorage, java.util.ArrayList):void");
    }

    public static int lambda$updateAllDialogs$0(SavedDialog savedDialog, SavedDialog savedDialog2) {
        return savedDialog2.getDate() - savedDialog.getDate();
    }

    public void lambda$updateDialogsLastMessage$8(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.i iVar) {
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList2, true);
        org.telegram.ui.Components.p5.h(this.currentAccount).d(arrayList3);
        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
            removeDialog(((Long) arrayList4.get(i10)).longValue());
        }
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            long j3 = iVar.j(i11);
            MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC.Message) iVar.n(i11), null, null, null, null, null, false, false, 0L, false, false, true);
            for (int i12 = 0; i12 < this.loadedDialogs.size(); i12++) {
                SavedDialog savedDialog = this.loadedDialogs.get(i12);
                if (savedDialog.dialogId == j3) {
                    savedDialog.top_message_id = messageObject.getId();
                    savedDialog.message = messageObject;
                }
            }
            for (int i13 = 0; i13 < this.cachedDialogs.size(); i13++) {
                SavedDialog savedDialog2 = this.cachedDialogs.get(i13);
                if (savedDialog2.dialogId == j3) {
                    savedDialog2.top_message_id = messageObject.getId();
                    savedDialog2.message = messageObject;
                }
            }
        }
        update();
    }

    public void lambda$updateDialogsLastMessage$9(org.telegram.messenger.MessagesStorage r20, java.util.ArrayList r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SavedMessagesController.lambda$updateDialogsLastMessage$9(org.telegram.messenger.MessagesStorage, java.util.ArrayList, long):void");
    }

    public static int lambda$updatePinnedOrder$4(SavedDialog savedDialog, SavedDialog savedDialog2) {
        return savedDialog2.getDate() - savedDialog.getDate();
    }

    public static int lambda$updatePinnedOrder$5(SavedDialog savedDialog, SavedDialog savedDialog2) {
        return savedDialog.pinnedOrder - savedDialog2.pinnedOrder;
    }

    private void loadCache(Runnable runnable) {
        if (this.loadingCache) {
            return;
        }
        this.loadingCache = true;
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new bi.ua(this, messagesStorage, clientUserId, runnable, 22));
    }

    public static void openSavedMessages() {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(R.getCurrentAccount()).getClientUserId());
        R.presentFragment(new eo(bundle));
    }

    public static void openSavedMessagesReminders() {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(R.getCurrentAccount()).getClientUserId());
        bundle.putInt("chatMode", 1);
        R.presentFragment(new eo(bundle));
    }

    private boolean processUpdateInternal(TLRPC.Update update) {
        if (update instanceof TL_update.TL_updateSavedDialogPinned) {
            TL_update.TL_updateSavedDialogPinned tL_updateSavedDialogPinned = (TL_update.TL_updateSavedDialogPinned) update;
            TLRPC.DialogPeer dialogPeer = tL_updateSavedDialogPinned.peer;
            if (!(dialogPeer instanceof TLRPC.TL_dialogPeer)) {
                return false;
            }
            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_dialogPeer) dialogPeer).peer);
            ArrayList<Long> arrayList = new ArrayList<>();
            arrayList.add(Long.valueOf(peerDialogId));
            return updatePinned(arrayList, tL_updateSavedDialogPinned.pinned, false);
        } else if (!(update instanceof TL_update.TL_updatePinnedSavedDialogs)) {
            return false;
        } else {
            TL_update.TL_updatePinnedSavedDialogs tL_updatePinnedSavedDialogs = (TL_update.TL_updatePinnedSavedDialogs) update;
            ArrayList<Long> arrayList2 = new ArrayList<>(tL_updatePinnedSavedDialogs.order.size());
            for (int i10 = 0; i10 < tL_updatePinnedSavedDialogs.order.size(); i10++) {
                TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i10);
                if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                    arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
                }
            }
            boolean updatePinnedOrder = updatePinnedOrder(this.loadedDialogs, arrayList2);
            boolean updatePinnedOrder2 = updatePinnedOrder(this.cachedDialogs, arrayList2);
            if (!updatePinnedOrder && !updatePinnedOrder2) {
                return false;
            }
            return true;
        }
    }

    private int removeDialog(long j3) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.allDialogs.size()) {
            if (this.allDialogs.get(i11).dialogId == j3) {
                this.allDialogs.remove(i11);
                i12++;
                i11--;
            }
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.loadedDialogs.size()) {
            if (this.loadedDialogs.get(i13).dialogId == j3) {
                this.loadedDialogs.remove(i13);
                i14++;
                i13--;
            }
            i13++;
        }
        while (i10 < this.cachedDialogs.size()) {
            if (this.cachedDialogs.get(i10).dialogId == j3) {
                this.cachedDialogs.remove(i10);
                i10--;
            }
            i10++;
        }
        return Math.max(i12, i14);
    }

    private boolean sameOrder(ArrayList<Long> arrayList, ArrayList<Long> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (!Objects.equals(arrayList.get(i10), arrayList2.get(i10))) {
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
        ArrayList arrayList = new ArrayList(this.allDialogs);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new g9(21, this, messagesStorage, arrayList));
    }

    private void saveCacheSchedule() {
        AndroidUtilities.cancelRunOnUIThread(this.saveCacheRunnable);
        AndroidUtilities.runOnUIThread(this.saveCacheRunnable, 450L);
    }

    private void updateAllDialogs(boolean z10) {
        this.allDialogs.clear();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.cachedDialogs.size(); i10++) {
            SavedDialog savedDialog = this.cachedDialogs.get(i10);
            if (savedDialog.pinned && !hashSet.contains(Long.valueOf(savedDialog.dialogId)) && !savedDialog.isHidden()) {
                this.allDialogs.add(savedDialog);
                hashSet.add(Long.valueOf(savedDialog.dialogId));
            }
        }
        for (int i11 = 0; i11 < this.loadedDialogs.size(); i11++) {
            SavedDialog savedDialog2 = this.loadedDialogs.get(i11);
            if (savedDialog2.pinned && !hashSet.contains(Long.valueOf(savedDialog2.dialogId)) && !savedDialog2.isHidden()) {
                this.allDialogs.add(savedDialog2);
                hashSet.add(Long.valueOf(savedDialog2.dialogId));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < this.loadedDialogs.size(); i12++) {
            SavedDialog savedDialog3 = this.loadedDialogs.get(i12);
            if (!hashSet.contains(Long.valueOf(savedDialog3.dialogId)) && !savedDialog3.isHidden()) {
                arrayList.add(savedDialog3);
                hashSet.add(Long.valueOf(savedDialog3.dialogId));
            }
        }
        if (!this.dialogsEndReached) {
            for (int i13 = 0; i13 < this.cachedDialogs.size(); i13++) {
                SavedDialog savedDialog4 = this.cachedDialogs.get(i13);
                if (!hashSet.contains(Long.valueOf(savedDialog4.dialogId)) && !savedDialog4.isHidden()) {
                    arrayList.add(savedDialog4);
                    hashSet.add(Long.valueOf(savedDialog4.dialogId));
                }
            }
        }
        Collections.sort(arrayList, new ji(0));
        this.allDialogs.addAll(arrayList);
        if (z10) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedMessagesDialogsUpdate, new Object[0]);
            if (!hasDialogs() && MessagesController.getInstance(this.currentAccount).savedViewAsChats) {
                MessagesController.getInstance(this.currentAccount).setSavedViewAs(false);
            }
        }
    }

    private void updateDialogsLastMessage(ArrayList<SavedDialog> arrayList) {
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new bi.ua((Object) this, messagesStorage, (Object) arrayList, clientUserId, 21));
    }

    private void updatePinnedOrderToServer(ArrayList<Long> arrayList) {
        boolean updatePinnedOrder = updatePinnedOrder(this.loadedDialogs, arrayList);
        boolean updatePinnedOrder2 = updatePinnedOrder(this.cachedDialogs, arrayList);
        if (!updatePinnedOrder && !updatePinnedOrder2) {
            return;
        }
        TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
        tL_messages_reorderPinnedSavedDialogs.force = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long longValue = arrayList.get(i10).longValue();
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

    public void checkSavedDialogCount(long j3) {
        SavedDialog findSavedDialog = findSavedDialog(j3);
        if (findSavedDialog != null && !findSavedDialog.messagesCountLoaded) {
            hasSavedMessages(j3, null);
        }
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

    public boolean containsDialog(long j3) {
        for (int i10 = 0; i10 < this.allDialogs.size(); i10++) {
            if (this.allDialogs.get(i10).dialogId == j3) {
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

    public void deleteDialog(long j3) {
        this.dialogsCount -= removeDialog(j3);
        update();
    }

    public void deleteDialogs(ArrayList<Long> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.dialogsCount -= removeDialog(arrayList.get(i10).longValue());
        }
        update();
    }

    public SavedDialog findSavedDialog(long j3) {
        return findSavedDialog(this.allDialogs, j3);
    }

    public int getAllCount() {
        if (this.dialogsEndReached) {
            return this.allDialogs.size();
        }
        if (this.dialogsLoaded) {
            return this.dialogsCount - this.dialogsCountHidden;
        }
        return this.cachedDialogs.size();
    }

    public int getLoadedCount() {
        return this.loadedDialogs.size();
    }

    public int getMessagesCount(long j3) {
        for (int i10 = 0; i10 < this.allDialogs.size(); i10++) {
            SavedDialog savedDialog = this.allDialogs.get(i10);
            if (savedDialog.dialogId == j3) {
                return savedDialog.messagesCount;
            }
        }
        return 0;
    }

    public int getPinnedCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.allDialogs.size(); i11++) {
            if (this.allDialogs.get(i11).pinned) {
                i10++;
            }
        }
        return i10;
    }

    public boolean hasDialogs() {
        if (getAllCount() <= 0) {
            return false;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if (this.allDialogs.size() == 1 && this.allDialogs.get(0).dialogId == clientUserId) {
            return false;
        }
        return true;
    }

    public void hasSavedMessages(long j3, Utilities.Callback<Boolean> callback) {
        SavedDialog findSavedDialog = findSavedDialog(j3);
        if (findSavedDialog != null && findSavedDialog.messagesCount > 0 && findSavedDialog.messagesCountLoaded) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) this.checkMessagesCallbacks.f(j3);
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
        this.checkMessagesCallbacks.k(arrayList2, j3);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        tL_messages_getSavedHistory.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSavedHistory, new p1(this, j3, 2));
    }

    public boolean isLoading() {
        return this.dialogsLoading;
    }

    public void loadDialogs(boolean z10) {
        SavedDialog savedDialog;
        long j3;
        this.loadingCacheOnly = z10;
        if (!this.dialogsLoading && !this.dialogsEndReached && !this.loadingCache) {
            if (!this.loadedCache) {
                loadCache(new hi(this, 4));
            } else if (!z10) {
                this.dialogsLoading = true;
                TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
                if (this.loadedDialogs.isEmpty()) {
                    savedDialog = null;
                } else {
                    savedDialog = (SavedDialog) hc.b.i(1, this.loadedDialogs);
                }
                if (savedDialog != null) {
                    tL_messages_getSavedDialogs.offset_id = savedDialog.top_message_id;
                    tL_messages_getSavedDialogs.offset_date = savedDialog.getDate();
                    tL_messages_getSavedDialogs.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(savedDialog.dialogId);
                } else {
                    tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
                    tL_messages_getSavedDialogs.offset_date = 0;
                    tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                tL_messages_getSavedDialogs.limit = 20;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.allDialogs.subList(Math.min(this.loadedDialogs.size(), this.allDialogs.size()), Math.min(this.loadedDialogs.size() + tL_messages_getSavedDialogs.limit, this.allDialogs.size())));
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    SavedDialog savedDialog2 = (SavedDialog) arrayList.get(i10);
                    long j10 = tL_messages_getSavedDialogs.hash;
                    if (savedDialog2.pinned) {
                        j3 = 1;
                    } else {
                        j3 = 0;
                    }
                    long calcHash = MediaDataController.calcHash(j10, j3);
                    tL_messages_getSavedDialogs.hash = calcHash;
                    long calcHash2 = MediaDataController.calcHash(calcHash, Math.abs(savedDialog2.dialogId));
                    tL_messages_getSavedDialogs.hash = calcHash2;
                    long calcHash3 = MediaDataController.calcHash(calcHash2, savedDialog2.top_message_id);
                    tL_messages_getSavedDialogs.hash = calcHash3;
                    tL_messages_getSavedDialogs.hash = MediaDataController.calcHash(calcHash3, savedDialog2.getDate());
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSavedDialogs, new v1(8, this, arrayList));
            }
        }
    }

    public void preloadDialogs(boolean z10) {
        if (!this.dialogsLoaded) {
            loadDialogs(z10);
        }
    }

    public void processUpdate(TLRPC.Update update) {
        if (processUpdateInternal(update)) {
            update();
        }
    }

    public ArrayList<SavedDialog> searchDialogs(String str) {
        String str2;
        ArrayList<SavedDialog> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            String translitSafe = AndroidUtilities.translitSafe(str.toLowerCase());
            for (int i10 = 0; i10 < this.allDialogs.size(); i10++) {
                SavedDialog savedDialog = this.allDialogs.get(i10);
                long j3 = savedDialog.dialogId;
                String str3 = null;
                if (j3 == 2666000) {
                    str2 = LocaleController.getString(R.string.AnonymousForward);
                } else if (j3 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    str2 = LocaleController.getString(R.string.MyNotes);
                    str3 = LocaleController.getString(R.string.SavedMessages);
                } else if (savedDialog.dialogId >= 0) {
                    str2 = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(savedDialog.dialogId)));
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-savedDialog.dialogId));
                    if (chat != null) {
                        str2 = chat.title;
                    } else {
                        str2 = "";
                    }
                }
                if (str2 != null) {
                    String translitSafe2 = AndroidUtilities.translitSafe(str2.toLowerCase());
                    if (!translitSafe2.startsWith(translitSafe) && !a2.w(" ", translitSafe, translitSafe2)) {
                        if (str3 != null) {
                            String translitSafe3 = AndroidUtilities.translitSafe(str3.toLowerCase());
                            if (translitSafe3.startsWith(translitSafe) || a2.w(" ", translitSafe, translitSafe3)) {
                                arrayList.add(savedDialog);
                            }
                        }
                    } else {
                        arrayList.add(savedDialog);
                    }
                }
            }
        }
        return arrayList;
    }

    public void update(long r5, org.telegram.tgnet.TLRPC.messages_Messages r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SavedMessagesController.update(long, org.telegram.tgnet.TLRPC$messages_Messages):void");
    }

    public void updateDeleted(a0.i iVar) {
        SavedDialog savedDialog;
        ArrayList<SavedDialog> arrayList = new ArrayList<>();
        boolean z10 = false;
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            long j3 = iVar.j(i10);
            ArrayList arrayList2 = (ArrayList) iVar.n(i10);
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                i11 = Math.max(i11, ((Integer) arrayList2.get(i12)).intValue());
            }
            int i13 = 0;
            while (true) {
                if (i13 < this.allDialogs.size()) {
                    if (this.allDialogs.get(i13).dialogId == j3) {
                        savedDialog = this.allDialogs.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    savedDialog = null;
                    break;
                }
            }
            if (savedDialog != null) {
                if (savedDialog.messagesCountLoaded) {
                    int max = Math.max(0, savedDialog.messagesCount - arrayList2.size());
                    int i14 = savedDialog.messagesCount;
                    if (max != i14) {
                        savedDialog.messagesCount = Math.max(0, i14 - arrayList2.size());
                        z10 = true;
                    }
                }
                if (savedDialog.messagesCountLoaded && savedDialog.messagesCount <= 0) {
                    removeDialog(savedDialog.dialogId);
                } else if (savedDialog.top_message_id <= i11) {
                    arrayList.add(savedDialog);
                }
                z10 = true;
            }
        }
        if (z10) {
            if (!arrayList.isEmpty()) {
                updateDialogsLastMessage(arrayList);
            } else {
                update();
            }
        }
    }

    public boolean updatePinned(ArrayList<Long> arrayList, boolean z10, boolean z11) {
        int i10;
        ArrayList<Long> currentPinnedOrder = getCurrentPinnedOrder(this.allDialogs);
        ArrayList<Long> arrayList2 = new ArrayList<>(currentPinnedOrder);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Long l4 = arrayList.get(size);
            l4.longValue();
            if (z10 && !arrayList2.contains(l4)) {
                arrayList2.add(0, l4);
            } else if (!z10) {
                arrayList2.remove(l4);
            }
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            i10 = MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitPremium;
        } else {
            i10 = MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitDefault;
        }
        if (arrayList2.size() > i10 || sameOrder(currentPinnedOrder, arrayList2)) {
            return false;
        }
        if (z11) {
            updatePinnedOrderToServer(arrayList2);
            return true;
        }
        boolean updatePinnedOrder = updatePinnedOrder(this.loadedDialogs, arrayList2);
        boolean updatePinnedOrder2 = updatePinnedOrder(this.cachedDialogs, arrayList2);
        if (updatePinnedOrder || updatePinnedOrder2) {
            return true;
        }
        return false;
    }

    public boolean updatePinnedOrder(ArrayList<Long> arrayList) {
        int i10;
        ArrayList<Long> currentPinnedOrder = getCurrentPinnedOrder(this.allDialogs);
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            i10 = MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitPremium;
        } else {
            i10 = MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitDefault;
        }
        if (arrayList.size() > i10) {
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
        for (int i10 = 0; i10 < this.allDialogs.size(); i10++) {
            SavedDialog savedDialog = this.allDialogs.get(i10);
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
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int intValue;
        if (arrayList == null) {
            return false;
        }
        a0.i iVar = new a0.i();
        a0.i iVar2 = new a0.i();
        new HashSet();
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.Message message = arrayList.get(i12);
            long savedDialogId = MessageObject.getSavedDialogId(clientUserId, message);
            if (savedDialogId == clientUserId || (message.f17216id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) iVar.f(savedDialogId);
                if (message2 == null || message2.f17216id < message.f17216id) {
                    iVar.k(message, savedDialogId);
                }
                Integer num = (Integer) iVar2.f(savedDialogId);
                if (num == null) {
                    intValue = 0;
                } else {
                    intValue = num.intValue();
                }
                iVar2.k(Integer.valueOf(intValue + 1), savedDialogId);
            }
        }
        boolean z12 = false;
        for (int i13 = 0; i13 < iVar.m(); i13++) {
            long j3 = iVar.j(i13);
            TLRPC.Message message3 = (TLRPC.Message) iVar.n(i13);
            Integer num2 = (Integer) iVar2.f(j3);
            int i14 = 0;
            while (true) {
                if (i14 < this.cachedDialogs.size()) {
                    SavedDialog savedDialog = this.cachedDialogs.get(i14);
                    if (savedDialog.dialogId == j3) {
                        int i15 = savedDialog.top_message_id;
                        int i16 = message3.f17216id;
                        if (i15 < i16 || (i16 < 0 && message3.date > savedDialog.getDate())) {
                            if (savedDialog.top_message_id < message3.f17216id) {
                                int i17 = 0;
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    if (arrayList.get(i18).f17216id > savedDialog.top_message_id) {
                                        i17++;
                                    }
                                }
                                savedDialog.messagesCount += i17;
                            }
                            MessageObject messageObject = new MessageObject(this.currentAccount, message3, false, false);
                            savedDialog.message = messageObject;
                            savedDialog.top_message_id = messageObject.getId();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i11 = Math.max(num2.intValue(), savedDialog.messagesCount);
                        } else {
                            i11 = savedDialog.messagesCount;
                        }
                        num2 = Integer.valueOf(i11);
                        z10 = true;
                    } else {
                        i14++;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                SavedDialog fromMessage = SavedDialog.fromMessage(this.currentAccount, message3, true);
                if (num2 != null) {
                    fromMessage.messagesCount = num2.intValue();
                }
                this.cachedDialogs.add(fromMessage);
                z12 = true;
            }
            int i19 = 0;
            while (true) {
                if (i19 < this.loadedDialogs.size()) {
                    SavedDialog savedDialog2 = this.loadedDialogs.get(i19);
                    if (savedDialog2.dialogId == j3) {
                        int i20 = savedDialog2.top_message_id;
                        int i21 = message3.f17216id;
                        if (i20 < i21 || (i21 < 0 && message3.date > savedDialog2.getDate())) {
                            if (savedDialog2.top_message_id < message3.f17216id) {
                                int i22 = 0;
                                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                                    if (arrayList.get(i23).f17216id > savedDialog2.top_message_id) {
                                        i22++;
                                    }
                                }
                                savedDialog2.messagesCount += i22;
                            }
                            MessageObject messageObject2 = new MessageObject(this.currentAccount, message3, false, false);
                            savedDialog2.message = messageObject2;
                            savedDialog2.top_message_id = messageObject2.getId();
                            z12 = true;
                        }
                        if (num2 != null) {
                            i10 = Math.max(num2.intValue(), savedDialog2.messagesCount);
                        } else {
                            i10 = savedDialog2.messagesCount;
                        }
                        num2 = Integer.valueOf(i10);
                        z11 = true;
                    } else {
                        i19++;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                SavedDialog fromMessage2 = SavedDialog.fromMessage(this.currentAccount, message3, true);
                if (num2 != null) {
                    fromMessage2.messagesCount = num2.intValue();
                }
                this.loadedDialogs.add(fromMessage2);
                z12 = true;
            }
        }
        return z12;
    }

    public boolean updatedDialogCount(long j3, int i10) {
        return updatedDialogCount(j3, i10, false);
    }

    public SavedDialog findSavedDialog(ArrayList<SavedDialog> arrayList, long j3) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            SavedDialog savedDialog = arrayList.get(i10);
            if (savedDialog.dialogId == j3) {
                return savedDialog;
            }
        }
        return null;
    }

    public boolean updatedDialogCount(long j3, int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.allDialogs.size()) {
                break;
            }
            SavedDialog savedDialog = this.allDialogs.get(i11);
            if (savedDialog.dialogId != j3) {
                i11++;
            } else if (savedDialog.messagesCount != i10 || (!savedDialog.messagesCountLoaded && z10)) {
                savedDialog.messagesCount = i10;
                savedDialog.messagesCountLoaded = true;
                return true;
            }
        }
        return false;
    }

    private boolean updatePinnedOrder(ArrayList<SavedDialog> arrayList, ArrayList<Long> arrayList2) {
        if (sameOrder(arrayList2, getCurrentPinnedOrder(arrayList))) {
            return false;
        }
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            SavedDialog savedDialog = arrayList.get(i10);
            if (savedDialog.pinned) {
                savedDialog.pinned = false;
                arrayList3.add(savedDialog);
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            SavedDialog savedDialog2 = arrayList.get(i11);
            int indexOf = arrayList2.indexOf(Long.valueOf(savedDialog2.dialogId));
            if (indexOf >= 0) {
                savedDialog2.pinnedOrder = indexOf;
                savedDialog2.pinned = true;
                arrayList4.add(savedDialog2);
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        Collections.sort(arrayList, new p(28));
        Collections.sort(arrayList4, new p(29));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public void update() {
        updateAllDialogs(true);
        saveCacheSchedule();
    }
}
