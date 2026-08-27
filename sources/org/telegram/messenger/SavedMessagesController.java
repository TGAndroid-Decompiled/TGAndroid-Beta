package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

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
    private final Runnable saveCacheRunnable = new vh(this, 1);
    private final a0.h checkMessagesCallbacks = new a0.h();

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
            savedDialog.top_message_id = message.f22401id;
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
                if (i11 >= arrayList.size()) {
                    message = null;
                    break;
                }
                message = arrayList.get(i11);
                if (savedDialog.top_message_id == message.f22401id) {
                    break;
                }
                i11++;
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
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return this.localDate;
            }
            return (message.flags & 32768) != 0 ? message.edit_date : message.date;
        }

        public int getDate() {
            int dateInternal = getDateInternal();
            this.lastDate = dateInternal;
            return dateInternal;
        }

        public boolean isHidden() {
            TLRPC.Message message;
            MessageObject messageObject = this.message;
            return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
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
        messagesStorage.getStorageQueue().postRunnable(new sg(6, this, messagesStorage));
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
                if (i11 >= this.cachedDialogs.size()) {
                    savedDialog = null;
                    break;
                }
                savedDialog = this.cachedDialogs.get(i11);
                if (savedDialog.dialogId == savedDialog2.dialogId) {
                    break;
                } else {
                    i11++;
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
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = messagesStorage.getDatabase().executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindLong(1, 0L);
            sQLitePreparedStatementExecuteFast.step();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        AndroidUtilities.runOnUIThread(new vh(this, 2));
    }

    public void lambda$hasSavedMessages$14(TLObject tLObject, long j10) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int size = messages_messages.messages.size();
            if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                size = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            boolean z10 = size > 0;
            if (size > 0) {
                if (updatedDialogCount(j10, size, true)) {
                    update();
                } else if (!messages_messages.messages.isEmpty()) {
                    SavedDialog savedDialogFromMessage = SavedDialog.fromMessage(this.currentAccount, messages_messages.messages.get(0), true);
                    savedDialogFromMessage.messagesCount = size;
                    savedDialogFromMessage.messagesCountLoaded = true;
                    this.cachedDialogs.add(savedDialogFromMessage);
                    update();
                }
            }
            ArrayList arrayList = (ArrayList) this.checkMessagesCallbacks.f(j10);
            this.checkMessagesCallbacks.l(j10);
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((Utilities.Callback) arrayList.get(i10)).run(Boolean.valueOf(z10));
                }
            }
        }
    }

    public void lambda$hasSavedMessages$15(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c4(this, tLObject, j10, 25));
    }

    public void lambda$loadCache$6(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.loadingCache = false;
        this.loadedCache = true;
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList2, true);
        org.telegram.ui.Components.k5.h(this.currentAccount).d(arrayList3);
        this.cachedDialogs.clear();
        this.cachedDialogs.addAll(arrayList4);
        updateAllDialogs(true);
        if (runnable == null || this.loadingCacheOnly) {
            return;
        }
        runnable.run();
    }

    public void lambda$loadCache$7(MessagesStorage messagesStorage, long j10, Runnable runnable) throws Throwable {
        SQLiteCursor sQLiteCursor;
        SavedMessagesController savedMessagesController;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase database = messagesStorage.getDatabase();
        ArrayList arrayList = new ArrayList();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList6 = new ArrayList<>();
        ArrayList<TLRPC.Document> arrayList7 = new ArrayList<>();
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            int i10 = 0;
            int i11 = 1;
            SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT did, date, last_mid, pinned, flags, folder_id, last_mid_group, count, unread_count, max_read_id, read_outbox FROM saved_dialogs WHERE forumChatId = ? ORDER BY pinned ASC, date DESC", 0);
            while (sQLiteCursorQueryFinalized2.next()) {
                try {
                    SavedDialog savedDialog = new SavedDialog();
                    savedDialog.dialogId = sQLiteCursorQueryFinalized2.longValue(i10);
                    savedDialog.localDate = sQLiteCursorQueryFinalized2.intValue(i11);
                    savedDialog.top_message_id = sQLiteCursorQueryFinalized2.intValue(2);
                    savedDialog.pinnedOrder = sQLiteCursorQueryFinalized2.intValue(3);
                    savedDialog.messagesCountLoaded = (sQLiteCursorQueryFinalized2.intValue(4) & i11) != 0;
                    savedDialog.pinned = savedDialog.pinnedOrder != 999;
                    savedDialog.messagesCount = sQLiteCursorQueryFinalized2.intValue(7);
                    savedDialog.unreadCount = sQLiteCursorQueryFinalized2.longValue(8);
                    savedDialog.readInboxMaxId = sQLiteCursorQueryFinalized2.longValue(9);
                    savedDialog.readOutboxMaxId = sQLiteCursorQueryFinalized2.longValue(10);
                    long j11 = savedDialog.dialogId;
                    if (j11 < 0) {
                        try {
                            arrayList3.add(Long.valueOf(-j11));
                        } catch (Exception e9) {
                            e = e9;
                            savedMessagesController = this;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            sQLiteCursorQueryFinalized = sQLiteCursorQueryFinalized2;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursorQueryFinalized != null) {
                                    sQLiteCursorQueryFinalized.dispose();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                AndroidUtilities.runOnUIThread(new b0(savedMessagesController, arrayList5, arrayList6, arrayList7, arrayList, runnable, 5));
                            } catch (Throwable th) {
                                th = th;
                                if (sQLiteCursorQueryFinalized != null) {
                                    sQLiteCursorQueryFinalized.dispose();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor = sQLiteCursorQueryFinalized;
                            sQLiteCursorQueryFinalized = sQLiteCursorQueryFinalized2;
                            if (sQLiteCursorQueryFinalized != null) {
                                sQLiteCursorQueryFinalized.dispose();
                            }
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } else {
                        arrayList2.add(Long.valueOf(j11));
                    }
                    sQLiteCursor = sQLiteCursorQueryFinalized;
                    sQLiteCursor2 = sQLiteCursorQueryFinalized2;
                    try {
                        sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data FROM messages_topics WHERE uid = ? AND mid = ? AND topic_id = ?", Long.valueOf(j10), Integer.valueOf(savedDialog.top_message_id), Long.valueOf(savedDialog.dialogId));
                        try {
                            if (sQLiteCursorQueryFinalized.next()) {
                                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                                i11 = 1;
                                TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                                MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList2, arrayList3, arrayList4);
                                savedMessagesController = this;
                                try {
                                    savedDialog.message = new MessageObject(savedMessagesController.currentAccount, messageTLdeserialize, null, null, null, null, null, false, false, 0L, false, false, true);
                                } catch (Exception e10) {
                                    e = e10;
                                    sQLiteCursor = sQLiteCursorQueryFinalized;
                                    sQLiteCursorQueryFinalized = sQLiteCursor2;
                                    FileLog.e(e);
                                    if (sQLiteCursorQueryFinalized != null) {
                                        sQLiteCursorQueryFinalized.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    AndroidUtilities.runOnUIThread(new b0(savedMessagesController, arrayList5, arrayList6, arrayList7, arrayList, runnable, 5));
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteCursor = sQLiteCursorQueryFinalized;
                                    sQLiteCursorQueryFinalized = sQLiteCursor2;
                                    if (sQLiteCursorQueryFinalized != null) {
                                        sQLiteCursorQueryFinalized.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            } else {
                                i11 = 1;
                            }
                            sQLiteCursorQueryFinalized.dispose();
                            arrayList.add(savedDialog);
                            sQLiteCursorQueryFinalized2 = sQLiteCursor2;
                            i10 = 0;
                        } catch (Exception e11) {
                            e = e11;
                            savedMessagesController = this;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        savedMessagesController = this;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e13) {
                    e = e13;
                    savedMessagesController = this;
                    sQLiteCursor = sQLiteCursorQueryFinalized;
                    sQLiteCursor2 = sQLiteCursorQueryFinalized2;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = sQLiteCursorQueryFinalized;
                    sQLiteCursor2 = sQLiteCursorQueryFinalized2;
                }
            }
            savedMessagesController = this;
            sQLiteCursor = sQLiteCursorQueryFinalized;
            sQLiteCursor2 = sQLiteCursorQueryFinalized2;
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
                sQLiteCursor2.dispose();
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            } catch (Exception e14) {
                e = e14;
                sQLiteCursorQueryFinalized = sQLiteCursor2;
                FileLog.e(e);
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                }
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            } catch (Throwable th7) {
                th = th7;
                sQLiteCursorQueryFinalized = sQLiteCursor2;
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                }
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                throw th;
            }
        } catch (Exception e15) {
            e = e15;
            savedMessagesController = this;
            sQLiteCursor = null;
        } catch (Throwable th8) {
            th = th8;
            sQLiteCursor = null;
        }
        AndroidUtilities.runOnUIThread(new b0(savedMessagesController, arrayList5, arrayList6, arrayList7, arrayList, runnable, 5));
    }

    public void lambda$loadDialogs$1() {
        loadDialogs(false);
    }

    public void lambda$loadDialogs$2(TLObject tLObject, ArrayList arrayList, TLRPC.TL_error tL_error) {
        boolean z10 = this.unsupported;
        if (tLObject instanceof TLRPC.TL_messages_savedDialogs) {
            this.dialogsLoaded = true;
            TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_savedDialogs.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_messages_savedDialogs.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
            MessagesStorage.getInstance(this.currentAccount).putMessages(tL_messages_savedDialogs.messages, false, true, false, 0, false, 3, 0L);
            for (int i10 = 0; i10 < tL_messages_savedDialogs.dialogs.size(); i10++) {
                SavedDialog savedDialogFromTL = SavedDialog.fromTL(this.currentAccount, tL_messages_savedDialogs.dialogs.get(i10), tL_messages_savedDialogs.messages, true);
                for (int i11 = 0; i11 < this.cachedDialogs.size(); i11++) {
                    if (this.cachedDialogs.get(i11).dialogId == savedDialogFromTL.dialogId) {
                        savedDialogFromTL.messagesCount = this.cachedDialogs.get(i11).messagesCount;
                        this.cachedDialogs.get(i11).pinned = savedDialogFromTL.pinned;
                        break;
                    }
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= this.loadedDialogs.size()) {
                        this.loadedDialogs.add(savedDialogFromTL);
                        if (!savedDialogFromTL.isHidden()) {
                            break;
                        }
                        this.dialogsCountHidden++;
                        break;
                    }
                    if (this.loadedDialogs.get(i12).dialogId == savedDialogFromTL.dialogId) {
                        break;
                    } else {
                        i12++;
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
                SavedDialog savedDialogFromTL2 = SavedDialog.fromTL(this.currentAccount, tL_messages_savedDialogsSlice.dialogs.get(i13), tL_messages_savedDialogsSlice.messages, true);
                for (int i14 = 0; i14 < this.cachedDialogs.size(); i14++) {
                    if (this.cachedDialogs.get(i14).dialogId == savedDialogFromTL2.dialogId) {
                        savedDialogFromTL2.messagesCount = this.cachedDialogs.get(i14).messagesCount;
                        this.cachedDialogs.get(i14).pinned = savedDialogFromTL2.pinned;
                        break;
                    }
                }
                int i15 = 0;
                while (true) {
                    if (i15 >= this.loadedDialogs.size()) {
                        this.loadedDialogs.add(savedDialogFromTL2);
                        if (!savedDialogFromTL2.isHidden()) {
                            break;
                        }
                        this.dialogsCountHidden++;
                        break;
                    }
                    if (this.loadedDialogs.get(i15).dialogId == savedDialogFromTL2.dialogId) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.dialogsCount = tL_messages_savedDialogsSlice.count;
            this.dialogsEndReached = this.loadedDialogs.size() + getPinnedCount() >= this.dialogsCount || tL_messages_savedDialogsSlice.dialogs.size() == 0;
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
            boolean z11 = this.dialogsEndReached;
            boolean z12 = this.loadedDialogs.size() >= this.dialogsCount;
            this.dialogsEndReached = z12;
            this.unsupported = false;
            if (z12 && !z11) {
                updateAllDialogs(true);
            }
        } else if (tL_error != null) {
            this.dialogsLoaded = true;
            if ("SAVED_DIALOGS_UNSUPPORTED".equals(tL_error.text)) {
                this.unsupported = true;
            }
        }
        if (this.unsupported != z10) {
            MessagesController.getMainSettings(this.currentAccount).edit().putBoolean("savedMessagesUnsupported", this.unsupported).apply();
        }
        this.dialogsLoading = false;
    }

    public void lambda$loadDialogs$3(ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new lk(this, tLObject, arrayList, tL_error, 29));
    }

    public void lambda$saveCache$10() {
        this.saving = false;
    }

    public void lambda$saveCache$11(MessagesStorage messagesStorage, ArrayList arrayList) {
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
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    SavedDialog savedDialog = (SavedDialog) arrayList.get(i10);
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindLong(1, savedDialog.dialogId);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, savedDialog.getDate());
                    sQLitePreparedStatementExecuteFast.bindInteger(3, savedDialog.top_message_id);
                    sQLitePreparedStatementExecuteFast.bindInteger(4, savedDialog.pinned ? i10 : 999);
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
            } catch (Exception e9) {
                FileLog.e(e9);
                if (sQLitePreparedStatementExecuteFast != null) {
                }
                AndroidUtilities.runOnUIThread(new vh(this, 3));
            }
            sQLitePreparedStatementExecuteFast.dispose();
            AndroidUtilities.runOnUIThread(new vh(this, 3));
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public static int lambda$updateAllDialogs$0(SavedDialog savedDialog, SavedDialog savedDialog2) {
        return savedDialog2.getDate() - savedDialog.getDate();
    }

    public void lambda$updateDialogsLastMessage$8(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar) {
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList2, true);
        org.telegram.ui.Components.k5.h(this.currentAccount).d(arrayList3);
        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
            removeDialog(((Long) arrayList4.get(i10)).longValue());
        }
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j10 = hVar.j(i11);
            MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC.Message) hVar.n(i11), null, null, null, null, null, false, false, 0L, false, false, true);
            for (int i12 = 0; i12 < this.loadedDialogs.size(); i12++) {
                SavedDialog savedDialog = this.loadedDialogs.get(i12);
                if (savedDialog.dialogId == j10) {
                    savedDialog.top_message_id = messageObject.getId();
                    savedDialog.message = messageObject;
                }
            }
            for (int i13 = 0; i13 < this.cachedDialogs.size(); i13++) {
                SavedDialog savedDialog2 = this.cachedDialogs.get(i13);
                if (savedDialog2.dialogId == j10) {
                    savedDialog2.top_message_id = messageObject.getId();
                    savedDialog2.message = messageObject;
                }
            }
        }
        update();
    }

    public void lambda$updateDialogsLastMessage$9(MessagesStorage messagesStorage, ArrayList arrayList, long j10) throws Throwable {
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase database = messagesStorage.getDatabase();
        ArrayList arrayList2 = new ArrayList();
        a0.h hVar = new a0.h();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
        ArrayList<TLRPC.Document> arrayList8 = new ArrayList<>();
        SQLiteCursor sQLiteCursor2 = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            try {
                SavedDialog savedDialog = (SavedDialog) arrayList.get(i10);
                Long lValueOf = Long.valueOf(j10);
                int i11 = i10;
                Long lValueOf2 = Long.valueOf(savedDialog.dialogId);
                try {
                    Object[] objArr = new Object[2];
                    objArr[0] = lValueOf;
                    sQLiteCursor = sQLiteCursor2;
                    try {
                        objArr[1] = lValueOf2;
                        SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = ? AND topic_id = ? ORDER BY mid DESC LIMIT 1", objArr);
                        try {
                            if (sQLiteCursorQueryFinalized.next()) {
                                sQLiteCursorQueryFinalized.intValue(0);
                                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(1);
                                TLRPC.Message messageTLdeserialize = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                                MessagesStorage.addUsersAndChatsFromMessage(messageTLdeserialize, arrayList3, arrayList4, arrayList5);
                                hVar.k(messageTLdeserialize, savedDialog.dialogId);
                            } else {
                                arrayList2.add(Long.valueOf(savedDialog.dialogId));
                            }
                            sQLiteCursorQueryFinalized.dispose();
                            i10 = i11 + 1;
                            sQLiteCursor2 = sQLiteCursorQueryFinalized;
                        } catch (Exception e9) {
                            e = e9;
                            sQLiteCursor2 = sQLiteCursorQueryFinalized;
                            try {
                                FileLog.e(e);
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                AndroidUtilities.runOnUIThread(new b0(this, arrayList6, arrayList7, arrayList8, arrayList2, hVar, 6));
                            } catch (Throwable th) {
                                th = th;
                                if (sQLiteCursor2 != null) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor2 = sQLiteCursorQueryFinalized;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLiteCursor2 = sQLiteCursor;
                        FileLog.e(e);
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        AndroidUtilities.runOnUIThread(new b0(this, arrayList6, arrayList7, arrayList8, arrayList2, hVar, 6));
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor2 = sQLiteCursor;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = sQLiteCursor2;
                    sQLiteCursor2 = sQLiteCursor;
                    FileLog.e(e);
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                    AndroidUtilities.runOnUIThread(new b0(this, arrayList6, arrayList7, arrayList8, arrayList2, hVar, 6));
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = sQLiteCursor2;
                    sQLiteCursor2 = sQLiteCursor;
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        sQLiteCursor = sQLiteCursor2;
        if (!arrayList3.isEmpty()) {
            messagesStorage.getUsersInternal(arrayList3, arrayList6);
        }
        if (!arrayList4.isEmpty()) {
            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList4), arrayList7);
        }
        if (!arrayList5.isEmpty()) {
            messagesStorage.getAnimatedEmoji(TextUtils.join(",", arrayList5), arrayList8);
        }
        if (sQLiteCursor != null) {
            sQLiteCursor.dispose();
        }
        AndroidUtilities.runOnUIThread(new b0(this, arrayList6, arrayList7, arrayList8, arrayList2, hVar, 6));
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
        messagesStorage.getStorageQueue().postRunnable(new pg((Object) this, messagesStorage, clientUserId, runnable, 2));
    }

    public static void openSavedMessages() {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(n2VarR.getCurrentAccount()).getClientUserId());
        n2VarR.presentFragment(new rn(bundle));
    }

    public static void openSavedMessagesReminders() {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(n2VarR.getCurrentAccount()).getClientUserId());
        bundle.putInt("chatMode", 1);
        n2VarR.presentFragment(new rn(bundle));
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
        for (int i10 = 0; i10 < tL_updatePinnedSavedDialogs.order.size(); i10++) {
            TLRPC.DialogPeer dialogPeer2 = tL_updatePinnedSavedDialogs.order.get(i10);
            if (dialogPeer2 instanceof TLRPC.TL_dialogPeer) {
                arrayList2.add(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.TL_dialogPeer) dialogPeer2).peer)));
            }
        }
        return updatePinnedOrder(this.loadedDialogs, arrayList2) || updatePinnedOrder(this.cachedDialogs, arrayList2);
    }

    private int removeDialog(long j10) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.allDialogs.size()) {
            if (this.allDialogs.get(i11).dialogId == j10) {
                this.allDialogs.remove(i11);
                i12++;
                i11--;
            }
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.loadedDialogs.size()) {
            if (this.loadedDialogs.get(i13).dialogId == j10) {
                this.loadedDialogs.remove(i13);
                i14++;
                i13--;
            }
            i13++;
        }
        while (i10 < this.cachedDialogs.size()) {
            if (this.cachedDialogs.get(i10).dialogId == j10) {
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
        messagesStorage.getStorageQueue().postRunnable(new a9(this, messagesStorage, arrayList, 20));
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
        Collections.sort(arrayList, new wh(0));
        this.allDialogs.addAll(arrayList);
        if (z10) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.savedMessagesDialogsUpdate, new Object[0]);
            if (hasDialogs() || !MessagesController.getInstance(this.currentAccount).savedViewAsChats) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).setSavedViewAs(false);
        }
    }

    private void updateDialogsLastMessage(ArrayList<SavedDialog> arrayList) {
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new pg(this, messagesStorage, arrayList, clientUserId));
    }

    private void updatePinnedOrderToServer(ArrayList<Long> arrayList) {
        boolean zUpdatePinnedOrder = updatePinnedOrder(this.loadedDialogs, arrayList);
        boolean zUpdatePinnedOrder2 = updatePinnedOrder(this.cachedDialogs, arrayList);
        if (zUpdatePinnedOrder || zUpdatePinnedOrder2) {
            TLRPC.TL_messages_reorderPinnedSavedDialogs tL_messages_reorderPinnedSavedDialogs = new TLRPC.TL_messages_reorderPinnedSavedDialogs();
            tL_messages_reorderPinnedSavedDialogs.force = true;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long jLongValue = arrayList.get(i10).longValue();
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

    public void checkSavedDialogCount(long j10) {
        SavedDialog savedDialogFindSavedDialog = findSavedDialog(j10);
        if (savedDialogFindSavedDialog == null || savedDialogFindSavedDialog.messagesCountLoaded) {
            return;
        }
        hasSavedMessages(j10, null);
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

    public boolean containsDialog(long j10) {
        for (int i10 = 0; i10 < this.allDialogs.size(); i10++) {
            if (this.allDialogs.get(i10).dialogId == j10) {
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

    public void deleteDialog(long j10) {
        this.dialogsCount -= removeDialog(j10);
        update();
    }

    public void deleteDialogs(ArrayList<Long> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.dialogsCount -= removeDialog(arrayList.get(i10).longValue());
        }
        update();
    }

    public SavedDialog findSavedDialog(long j10) {
        return findSavedDialog(this.allDialogs, j10);
    }

    public int getAllCount() {
        if (this.dialogsEndReached) {
            return this.allDialogs.size();
        }
        return this.dialogsLoaded ? this.dialogsCount - this.dialogsCountHidden : this.cachedDialogs.size();
    }

    public int getLoadedCount() {
        return this.loadedDialogs.size();
    }

    public int getMessagesCount(long j10) {
        for (int i10 = 0; i10 < this.allDialogs.size(); i10++) {
            SavedDialog savedDialog = this.allDialogs.get(i10);
            if (savedDialog.dialogId == j10) {
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
        return (this.allDialogs.size() == 1 && this.allDialogs.get(0).dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId()) ? false : true;
    }

    public void hasSavedMessages(long j10, Utilities.Callback<Boolean> callback) {
        SavedDialog savedDialogFindSavedDialog = findSavedDialog(j10);
        if (savedDialogFindSavedDialog != null && savedDialogFindSavedDialog.messagesCount > 0 && savedDialogFindSavedDialog.messagesCountLoaded) {
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) this.checkMessagesCallbacks.f(j10);
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
        this.checkMessagesCallbacks.k(arrayList2, j10);
        TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
        tL_messages_getSavedHistory.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        tL_messages_getSavedHistory.limit = 1;
        tL_messages_getSavedHistory.hash = 0L;
        tL_messages_getSavedHistory.offset_id = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.offset_date = Integer.MAX_VALUE;
        tL_messages_getSavedHistory.add_offset = -1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSavedHistory, new jh.r5(this, j10, 3));
    }

    public boolean isLoading() {
        return this.dialogsLoading;
    }

    public void loadDialogs(boolean z10) {
        this.loadingCacheOnly = z10;
        if (this.dialogsLoading || this.dialogsEndReached || this.loadingCache) {
            return;
        }
        if (!this.loadedCache) {
            loadCache(new vh(this, 4));
            return;
        }
        if (z10) {
            return;
        }
        this.dialogsLoading = true;
        TLRPC.TL_messages_getSavedDialogs tL_messages_getSavedDialogs = new TLRPC.TL_messages_getSavedDialogs();
        SavedDialog savedDialog = this.loadedDialogs.isEmpty() ? null : (SavedDialog) i0.a.i(1, this.loadedDialogs);
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
            long jCalcHash = MediaDataController.calcHash(tL_messages_getSavedDialogs.hash, savedDialog2.pinned ? 1L : 0L);
            tL_messages_getSavedDialogs.hash = jCalcHash;
            long jCalcHash2 = MediaDataController.calcHash(jCalcHash, Math.abs(savedDialog2.dialogId));
            tL_messages_getSavedDialogs.hash = jCalcHash2;
            long jCalcHash3 = MediaDataController.calcHash(jCalcHash2, savedDialog2.top_message_id);
            tL_messages_getSavedDialogs.hash = jCalcHash3;
            tL_messages_getSavedDialogs.hash = MediaDataController.calcHash(jCalcHash3, savedDialog2.getDate());
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getSavedDialogs, new t1(8, this, arrayList));
    }

    public void preloadDialogs(boolean z10) {
        if (this.dialogsLoaded) {
            return;
        }
        loadDialogs(z10);
    }

    public void processUpdate(TLRPC.Update update) {
        if (processUpdateInternal(update)) {
            update();
        }
    }

    public ArrayList<SavedDialog> searchDialogs(String str) {
        String userName;
        ArrayList<SavedDialog> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            String strTranslitSafe = AndroidUtilities.translitSafe(str.toLowerCase());
            for (int i10 = 0; i10 < this.allDialogs.size(); i10++) {
                SavedDialog savedDialog = this.allDialogs.get(i10);
                long j10 = savedDialog.dialogId;
                String string = null;
                if (j10 == 2666000) {
                    userName = LocaleController.getString(R.string.AnonymousForward);
                } else if (j10 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
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
                    if (strTranslitSafe2.startsWith(strTranslitSafe) || y1.x(" ", strTranslitSafe, strTranslitSafe2)) {
                        arrayList.add(savedDialog);
                    } else if (string != null) {
                        String strTranslitSafe3 = AndroidUtilities.translitSafe(string.toLowerCase());
                        if (strTranslitSafe3.startsWith(strTranslitSafe) || y1.x(" ", strTranslitSafe, strTranslitSafe3)) {
                            arrayList.add(savedDialog);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public void update(long j10, TLRPC.messages_Messages messages_messages) {
        boolean zUpdateSavedDialogs = updateSavedDialogs(messages_messages.messages);
        if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
            if (updatedDialogCount(j10, messages_messages.count) || zUpdateSavedDialogs) {
                zUpdateSavedDialogs = true;
            } else {
                zUpdateSavedDialogs = false;
            }
        } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
            if (updatedDialogCount(j10, messages_messages.messages.size()) || zUpdateSavedDialogs) {
                zUpdateSavedDialogs = true;
            } else {
                zUpdateSavedDialogs = false;
            }
        } else if (messages_messages instanceof TLRPC.TL_messages_channelMessages) {
            if (updatedDialogCount(j10, messages_messages.count) || zUpdateSavedDialogs) {
                zUpdateSavedDialogs = true;
            } else {
                zUpdateSavedDialogs = false;
            }
        }
        if (zUpdateSavedDialogs) {
            AndroidUtilities.runOnUIThread(new vh(this, 0));
        }
    }

    public void updateDeleted(a0.h hVar) {
        SavedDialog savedDialog;
        ArrayList<SavedDialog> arrayList = new ArrayList<>();
        boolean z10 = false;
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            long j10 = hVar.j(i10);
            ArrayList arrayList2 = (ArrayList) hVar.n(i10);
            int iMax = 0;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                iMax = Math.max(iMax, ((Integer) arrayList2.get(i11)).intValue());
            }
            int i12 = 0;
            while (true) {
                if (i12 >= this.allDialogs.size()) {
                    savedDialog = null;
                    break;
                } else {
                    if (this.allDialogs.get(i12).dialogId == j10) {
                        savedDialog = this.allDialogs.get(i12);
                        break;
                    }
                    i12++;
                }
            }
            if (savedDialog != null) {
                if (savedDialog.messagesCountLoaded) {
                    int iMax2 = Math.max(0, savedDialog.messagesCount - arrayList2.size());
                    int i13 = savedDialog.messagesCount;
                    if (iMax2 != i13) {
                        savedDialog.messagesCount = Math.max(0, i13 - arrayList2.size());
                        z10 = true;
                    }
                }
                if (savedDialog.messagesCountLoaded && savedDialog.messagesCount <= 0) {
                    removeDialog(savedDialog.dialogId);
                } else if (savedDialog.top_message_id <= iMax) {
                    arrayList.add(savedDialog);
                }
                z10 = true;
            }
        }
        if (z10) {
            if (arrayList.isEmpty()) {
                update();
            } else {
                updateDialogsLastMessage(arrayList);
            }
        }
    }

    public boolean updatePinned(ArrayList<Long> arrayList, boolean z10, boolean z11) {
        ArrayList<Long> currentPinnedOrder = getCurrentPinnedOrder(this.allDialogs);
        ArrayList<Long> arrayList2 = new ArrayList<>(currentPinnedOrder);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Long l10 = arrayList.get(size);
            l10.longValue();
            if (z10 && !arrayList2.contains(l10)) {
                arrayList2.add(0, l10);
            } else if (!z10) {
                arrayList2.remove(l10);
            }
        }
        if (arrayList2.size() > (UserConfig.getInstance(this.currentAccount).isPremium() ? MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitPremium : MessagesController.getInstance(this.currentAccount).savedDialogsPinnedLimitDefault) || sameOrder(currentPinnedOrder, arrayList2)) {
            return false;
        }
        if (!z11) {
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
        if (arrayList == null) {
            return false;
        }
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        new HashSet();
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message = arrayList.get(i10);
            long savedDialogId = MessageObject.getSavedDialogId(clientUserId, message);
            if (savedDialogId == clientUserId || (message.f22401id >= 0 && (message.send_state == 0 || message.fwd_from == null))) {
                TLRPC.Message message2 = (TLRPC.Message) hVar.f(savedDialogId);
                if (message2 == null || message2.f22401id < message.f22401id) {
                    hVar.k(message, savedDialogId);
                }
                Integer num = (Integer) hVar2.f(savedDialogId);
                hVar2.k(Integer.valueOf((num == null ? 0 : num.intValue()) + 1), savedDialogId);
            }
        }
        boolean z12 = false;
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            long j10 = hVar.j(i11);
            TLRPC.Message message3 = (TLRPC.Message) hVar.n(i11);
            Integer numValueOf = (Integer) hVar2.f(j10);
            int i12 = 0;
            while (true) {
                if (i12 >= this.cachedDialogs.size()) {
                    z10 = false;
                    break;
                }
                SavedDialog savedDialog = this.cachedDialogs.get(i12);
                if (savedDialog.dialogId == j10) {
                    int i13 = savedDialog.top_message_id;
                    int i14 = message3.f22401id;
                    if (i13 < i14 || (i14 < 0 && message3.date > savedDialog.getDate())) {
                        if (savedDialog.top_message_id < message3.f22401id) {
                            int i15 = 0;
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                if (arrayList.get(i16).f22401id > savedDialog.top_message_id) {
                                    i15++;
                                }
                            }
                            savedDialog.messagesCount += i15;
                        }
                        MessageObject messageObject = new MessageObject(this.currentAccount, message3, false, false);
                        savedDialog.message = messageObject;
                        savedDialog.top_message_id = messageObject.getId();
                        z12 = true;
                    }
                    numValueOf = Integer.valueOf(numValueOf != null ? Math.max(numValueOf.intValue(), savedDialog.messagesCount) : savedDialog.messagesCount);
                    z10 = true;
                    break;
                }
                i12++;
            }
            if (!z10) {
                SavedDialog savedDialogFromMessage = SavedDialog.fromMessage(this.currentAccount, message3, true);
                if (numValueOf != null) {
                    savedDialogFromMessage.messagesCount = numValueOf.intValue();
                }
                this.cachedDialogs.add(savedDialogFromMessage);
                z12 = true;
            }
            int i17 = 0;
            while (true) {
                if (i17 >= this.loadedDialogs.size()) {
                    z11 = false;
                    break;
                }
                SavedDialog savedDialog2 = this.loadedDialogs.get(i17);
                if (savedDialog2.dialogId == j10) {
                    int i18 = savedDialog2.top_message_id;
                    int i19 = message3.f22401id;
                    if (i18 < i19 || (i19 < 0 && message3.date > savedDialog2.getDate())) {
                        if (savedDialog2.top_message_id < message3.f22401id) {
                            int i20 = 0;
                            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                                if (arrayList.get(i21).f22401id > savedDialog2.top_message_id) {
                                    i20++;
                                }
                            }
                            savedDialog2.messagesCount += i20;
                        }
                        MessageObject messageObject2 = new MessageObject(this.currentAccount, message3, false, false);
                        savedDialog2.message = messageObject2;
                        savedDialog2.top_message_id = messageObject2.getId();
                        z12 = true;
                    }
                    numValueOf = Integer.valueOf(numValueOf != null ? Math.max(numValueOf.intValue(), savedDialog2.messagesCount) : savedDialog2.messagesCount);
                    z11 = true;
                    break;
                }
                i17++;
            }
            if (!z11) {
                SavedDialog savedDialogFromMessage2 = SavedDialog.fromMessage(this.currentAccount, message3, true);
                if (numValueOf != null) {
                    savedDialogFromMessage2.messagesCount = numValueOf.intValue();
                }
                this.loadedDialogs.add(savedDialogFromMessage2);
                z12 = true;
            }
        }
        return z12;
    }

    public boolean updatedDialogCount(long j10, int i10) {
        return updatedDialogCount(j10, i10, false);
    }

    public SavedDialog findSavedDialog(ArrayList<SavedDialog> arrayList, long j10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            SavedDialog savedDialog = arrayList.get(i10);
            if (savedDialog.dialogId == j10) {
                return savedDialog;
            }
        }
        return null;
    }

    public boolean updatedDialogCount(long j10, int i10, boolean z10) {
        for (int i11 = 0; i11 < this.allDialogs.size(); i11++) {
            SavedDialog savedDialog = this.allDialogs.get(i11);
            if (savedDialog.dialogId == j10) {
                if (savedDialog.messagesCount == i10 && (savedDialog.messagesCountLoaded || !z10)) {
                    break;
                    break;
                }
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
            int iIndexOf = arrayList2.indexOf(Long.valueOf(savedDialog2.dialogId));
            if (iIndexOf >= 0) {
                savedDialog2.pinnedOrder = iIndexOf;
                savedDialog2.pinned = true;
                arrayList4.add(savedDialog2);
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        Collections.sort(arrayList, new q(28));
        Collections.sort(arrayList4, new q(29));
        arrayList.addAll(0, arrayList4);
        return true;
    }

    public void update() {
        updateAllDialogs(true);
        saveCacheSchedule();
    }
}
