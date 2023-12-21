package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.tgnet.TLRPC$Peer;
public class SavedMessagesController {
    private final int currentAccount;
    public boolean loaded;
    public boolean loading;
    public LongSparseArray<ArrayList<MessageObject>> messages = new LongSparseArray<>();

    public SavedMessagesController(int i) {
        this.currentAccount = i;
    }

    public void getSavedMessagesDialogs() {
        if (this.loaded || this.loading) {
            return;
        }
        this.loading = true;
        final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SavedMessagesController.this.lambda$getSavedMessagesDialogs$1(messagesStorage, clientUserId);
            }
        });
    }

    public void lambda$getSavedMessagesDialogs$1(MessagesStorage messagesStorage, long j) {
        TLRPC$Message TLdeserialize;
        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader;
        TLRPC$Peer tLRPC$Peer;
        SQLiteDatabase database = messagesStorage.getDatabase();
        final LongSparseArray longSparseArray = new LongSparseArray();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = database.queryFinalized("SELECT data, mid, date, send_state, read_state, custom_params FROM messages_v2 WHERE out = 0 AND uid = ?", Long.valueOf(j));
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null && (tLRPC$MessageFwdHeader = (TLdeserialize = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)).fwd_from) != null && (tLRPC$Peer = tLRPC$MessageFwdHeader.saved_from_peer) != null) {
                        long peerDialogId = DialogObject.getPeerDialogId(tLRPC$Peer);
                        TLdeserialize.id = sQLiteCursor.intValue(1);
                        TLdeserialize.date = sQLiteCursor.intValue(2);
                        TLdeserialize.send_state = sQLiteCursor.intValue(3);
                        MessageObject.setUnreadFlags(TLdeserialize, sQLiteCursor.intValue(4));
                        MessageObject messageObject = new MessageObject(this.currentAccount, TLdeserialize, true, true);
                        ArrayList arrayList = (ArrayList) longSparseArray.get(peerDialogId);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            longSparseArray.put(peerDialogId, arrayList);
                        }
                        arrayList.add(messageObject);
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SavedMessagesController.this.lambda$getSavedMessagesDialogs$0(longSparseArray);
                    }
                });
            } catch (SQLiteException e) {
                e.printStackTrace();
                if (sQLiteCursor == null) {
                    return;
                }
            }
            sQLiteCursor.dispose();
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public void lambda$getSavedMessagesDialogs$0(LongSparseArray longSparseArray) {
        this.messages.clear();
        this.messages.putAll(longSparseArray);
        this.loading = false;
    }
}
