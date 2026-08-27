package jh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class h6 implements Runnable {

    public final int f13388a;

    public final j6 f13389b;

    public final MessagesStorage f13390c;

    public h6(j6 j6Var, MessagesStorage messagesStorage, int i10) {
        this.f13388a = i10;
        this.f13389b = j6Var;
        this.f13390c = messagesStorage;
    }

    @Override
    public final void run() {
        j6 j6Var;
        long j10;
        long j11;
        TLRPC.Peer peer;
        switch (this.f13388a) {
            case 0:
                MessagesStorage messagesStorage = this.f13390c;
                j6 j6Var2 = this.f13389b;
                long j12 = j6Var2.d;
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet<Long> hashSet2 = new HashSet<>();
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                ArrayList<TLRPC.Chat> arrayList4 = new ArrayList<>();
                SQLiteCursor sQLiteCursorCreateLoadStoriesCursor = null;
                try {
                    messagesStorage.getDatabase();
                    sQLiteCursorCreateLoadStoriesCursor = messagesStorage.createLoadStoriesCursor(j12, j6Var2.f13538f, j6Var2.f13537e);
                    while (sQLiteCursorCreateLoadStoriesCursor.next()) {
                        NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorCreateLoadStoriesCursor.byteBufferValue(0);
                        if (nativeByteBufferByteBufferValue != null) {
                            TL_stories.StoryItem storyItemTLdeserialize = TL_stories.StoryItem.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                            storyItemTLdeserialize.dialogId = j12;
                            storyItemTLdeserialize.messageId = storyItemTLdeserialize.f22617id;
                            MessageObject messageObject = new MessageObject(j6Var2.f13536c, storyItemTLdeserialize);
                            ArrayList<TLRPC.PrivacyRule> arrayList5 = storyItemTLdeserialize.privacy;
                            j6Var = j6Var2;
                            try {
                                int size = arrayList5.size();
                                j10 = j12;
                                int i10 = 0;
                                while (i10 < size) {
                                    TLRPC.PrivacyRule privacyRule = arrayList5.get(i10);
                                    i10++;
                                    TLRPC.PrivacyRule privacyRule2 = privacyRule;
                                    ArrayList<TLRPC.PrivacyRule> arrayList6 = arrayList5;
                                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                                        hashSet2.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                                        hashSet2.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                                    }
                                    arrayList5 = arrayList6;
                                }
                                TL_stories.StoryFwdHeader storyFwdHeader = storyItemTLdeserialize.fwd_from;
                                if (storyFwdHeader == null || (peer = storyFwdHeader.from) == null) {
                                    j11 = 0;
                                } else {
                                    j11 = 0;
                                    long peerDialogId = DialogObject.getPeerDialogId(peer);
                                    if (peerDialogId >= 0) {
                                        hashSet2.add(Long.valueOf(peerDialogId));
                                    } else {
                                        hashSet3.add(Long.valueOf(-peerDialogId));
                                    }
                                }
                                for (int i11 = 0; i11 < storyItemTLdeserialize.media_areas.size(); i11++) {
                                    if (storyItemTLdeserialize.media_areas.get(i11) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        hashSet3.add(Long.valueOf(((TL_stories.TL_mediaAreaChannelPost) storyItemTLdeserialize.media_areas.get(i11)).channel_id));
                                    }
                                }
                                TLRPC.Peer peer2 = storyItemTLdeserialize.from_id;
                                if (peer2 != null) {
                                    long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                                    if (peerDialogId2 >= j11) {
                                        hashSet2.add(Long.valueOf(peerDialogId2));
                                    } else {
                                        hashSet3.add(Long.valueOf(-peerDialogId2));
                                    }
                                }
                                messageObject.generateThumbs(false);
                                arrayList2.add(messageObject);
                                nativeByteBufferByteBufferValue.reuse();
                                if (sQLiteCursorCreateLoadStoriesCursor.intValue(1) == 1) {
                                    hashSet.add(Integer.valueOf(storyItemTLdeserialize.f22617id));
                                }
                                int iIntValue = sQLiteCursorCreateLoadStoriesCursor.intValue(2);
                                if (iIntValue > 0) {
                                    arrayList.add(Utilities.clamp(iIntValue, arrayList.size() - 1, 0), Integer.valueOf(storyItemTLdeserialize.f22617id));
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    messagesStorage.checkSQLException(th);
                                    if (sQLiteCursorCreateLoadStoriesCursor != null) {
                                        sQLiteCursorCreateLoadStoriesCursor.dispose();
                                    }
                                    AndroidUtilities.runOnUIThread(new gh.i1(j6Var, arrayList2, arrayList, arrayList3, arrayList4, hashSet, 8));
                                    return;
                                } catch (Throwable th2) {
                                    if (sQLiteCursorCreateLoadStoriesCursor != null) {
                                        sQLiteCursorCreateLoadStoriesCursor.dispose();
                                    }
                                    throw th2;
                                }
                            }
                        } else {
                            j6Var = j6Var2;
                            j10 = j12;
                        }
                        j6Var2 = j6Var;
                        j12 = j10;
                    }
                    j6Var = j6Var2;
                    sQLiteCursorCreateLoadStoriesCursor.dispose();
                    if (!hashSet2.isEmpty()) {
                        messagesStorage.getUsersInternal(hashSet2, arrayList3);
                    }
                    if (!hashSet3.isEmpty()) {
                        messagesStorage.getChatsInternal(TextUtils.join(",", hashSet3), arrayList4);
                    }
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    j6Var = j6Var2;
                }
                sQLiteCursorCreateLoadStoriesCursor.dispose();
                AndroidUtilities.runOnUIThread(new gh.i1(j6Var, arrayList2, arrayList, arrayList3, arrayList4, hashSet, 8));
                return;
            default:
                j6 j6Var3 = this.f13389b;
                MessagesStorage messagesStorage2 = this.f13390c;
                try {
                    SQLiteDatabase database = messagesStorage2.getDatabase();
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM profile_stories WHERE dialog_id = " + j6Var3.d + " AND type = " + j6Var3.f13537e).stepThis().dispose();
                    break;
                } catch (Throwable th4) {
                    messagesStorage2.checkSQLException(th4);
                }
                AndroidUtilities.runOnUIThread(new g6(j6Var3, 3));
                return;
        }
    }
}
