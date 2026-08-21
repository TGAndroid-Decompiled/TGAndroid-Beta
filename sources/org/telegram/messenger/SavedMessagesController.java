package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
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
            this.f$0.saveCache();
        }
    };
    private final LongSparseArray checkMessagesCallbacks = new LongSparseArray();

    public SavedMessagesController(int i) {
        this.currentAccount = i;
        this.unsupported = MessagesController.getMainSettings(i).getBoolean("savedMessagesUnsupported", true);
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
                return SavedMessagesController.m984$r8$lambda$xwdCB6KxU3Pc46Gnb89goEExbg((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
            }
        });
        this.allDialogs.addAll(arrayList);
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.savedMessagesDialogsUpdate, new Object[0]);
            if (hasDialogs() || !MessagesController.getInstance(this.currentAccount).savedViewAsChats) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).setSavedViewAs(false);
        }
    }

    public static int m984$r8$lambda$xwdCB6KxU3Pc46Gnb89goEExbg(SavedDialog savedDialog, SavedDialog savedDialog2) {
        return savedDialog2.getDate() - savedDialog.getDate();
    }

    public boolean isLoading() {
        return this.dialogsLoading;
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

    public boolean hasDialogs() {
        if (getAllCount() <= 0) {
            return false;
        }
        return (this.allDialogs.size() == 1 && this.allDialogs.get(0).dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? false : true;
    }

    public int getLoadedCount() {
        return this.loadedDialogs.size();
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

    public ArrayList<SavedDialog> searchDialogs(String str) {
        String userName;
        ArrayList<SavedDialog> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            String strTranslitSafe = AndroidUtilities.translitSafe(str.toLowerCase());
            for (int i = 0; i < this.allDialogs.size(); i++) {
                SavedDialog savedDialog = this.allDialogs.get(i);
                long j = savedDialog.dialogId;
                String string = null;
                if (j == 2666000) {
                    userName = LocaleController.getString(R.string.AnonymousForward);
                } else if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    userName = LocaleController.getString(R.string.MyNotes);
                    string = LocaleController.getString(R.string.SavedMessages);
                } else if (savedDialog.dialogId >= 0) {
                    userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(savedDialog.dialogId)));
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-savedDialog.dialogId));
                    userName = chat != null ? chat.title : "";
                }
                if (userName != null) {
                    String strTranslitSafe2 = AndroidUtilities.translitSafe(userName.toLowerCase());
                    if (strTranslitSafe2.startsWith(strTranslitSafe)) {
                        arrayList.add(savedDialog);
                    } else {
                        if (strTranslitSafe2.contains(" " + strTranslitSafe)) {
                            arrayList.add(savedDialog);
                        } else if (string != null) {
                            String strTranslitSafe3 = AndroidUtilities.translitSafe(string.toLowerCase());
                            if (strTranslitSafe3.startsWith(strTranslitSafe)) {
                                arrayList.add(savedDialog);
                            } else {
                                if (strTranslitSafe3.contains(" " + strTranslitSafe)) {
                                    arrayList.add(savedDialog);
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
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

    public boolean containsDialog(long j) {
        for (int i = 0; i < this.allDialogs.size(); i++) {
            if (this.allDialogs.get(i).dialogId == j) {
                return true;
            }
        }
        return false;
    }

    public void preloadDialogs(boolean z) {
        if (this.dialogsLoaded) {
            return;
        }
        loadDialogs(z);
    }

    public void loadDialogs(boolean z) {
        SavedDialog savedDialog;
        this.loadingCacheOnly = z;
        if (this.dialogsLoading || this.dialogsEndReached || this.loadingCache) {
            return;
        }
        if (!this.loadedCache) {
            loadCache(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.loadDialogs(false);
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
            tL_messages_getSavedDialogs.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(savedDialog.dialogId);
        } else {
            tL_messages_getSavedDialogs.offset_id = Integer.MAX_VALUE;
            tL_messages_getSavedDialogs.offset_date = 0;
            tL_messages_getSavedDialogs.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        tL_messages_getSavedDialogs.limit = 20;
        final ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(this.allDialogs.subList(Math.min(this.loadedDialogs.size(), this.allDialogs.size()), Math.min(this.loadedDialogs.size() + tL_messages_getSavedDialogs.limit, this.allDialogs.size())));
        for (int i = 0; i < arrayList2.size(); i++) {
            SavedDialog savedDialog2 = (SavedDialog) arrayList2.get(i);
            long jCalcHash = MediaDataController.calcHash(tL_messages_getSavedDialogs.hash, savedDialog2.pinned ? 1L : 0L);
            tL_messages_getSavedDialogs.hash = jCalcHash;
            long jCalcHash2 = MediaDataController.calcHash(jCalcHash, Math.abs(savedDialog2.dialogId));
            tL_messages_getSavedDialogs.hash = jCalcHash2;
            long jCalcHash3 = MediaDataController.calcHash(jCalcHash2, savedDialog2.top_message_id);
            tL_messages_getSavedDialogs.hash = jCalcHash3;
            tL_messages_getSavedDialogs.hash = MediaDataController.calcHash(jCalcHash3, savedDialog2.getDate());
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSavedDialogs, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SavedMessagesController.$r8$lambda$neXlGe9KNfdEtejREXK1XCeTFK0(this.f$0, arrayList2, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$neXlGe9KNfdEtejREXK1XCeTFK0(final SavedMessagesController savedMessagesController, final ArrayList arrayList, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        savedMessagesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.$r8$lambda$vdoCIMrXzhYrvdhTGevYxRGaX2Q(this.f$0, tLObject, arrayList, tL_error);
            }
        });
    }

    public static void $r8$lambda$vdoCIMrXzhYrvdhTGevYxRGaX2Q(SavedMessagesController savedMessagesController, TLObject tLObject, ArrayList arrayList, TLRPC.TL_error tL_error) {
        boolean z = savedMessagesController.unsupported;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            savedMessagesController.dialogsLoaded = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            MessagesController.getInstance(savedMessagesController.currentAccount).putUsers(tL_messages_savedDialogs.users, false);
            MessagesController.getInstance(savedMessagesController.currentAccount).putChats(tL_messages_savedDialogs.chats, false);
            MessagesStorage.getInstance(savedMessagesController.currentAccount).putUsersAndChats(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            MessagesStorage.getInstance(savedMessagesController.currentAccount).putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            for (int i = 0; i < tL_messages_savedDialogs.dialogs.size(); i++) {
                SavedDialog savedDialogFromTL = SavedDialog.fromTL(savedMessagesController.currentAccount, tL_messages_savedDialogs.dialogs.get(i), tL_messages_savedDialogs.messages, true);
                for (int i2 = 0; i2 < savedMessagesController.cachedDialogs.size(); i2++) {
                    if (savedMessagesController.cachedDialogs.get(i2).dialogId == savedDialogFromTL.dialogId) {
                        savedDialogFromTL.messagesCount = savedMessagesController.cachedDialogs.get(i2).messagesCount;
                        savedMessagesController.cachedDialogs.get(i2).pinned = savedDialogFromTL.pinned;
                        break;
                    }
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= savedMessagesController.loadedDialogs.size()) {
                        savedMessagesController.loadedDialogs.add(savedDialogFromTL);
                        if (!savedDialogFromTL.isHidden()) {
                            break;
                        }
                        savedMessagesController.dialogsCountHidden++;
                        break;
                    }
                    if (savedMessagesController.loadedDialogs.get(i3).dialogId == savedDialogFromTL.dialogId) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            savedMessagesController.dialogsEndReached = true;
            savedMessagesController.dialogsCount = tL_messages_savedDialogs.dialogs.size();
            savedMessagesController.updateAllDialogs(true);
            savedMessagesController.saveCacheSchedule();
            savedMessagesController.unsupported = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsSlice) {
            savedMessagesController.dialogsLoaded = true;
            TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) tLObject;
            MessagesController.getInstance(savedMessagesController.currentAccount).putUsers(tL_messages_savedDialogsSlice.users, false);
            MessagesController.getInstance(savedMessagesController.currentAccount).putChats(tL_messages_savedDialogsSlice.chats, false);
            MessagesStorage.getInstance(savedMessagesController.currentAccount).putUsersAndChats(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
            MessagesStorage.getInstance(savedMessagesController.currentAccount).putMessages(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 3, 0L);
            for (int i4 = 0; i4 < tL_messages_savedDialogsSlice.dialogs.size(); i4++) {
                SavedDialog savedDialogFromTL2 = SavedDialog.fromTL(savedMessagesController.currentAccount, tL_messages_savedDialogsSlice.dialogs.get(i4), tL_messages_savedDialogsSlice.messages, true);
                for (int i5 = 0; i5 < savedMessagesController.cachedDialogs.size(); i5++) {
                    if (savedMessagesController.cachedDialogs.get(i5).dialogId == savedDialogFromTL2.dialogId) {
                        savedDialogFromTL2.messagesCount = savedMessagesController.cachedDialogs.get(i5).messagesCount;
                        savedMessagesController.cachedDialogs.get(i5).pinned = savedDialogFromTL2.pinned;
                        break;
                    }
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= savedMessagesController.loadedDialogs.size()) {
                        savedMessagesController.loadedDialogs.add(savedDialogFromTL2);
                        if (!savedDialogFromTL2.isHidden()) {
                            break;
                        }
                        savedMessagesController.dialogsCountHidden++;
                        break;
                    }
                    if (savedMessagesController.loadedDialogs.get(i6).dialogId == savedDialogFromTL2.dialogId) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            savedMessagesController.dialogsCount = tL_messages_savedDialogsSlice.count;
            savedMessagesController.dialogsEndReached = savedMessagesController.getPinnedCount() + savedMessagesController.loadedDialogs.size() >= savedMessagesController.dialogsCount || tL_messages_savedDialogsSlice.dialogs.size() == 0;
            savedMessagesController.updateAllDialogs(true);
            savedMessagesController.saveCacheSchedule();
            savedMessagesController.unsupported = false;
        } else if (tLObject instanceof TLRPC.TL_messages_savedDialogsNotModified) {
            savedMessagesController.dialogsLoaded = true;
            savedMessagesController.loadedDialogs.addAll(arrayList);
            savedMessagesController.dialogsCount = ((TLRPC.TL_messages_savedDialogsNotModified) tLObject).count;
            savedMessagesController.dialogsCountHidden = 0;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((SavedDialog) arrayList.get(i7)).isHidden()) {
                    savedMessagesController.dialogsCountHidden++;
                }
            }
            boolean z2 = savedMessagesController.dialogsEndReached;
            boolean z3 = savedMessagesController.loadedDialogs.size() >= savedMessagesController.dialogsCount;
            savedMessagesController.dialogsEndReached = z3;
            savedMessagesController.unsupported = false;
            if (z3 && !z2) {
                savedMessagesController.updateAllDialogs(true);
            }
        } else if (tL_error != null) {
            savedMessagesController.dialogsLoaded = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                savedMessagesController.unsupported = true;
            }
        }
        if (savedMessagesController.unsupported != z) {
            MessagesController.getMainSettings(savedMessagesController.currentAccount).edit().putBoolean("savedMessagesUnsupported", savedMessagesController.unsupported).apply();
        }
        savedMessagesController.dialogsLoading = false;
    }

    public boolean updateSavedDialogs(ArrayList<TLRPC.Message> arrayList) {
        boolean z;
        boolean z2;
        int iMax;
        int iMax2;
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
            long jKeyAt = longSparseArray.keyAt(i2);
            TLRPC.Message message3 = (TLRPC.Message) longSparseArray.valueAt(i2);
            Integer numValueOf = (Integer) longSparseArray2.get(jKeyAt);
            int i3 = 0;
            while (true) {
                if (i3 >= this.cachedDialogs.size()) {
                    z = false;
                    break;
                }
                SavedDialog savedDialog = this.cachedDialogs.get(i3);
                if (savedDialog.dialogId == jKeyAt) {
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
                    if (numValueOf != null) {
                        iMax2 = Math.max(numValueOf.intValue(), savedDialog.messagesCount);
                    } else {
                        iMax2 = savedDialog.messagesCount;
                    }
                    numValueOf = Integer.valueOf(iMax2);
                    z = true;
                    break;
                }
                i3++;
            }
            if (!z) {
                SavedDialog savedDialogFromMessage = SavedDialog.fromMessage(this.currentAccount, message3, true);
                if (numValueOf != null) {
                    savedDialogFromMessage.messagesCount = numValueOf.intValue();
                }
                this.cachedDialogs.add(savedDialogFromMessage);
                z3 = true;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= this.loadedDialogs.size()) {
                    z2 = false;
                    break;
                }
                SavedDialog savedDialog2 = this.loadedDialogs.get(i8);
                if (savedDialog2.dialogId == jKeyAt) {
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
                    if (numValueOf != null) {
                        iMax = Math.max(numValueOf.intValue(), savedDialog2.messagesCount);
                    } else {
                        iMax = savedDialog2.messagesCount;
                    }
                    numValueOf = Integer.valueOf(iMax);
                    z2 = true;
                    break;
                }
                i8++;
            }
            if (!z2) {
                SavedDialog savedDialogFromMessage2 = SavedDialog.fromMessage(this.currentAccount, message3, true);
                if (numValueOf != null) {
                    savedDialogFromMessage2.messagesCount = numValueOf.intValue();
                }
                this.loadedDialogs.add(savedDialogFromMessage2);
                z3 = true;
            }
        }
        return z3;
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

    public boolean updatedDialogCount(long j, int i) {
        return updatedDialogCount(j, i, false);
    }

    public boolean updatedDialogCount(long j, int i, boolean z) {
        for (int i2 = 0; i2 < this.allDialogs.size(); i2++) {
            SavedDialog savedDialog = this.allDialogs.get(i2);
            if (savedDialog.dialogId == j) {
                if (savedDialog.messagesCount == i && (savedDialog.messagesCountLoaded || !z)) {
                    break;
                    break;
                }
                savedDialog.messagesCount = i;
                savedDialog.messagesCountLoaded = true;
                return true;
            }
        }
        return false;
    }

    public void update(long j, TLRPC.messages_Messages messages_messages) {
        boolean zUpdateSavedDialogs = updateSavedDialogs(messages_messages.messages);
        if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
            if (updatedDialogCount(j, messages_messages.count) || zUpdateSavedDialogs) {
                zUpdateSavedDialogs = true;
            } else {
                zUpdateSavedDialogs = false;
            }
        } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
            if (updatedDialogCount(j, messages_messages.messages.size()) || zUpdateSavedDialogs) {
                zUpdateSavedDialogs = true;
            } else {
                zUpdateSavedDialogs = false;
            }
        } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
            if (updatedDialogCount(j, messages_messages.count) || zUpdateSavedDialogs) {
                zUpdateSavedDialogs = true;
            } else {
                zUpdateSavedDialogs = false;
            }
        }
        if (zUpdateSavedDialogs) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.update();
                }
            });
        }
    }

    public void updateDeleted(LongSparseArray longSparseArray) {
        SavedDialog savedDialog;
        ArrayList<SavedDialog> arrayList = new ArrayList<>();
        boolean z = false;
        for (int i = 0; i < longSparseArray.size(); i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ArrayList arrayList2 = (ArrayList) longSparseArray.valueAt(i);
            int iMax = 0;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                iMax = Math.max(iMax, ((Integer) arrayList2.get(i2)).intValue());
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.allDialogs.size()) {
                    savedDialog = null;
                    break;
                } else {
                    if (this.allDialogs.get(i3).dialogId == jKeyAt) {
                        savedDialog = this.allDialogs.get(i3);
                        break;
                    }
                    i3++;
                }
            }
            if (savedDialog != null) {
                if (savedDialog.messagesCountLoaded) {
                    int iMax2 = Math.max(0, savedDialog.messagesCount - arrayList2.size());
                    int i4 = savedDialog.messagesCount;
                    if (iMax2 != i4) {
                        savedDialog.messagesCount = Math.max(0, i4 - arrayList2.size());
                        z = true;
                    }
                }
                if (savedDialog.messagesCountLoaded && savedDialog.messagesCount <= 0) {
                    removeDialog(savedDialog.dialogId);
                } else if (savedDialog.top_message_id <= iMax) {
                    arrayList.add(savedDialog);
                }
                z = true;
            }
        }
        if (z) {
            if (!arrayList.isEmpty()) {
                updateDialogsLastMessage(arrayList);
            } else {
                update();
            }
        }
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

    public void deleteAllDialogs() {
        this.dialogsCount = 0;
        this.allDialogs.clear();
        this.loadedDialogs.clear();
        this.cachedDialogs.clear();
        update();
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

    public void update() {
        updateAllDialogs(true);
        saveCacheSchedule();
    }

    public boolean updatePinned(ArrayList<Long> arrayList, boolean z, boolean z2) {
        int i;
        ArrayList<Long> currentPinnedOrder = getCurrentPinnedOrder(this.allDialogs);
        ArrayList<Long> arrayList2 = new ArrayList<>(currentPinnedOrder);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Long l = arrayList.get(size);
            l.getClass();
            if (z && !arrayList2.contains(l)) {
                arrayList2.add(0, l);
            } else if (!z) {
                arrayList2.remove(l);
            }
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            i = MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitPremium;
        } else {
            i = MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitDefault;
        }
        if (arrayList2.size() > i || sameOrder(currentPinnedOrder, arrayList2)) {
            return false;
        }
        if (!z2) {
            return updatePinnedOrder(this.loadedDialogs, arrayList2) || updatePinnedOrder(this.cachedDialogs, arrayList2);
        }
        updatePinnedOrderToServer(arrayList2);
        return true;
    }

    public boolean updatePinnedOrder(ArrayList<Long> arrayList) {
        int i;
        ArrayList<Long> currentPinnedOrder = getCurrentPinnedOrder(this.allDialogs);
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            i = MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitPremium;
        } else {
            i = MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitDefault;
        }
        if (arrayList.size() > i) {
            return false;
        }
        if (sameOrder(currentPinnedOrder, arrayList)) {
            return true;
        }
        updatePinnedOrderToServer(arrayList);
        return true;
    }

    private void updatePinnedOrderToServer(ArrayList<Long> arrayList) {
        boolean zUpdatePinnedOrder = updatePinnedOrder(this.loadedDialogs, arrayList);
        boolean zUpdatePinnedOrder2 = updatePinnedOrder(this.cachedDialogs, arrayList);
        if (zUpdatePinnedOrder || zUpdatePinnedOrder2) {
            TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
            tL_messages_reorderPinnedSavedDialogs.force = true;
            for (int i = 0; i < arrayList.size(); i++) {
                long jLongValue = arrayList.get(i).longValue();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(this.currentAccount).getInputPeer(jLongValue);
                tL_inputDialogPeer.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_reorderPinnedSavedDialogs.order.add(tL_inputDialogPeer);
                }
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedSavedDialogs, null);
            update();
        }
    }

    public void processUpdate(TLRPC.Update update) {
        if (processUpdateInternal(update)) {
            update();
        }
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
        }
        if (!(update instanceof TL_update.TL_updatePinnedSavedDialogs)) {
            return false;
        }
        TL_update.TL_updatePinnedSavedDialogs tL_updatePinnedSavedDialogs = (TL_update.TL_updatePinnedSavedDialogs) update;
        ArrayList<Long> arrayList2 = new ArrayList<>(tL_updatePinnedSavedDialogs.order.size());
        for (int i = 0; i < tL_updatePinnedSavedDialogs.order.size(); i++) {
            TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i);
            if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
            }
        }
        return updatePinnedOrder(this.loadedDialogs, arrayList2) || updatePinnedOrder(this.cachedDialogs, arrayList2);
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
            int iIndexOf = arrayList2.indexOf(Long.valueOf(savedDialog2.dialogId));
            if (iIndexOf >= 0) {
                savedDialog2.pinnedOrder = iIndexOf;
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
                return SavedMessagesController.m982$r8$lambda$GSvuyxOt3q15EK34jiI6LY10MA((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
            }
        });
        Collections.sort(arrayList4, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return SavedMessagesController.$r8$lambda$mlsKB21tK1WClx_bTOJ4ZDE4v2U((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
            }
        });
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public static int m982$r8$lambda$GSvuyxOt3q15EK34jiI6LY10MA(SavedDialog savedDialog, SavedDialog savedDialog2) {
        return savedDialog2.getDate() - savedDialog.getDate();
    }

    public static int $r8$lambda$mlsKB21tK1WClx_bTOJ4ZDE4v2U(SavedDialog savedDialog, SavedDialog savedDialog2) {
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
            public final void run() throws Throwable {
                SavedMessagesController.$r8$lambda$C24hkUgL8utSAIPA7OdkFdO463I(this.f$0, messagesStorage, clientUserId, runnable);
            }
        });
    }

    public static void $r8$lambda$C24hkUgL8utSAIPA7OdkFdO463I(SavedMessagesController savedMessagesController, MessagesStorage messagesStorage, long j, final Runnable runnable) throws Throwable {
        SQLiteCursor sQLiteCursorQueryFinalized;
        SQLiteCursor sQLiteCursor;
        SavedMessagesController savedMessagesController2;
        int i = 1;
        int i2 = 0;
        savedMessagesController.getClass();
        SQLiteDatabase database = messagesStorage.getDatabase();
        final ArrayList arrayList = new ArrayList();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        final ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
        final ArrayList<TLRPC.Chat> arrayList6 = new ArrayList<>();
        final ArrayList<TLRPC.Document> arrayList7 = new ArrayList<>();
        try {
            sQLiteCursorQueryFinalized = database.queryFinalized("SELECT did, date, last_mid, pinned, flags, folder_id, last_mid_group, count, unread_count, max_read_id, read_outbox FROM saved_dialogs WHERE forumChatId = ? ORDER BY pinned ASC, date DESC", 0);
            sQLiteCursor = null;
            while (sQLiteCursorQueryFinalized.next()) {
                try {
                    try {
                        SavedDialog savedDialog = new SavedDialog();
                        savedDialog.dialogId = sQLiteCursorQueryFinalized.longValue(i2);
                        savedDialog.localDate = sQLiteCursorQueryFinalized.intValue(i);
                        savedDialog.top_message_id = sQLiteCursorQueryFinalized.intValue(2);
                        savedDialog.pinnedOrder = sQLiteCursorQueryFinalized.intValue(3);
                        savedDialog.messagesCountLoaded = (sQLiteCursorQueryFinalized.intValue(4) & i) != 0;
                        savedDialog.pinned = savedDialog.pinnedOrder != 999;
                        savedDialog.messagesCount = sQLiteCursorQueryFinalized.intValue(7);
                        savedDialog.unreadCount = sQLiteCursorQueryFinalized.longValue(8);
                        savedDialog.readInboxMaxId = sQLiteCursorQueryFinalized.longValue(9);
                        savedDialog.readOutboxMaxId = sQLiteCursorQueryFinalized.longValue(10);
                        long j2 = savedDialog.dialogId;
                        if (j2 < 0) {
                            arrayList3.add(Long.valueOf(-j2));
                        } else {
                            arrayList2.add(Long.valueOf(j2));
                        }
                        SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT data FROM messages_topics WHERE uid = ? AND mid = ? AND topic_id = ?", Long.valueOf(j), Integer.valueOf(savedDialog.top_message_id), Long.valueOf(savedDialog.dialogId));
                        try {
                            try {
                                if (sQLiteCursorQueryFinalized2.next()) {
                                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                    TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                                    MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList2, arrayList3, arrayList4);
                                    savedMessagesController2 = savedMessagesController;
                                    try {
                                        savedDialog.message = new MessageObject(savedMessagesController2.currentAccount, messageTLdeserialize, null, null, null, null, null, false, false, 0L, false, false, true);
                                    } catch (Exception e) {
                                        e = e;
                                        sQLiteCursor = sQLiteCursorQueryFinalized2;
                                        FileLog.e(e);
                                        if (sQLiteCursorQueryFinalized != null) {
                                            sQLiteCursorQueryFinalized.dispose();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        final SavedMessagesController savedMessagesController3 = savedMessagesController2;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                SavedMessagesController.$r8$lambda$z4okta9EcAlPSlshH9IPLsAlIW0(this.f$0, arrayList5, arrayList6, arrayList7, arrayList, runnable);
                                            }
                                        });
                                    }
                                }
                                sQLiteCursorQueryFinalized2.dispose();
                                arrayList.add(savedDialog);
                                sQLiteCursor = sQLiteCursorQueryFinalized2;
                                i = 1;
                                i2 = 0;
                            } catch (Exception e2) {
                                e = e2;
                                savedMessagesController2 = savedMessagesController;
                            }
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor = sQLiteCursorQueryFinalized2;
                            if (sQLiteCursorQueryFinalized != null) {
                                sQLiteCursorQueryFinalized.dispose();
                            }
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        savedMessagesController2 = savedMessagesController;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            savedMessagesController2 = savedMessagesController;
            try {
                if (!arrayList2.isEmpty()) {
                    messagesStorage.getUsersInternal(arrayList2, arrayList5);
                }
                if (!arrayList3.isEmpty()) {
                    messagesStorage.getChatsInternal(TextUtils.join(",", arrayList3), arrayList6);
                }
                if (!arrayList4.isEmpty()) {
                    messagesStorage.getAnimatedEmoji(TextUtils.join(",", arrayList4), arrayList7);
                }
                sQLiteCursorQueryFinalized.dispose();
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            } catch (Exception e4) {
                e = e4;
                FileLog.e(e);
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                }
                if (sQLiteCursor != null) {
                }
                final SavedMessagesController savedMessagesController4 = savedMessagesController2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SavedMessagesController.$r8$lambda$z4okta9EcAlPSlshH9IPLsAlIW0(this.f$0, arrayList5, arrayList6, arrayList7, arrayList, runnable);
                    }
                });
            }
        } catch (Exception e5) {
            e = e5;
            savedMessagesController2 = savedMessagesController;
            sQLiteCursorQueryFinalized = null;
            sQLiteCursor = null;
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursorQueryFinalized = null;
            sQLiteCursor = null;
        }
        final SavedMessagesController savedMessagesController5 = savedMessagesController2;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.$r8$lambda$z4okta9EcAlPSlshH9IPLsAlIW0(this.f$0, arrayList5, arrayList6, arrayList7, arrayList, runnable);
            }
        });
    }

    public static void $r8$lambda$z4okta9EcAlPSlshH9IPLsAlIW0(SavedMessagesController savedMessagesController, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        savedMessagesController.loadingCache = false;
        savedMessagesController.loadedCache = true;
        MessagesController.getInstance(savedMessagesController.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(savedMessagesController.currentAccount).putChats(arrayList2, true);
        AnimatedEmojiDrawable.getDocumentFetcher(savedMessagesController.currentAccount).processDocuments(arrayList3);
        savedMessagesController.cachedDialogs.clear();
        savedMessagesController.cachedDialogs.addAll(arrayList4);
        savedMessagesController.updateAllDialogs(true);
        if (runnable == null || savedMessagesController.loadingCacheOnly) {
            return;
        }
        runnable.run();
    }

    private void updateDialogsLastMessage(final ArrayList<SavedDialog> arrayList) {
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.$r8$lambda$YZIZqVEg44XaOKA019s7bX15Wf8(this.f$0, messagesStorage, arrayList, clientUserId);
            }
        });
    }

    public static void $r8$lambda$YZIZqVEg44XaOKA019s7bX15Wf8(final SavedMessagesController savedMessagesController, MessagesStorage messagesStorage, ArrayList arrayList, long j) {
        savedMessagesController.getClass();
        SQLiteDatabase database = messagesStorage.getDatabase();
        final ArrayList arrayList2 = new ArrayList();
        final LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        final ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
        final ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
        final ArrayList<TLRPC.Document> arrayList8 = new ArrayList<>();
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        int i = 0;
        while (i < arrayList.size()) {
            try {
                try {
                    SavedDialog savedDialog = (SavedDialog) arrayList.get(i);
                    sQLiteCursorQueryFinalized = database.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = ? AND topic_id = ? ORDER BY mid DESC LIMIT 1", Long.valueOf(j), Long.valueOf(savedDialog.dialogId));
                    if (sQLiteCursorQueryFinalized.next()) {
                        sQLiteCursorQueryFinalized.intValue(0);
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(1);
                        TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                        MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList3, arrayList4, arrayList5);
                        longSparseArray.put(savedDialog.dialogId, messageTLdeserialize);
                    } else {
                        arrayList2.add(Long.valueOf(savedDialog.dialogId));
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    i++;
                    database = database;
                } catch (Exception e) {
                    FileLog.e(e);
                    if (sQLiteCursorQueryFinalized != null) {
                        sQLiteCursorQueryFinalized.dispose();
                    }
                }
            } catch (Throwable th) {
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                }
                throw th;
            }
        }
        if (!arrayList3.isEmpty()) {
            messagesStorage.getUsersInternal(arrayList3, arrayList6);
        }
        if (!arrayList4.isEmpty()) {
            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList4), arrayList7);
        }
        if (!arrayList5.isEmpty()) {
            messagesStorage.getAnimatedEmoji(TextUtils.join(",", arrayList5), arrayList8);
        }
        if (sQLiteCursorQueryFinalized != null) {
            sQLiteCursorQueryFinalized.dispose();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.$r8$lambda$F0JPOIBfqL5Z4A6KWJAY1lyk_CE(this.f$0, arrayList6, arrayList7, arrayList8, arrayList2, longSparseArray);
            }
        });
    }

    public static void $r8$lambda$F0JPOIBfqL5Z4A6KWJAY1lyk_CE(SavedMessagesController savedMessagesController, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, LongSparseArray longSparseArray) {
        MessagesController.getInstance(savedMessagesController.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(savedMessagesController.currentAccount).putChats(arrayList2, true);
        AnimatedEmojiDrawable.getDocumentFetcher(savedMessagesController.currentAccount).processDocuments(arrayList3);
        for (int i = 0; i < arrayList4.size(); i++) {
            savedMessagesController.removeDialog(((Long) arrayList4.get(i)).longValue());
        }
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            long jKeyAt = longSparseArray.keyAt(i2);
            MessageObject messageObject = new MessageObject(savedMessagesController.currentAccount, (TLRPC.Message) longSparseArray.valueAt(i2), null, null, null, null, null, false, false, 0L, false, false, true);
            for (int i3 = 0; i3 < savedMessagesController.loadedDialogs.size(); i3++) {
                SavedDialog savedDialog = savedMessagesController.loadedDialogs.get(i3);
                if (savedDialog.dialogId == jKeyAt) {
                    savedDialog.top_message_id = messageObject.getId();
                    savedDialog.message = messageObject;
                }
            }
            for (int i4 = 0; i4 < savedMessagesController.cachedDialogs.size(); i4++) {
                SavedDialog savedDialog2 = savedMessagesController.cachedDialogs.get(i4);
                if (savedDialog2.dialogId == jKeyAt) {
                    savedDialog2.top_message_id = messageObject.getId();
                    savedDialog2.message = messageObject;
                }
            }
        }
        savedMessagesController.update();
    }

    private void saveCacheSchedule() {
        AndroidUtilities.cancelRunOnUIThread(this.saveCacheRunnable);
        AndroidUtilities.runOnUIThread(this.saveCacheRunnable, 450L);
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
                SavedMessagesController.m980$r8$lambda$8G4CMo3lPE1pETe6PKqNuGB5sU(this.f$0, messagesStorage, arrayList);
            }
        });
    }

    public static void m980$r8$lambda$8G4CMo3lPE1pETe6PKqNuGB5sU(final SavedMessagesController savedMessagesController, MessagesStorage messagesStorage, ArrayList arrayList) {
        savedMessagesController.getClass();
        SQLiteDatabase database = messagesStorage.getDatabase();
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = database.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                sQLitePreparedStatementExecuteFast2.requery();
                sQLitePreparedStatementExecuteFast2.bindLong(1, 0L);
                sQLitePreparedStatementExecuteFast2.step();
                sQLitePreparedStatementExecuteFast2.dispose();
                sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO saved_dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                for (int i = 0; i < arrayList.size(); i++) {
                    SavedDialog savedDialog = (SavedDialog) arrayList.get(i);
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindLong(1, savedDialog.dialogId);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, savedDialog.getDate());
                    sQLitePreparedStatementExecuteFast.bindInteger(3, savedDialog.top_message_id);
                    sQLitePreparedStatementExecuteFast.bindInteger(4, savedDialog.pinned ? i : 999);
                    sQLitePreparedStatementExecuteFast.bindInteger(5, savedDialog.messagesCountLoaded ? 1 : 0);
                    sQLitePreparedStatementExecuteFast.bindInteger(6, 0);
                    sQLitePreparedStatementExecuteFast.bindInteger(7, 0);
                    sQLitePreparedStatementExecuteFast.bindInteger(8, savedDialog.messagesCount);
                    sQLitePreparedStatementExecuteFast.bindLong(9, 0L);
                    sQLitePreparedStatementExecuteFast.bindLong(10, savedDialog.unreadCount);
                    sQLitePreparedStatementExecuteFast.bindLong(11, savedDialog.readInboxMaxId);
                    sQLitePreparedStatementExecuteFast.bindLong(12, savedDialog.readOutboxMaxId);
                    sQLitePreparedStatementExecuteFast.step();
                }
                sQLitePreparedStatementExecuteFast.dispose();
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatementExecuteFast != null) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.saving = false;
                    }
                });
            }
            sQLitePreparedStatementExecuteFast.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.saving = false;
                }
            });
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
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
                SavedMessagesController.m983$r8$lambda$uCv9VrIpj2veb4AdyFaP_zjiCk(this.f$0, messagesStorage);
            }
        });
    }

    public static void m983$r8$lambda$uCv9VrIpj2veb4AdyFaP_zjiCk(final SavedMessagesController savedMessagesController, MessagesStorage messagesStorage) {
        savedMessagesController.getClass();
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = messagesStorage.getDatabase().executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindLong(1, 0L);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.$r8$lambda$M1ldrxaVdzD35ibjVTmtssafXqE(this.f$0);
            }
        });
    }

    public static void $r8$lambda$M1ldrxaVdzD35ibjVTmtssafXqE(SavedMessagesController savedMessagesController) {
        savedMessagesController.saving = false;
        savedMessagesController.loadedCache = false;
    }

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

        public int getDate() {
            int dateInternal = getDateInternal();
            this.lastDate = dateInternal;
            return dateInternal;
        }

        private int getDateInternal() {
            TLRPC.Message message;
            MessageObject messageObject = this.message;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return this.localDate;
            }
            if ((message.flags & 32768) != 0) {
                return message.edit_date;
            }
            return message.date;
        }

        public boolean isHidden() {
            TLRPC.Message message;
            MessageObject messageObject = this.message;
            return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
        }

        public static SavedDialog fromMessage(int i, TLRPC.Message message, boolean z) {
            SavedDialog savedDialog = new SavedDialog();
            savedDialog.dialogId = MessageObject.getSavedDialogId(UserConfig.getInstance(i).getClientUserId(), message);
            savedDialog.pinned = false;
            savedDialog.top_message_id = message.id;
            savedDialog.message = new MessageObject(i, message, null, null, null, null, null, false, false, 0L, false, false, z);
            return savedDialog;
        }

        public static SavedDialog fromTL(int i, TLRPC.savedDialog saveddialog, ArrayList<TLRPC.Message> arrayList, boolean z) {
            TLRPC.Message message;
            SavedDialog savedDialog = new SavedDialog();
            savedDialog.dialogId = DialogObject.getPeerDialogId(saveddialog.peer);
            savedDialog.pinned = saveddialog.pinned;
            savedDialog.top_message_id = saveddialog.top_message;
            savedDialog.unreadCount = saveddialog.unread_count;
            savedDialog.readInboxMaxId = saveddialog.read_inbox_max_id;
            savedDialog.readOutboxMaxId = saveddialog.read_outbox_max_id;
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
                savedDialog.message = new MessageObject(i, message2, null, null, null, null, null, false, false, 0L, false, false, z);
            }
            return savedDialog;
        }
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

    public static void openSavedMessagesReminders() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(lastFragment.getCurrentAccount()).getClientUserId());
        bundle.putInt("chatMode", 1);
        lastFragment.presentFragment(new ChatActivity(bundle));
    }

    public void checkSavedDialogCount(long j) {
        SavedDialog savedDialogFindSavedDialog = findSavedDialog(j);
        if (savedDialogFindSavedDialog == null || savedDialogFindSavedDialog.messagesCountLoaded) {
            return;
        }
        hasSavedMessages(j, null);
    }

    public void hasSavedMessages(final long j, Utilities.Callback<Boolean> callback) {
        SavedDialog savedDialogFindSavedDialog = findSavedDialog(j);
        if (savedDialogFindSavedDialog != null && savedDialogFindSavedDialog.messagesCount > 0 && savedDialogFindSavedDialog.messagesCountLoaded) {
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
                SavedMessagesController.m978$r8$lambda$2DjbJS83c7KS3VLUtCax7fnWQA(this.f$0, j, tLObject, tL_error);
            }
        });
    }

    public static void m978$r8$lambda$2DjbJS83c7KS3VLUtCax7fnWQA(final SavedMessagesController savedMessagesController, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        savedMessagesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.m981$r8$lambda$AOP7eZbhMaSJoZ4pXTpzdBub8w(this.f$0, tLObject, j);
            }
        });
    }

    public static void m981$r8$lambda$AOP7eZbhMaSJoZ4pXTpzdBub8w(SavedMessagesController savedMessagesController, TLObject tLObject, long j) {
        savedMessagesController.getClass();
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int size = messages_messages.messages.size();
            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            MessagesController.getInstance(savedMessagesController.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(savedMessagesController.currentAccount).putChats(messages_messages.chats, false);
            MessagesStorage.getInstance(savedMessagesController.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            boolean z = size > 0;
            if (size > 0) {
                if (!savedMessagesController.updatedDialogCount(j, size, true)) {
                    if (!messages_messages.messages.isEmpty()) {
                        SavedDialog savedDialogFromMessage = SavedDialog.fromMessage(savedMessagesController.currentAccount, messages_messages.messages.get(0), true);
                        savedDialogFromMessage.messagesCount = size;
                        savedDialogFromMessage.messagesCountLoaded = true;
                        savedMessagesController.cachedDialogs.add(savedDialogFromMessage);
                        savedMessagesController.update();
                    }
                } else {
                    savedMessagesController.update();
                }
            }
            ArrayList arrayList = (ArrayList) savedMessagesController.checkMessagesCallbacks.get(j);
            savedMessagesController.checkMessagesCallbacks.remove(j);
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    ((Utilities.Callback) arrayList.get(i)).run(Boolean.valueOf(z));
                }
            }
        }
    }
}
