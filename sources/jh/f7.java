package jh;

import android.text.TextUtils;
import hh.y9;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Timer;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class f7 {

    public int f13331a;

    public MessagesStorage f13332b;

    public static void a(f7 f7Var, u5 u5Var) {
        ?? QueryFinalized;
        boolean z10;
        int i10;
        ?? r20;
        int i11;
        ?? r21;
        MessagesStorage messagesStorage = f7Var.f13332b;
        SQLiteDatabase database = messagesStorage.getDatabase();
        ArrayList<TL_stories.PeerStories> arrayList = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        ArrayList<Long> arrayList3 = new ArrayList<>();
        int i12 = f7Var.f13331a;
        ConnectionsManager.getInstance(i12).getCurrentTime();
        try {
            int i13 = 0;
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
            try {
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                while (true) {
                    z10 = true;
                    if (!sQLiteCursorQueryFinalized.next()) {
                        break;
                    }
                    long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                    longSparseIntArray.put(jLongValue, sQLiteCursorQueryFinalized.intValue(1));
                    if (jLongValue > 0) {
                        arrayList2.add(Long.valueOf(jLongValue));
                    } else {
                        arrayList3.add(Long.valueOf(jLongValue));
                    }
                    try {
                        FileLog.e(th);
                        if (QueryFinalized != 0) {
                            QueryFinalized.dispose();
                        }
                        AndroidUtilities.runOnUIThread(new y9(u5Var, 20));
                        return;
                    } catch (Throwable th) {
                        if (QueryFinalized != 0) {
                            QueryFinalized.dispose();
                        }
                        throw th;
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                int i14 = 0;
                while (i14 < longSparseIntArray.size()) {
                    long jKeyAt = longSparseIntArray.keyAt(i14);
                    int iValueAt = longSparseIntArray.valueAt(i14);
                    Locale locale = Locale.US;
                    QueryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + jKeyAt, new Object[i13]);
                    try {
                        ArrayList<TL_stories.StoryItem> arrayList4 = new ArrayList<>();
                        QueryFinalized = QueryFinalized;
                        ?? r12 = z10;
                        while (QueryFinalized.next()) {
                            LongSparseIntArray longSparseIntArray2 = longSparseIntArray;
                            ?? ByteBufferValue = QueryFinalized.byteBufferValue(i13);
                            NativeByteBuffer nativeByteBufferByteBufferValue = QueryFinalized.byteBufferValue(r12);
                            if (ByteBufferValue != 0) {
                                TL_stories.StoryItem storyItemTLdeserialize = TL_stories.StoryItem.TLdeserialize(ByteBufferValue, ByteBufferValue.readInt32(r12), r12);
                                storyItemTLdeserialize.dialogId = jKeyAt;
                                TL_stories.StoryFwdHeader storyFwdHeader = storyItemTLdeserialize.fwd_from;
                                if (storyFwdHeader != null) {
                                    TLRPC.Peer peer = storyFwdHeader.from;
                                    if (peer != null) {
                                        MessagesStorage.addLoadPeerInfo(peer, arrayList2, arrayList3);
                                    }
                                }
                                int i15 = 0;
                                QueryFinalized = QueryFinalized;
                                while (i15 < storyItemTLdeserialize.media_areas.size()) {
                                    if (storyItemTLdeserialize.media_areas.get(i15) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        i11 = i12;
                                        r21 = QueryFinalized;
                                        try {
                                            long j10 = ((TL_stories.TL_mediaAreaChannelPost) storyItemTLdeserialize.media_areas.get(i15)).channel_id;
                                            if (!arrayList3.contains(Long.valueOf(j10))) {
                                                arrayList3.add(Long.valueOf(j10));
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            QueryFinalized = r21;
                                        }
                                    } else {
                                        i11 = i12;
                                        r21 = QueryFinalized;
                                    }
                                    i15++;
                                    QueryFinalized = r21;
                                    i12 = i11;
                                }
                                i10 = i12;
                                r20 = QueryFinalized;
                                TLRPC.Peer peer2 = storyItemTLdeserialize.from_id;
                                if (peer2 != null) {
                                    MessagesStorage.addLoadPeerInfo(peer2, arrayList2, arrayList3);
                                }
                                f8.a(storyItemTLdeserialize, nativeByteBufferByteBufferValue);
                                arrayList4.add(storyItemTLdeserialize);
                                ByteBufferValue.reuse();
                            } else {
                                i10 = i12;
                                r20 = QueryFinalized;
                            }
                            if (nativeByteBufferByteBufferValue != null) {
                                nativeByteBufferByteBufferValue.reuse();
                            }
                            longSparseIntArray = longSparseIntArray2;
                            database = database;
                            QueryFinalized = r20;
                            i12 = i10;
                            i13 = 0;
                            r12 = 1;
                        }
                        LongSparseIntArray longSparseIntArray3 = longSparseIntArray;
                        SQLiteDatabase sQLiteDatabase = database;
                        int i16 = i12;
                        QueryFinalized.dispose();
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.stories = arrayList4;
                        tL_peerStories.max_read_id = iValueAt;
                        tL_peerStories.peer = MessagesController.getInstance(i16).getPeer(jKeyAt);
                        arrayList.add(tL_peerStories);
                        i14++;
                        longSparseIntArray = longSparseIntArray3;
                        database = sQLiteDatabase;
                        i12 = i16;
                        i13 = 0;
                        z10 = true;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                int i17 = i12;
                TL_stories.TL_stories_allStories tL_stories_allStories = new TL_stories.TL_stories_allStories();
                tL_stories_allStories.peer_stories = arrayList;
                tL_stories_allStories.users = messagesStorage.getUsers(arrayList2);
                tL_stories_allStories.chats = messagesStorage.getChats(arrayList3);
                int i18 = 0;
                while (i18 < tL_stories_allStories.peer_stories.size()) {
                    TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i18);
                    long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                    ArrayList<TL_stories.StoryItem> arrayList5 = peerStories.stories;
                    int currentTime = ConnectionsManager.getInstance(i17).getCurrentTime();
                    SQLiteDatabase database2 = messagesStorage.getDatabase();
                    int i19 = 0;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    while (i19 < arrayList5.size()) {
                        TL_stories.StoryItem storyItem = arrayList5.get(i19);
                        if (currentTime > arrayList5.get(i19).expire_date) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                                arrayList6 = new ArrayList();
                            }
                            arrayList7.add(Integer.valueOf(storyItem.f22617id));
                            arrayList6.add(storyItem);
                            arrayList5.remove(i19);
                            i19--;
                        }
                        i19++;
                    }
                    if (arrayList6 != null) {
                        String strJoin = TextUtils.join(", ", arrayList7);
                        try {
                            Locale locale2 = Locale.US;
                            database2.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id IN (" + strJoin + ")").stepThis().dispose();
                        } catch (SQLiteException e9) {
                            FileLog.e(e9);
                        }
                    }
                    if (peerStories.stories.isEmpty()) {
                        tL_stories_allStories.peer_stories.remove(i18);
                        i18--;
                    }
                    Collections.sort(peerStories.stories, s6.X);
                    i18++;
                }
                Collections.sort(tL_stories_allStories.peer_stories, Comparator$CC.comparingInt(new gf.d(9)));
                AndroidUtilities.runOnUIThread(new p6(3, u5Var, tL_stories_allStories));
            } catch (Throwable th4) {
                th = th4;
                QueryFinalized = sQLiteCursorQueryFinalized;
            }
        } catch (Throwable th5) {
            th = th5;
            QueryFinalized = 0;
        }
    }

    public static void b(int i10, long j10, MessageObject messageObject, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.f22617id) {
            message.replyStory = c(i10, j10, storyItem);
        }
        int i11 = messageObject.type;
        if (i11 == 23 || i11 == 24) {
            j1 j1Var = new j1();
            j1Var.user_id = DialogObject.getPeerDialogId(messageObject.messageOwner.media.peer);
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            j1Var.peer = messageMedia.peer;
            j1Var.f22402id = messageMedia.f22402id;
            j1Var.storyItem = c(i10, j10, storyItem);
            TLRPC.Message message2 = messageObject.messageOwner;
            j1Var.via_mention = message2.media.via_mention;
            message2.media = j1Var;
        }
        TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
        if (messageMedia2 == null || (webPage = messageMedia2.webpage) == null || webPage.attributes == null) {
            return;
        }
        for (int i12 = 0; i12 < messageObject.messageOwner.media.webpage.attributes.size(); i12++) {
            TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i12);
            if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                if (tL_webPageAttributeStory.f22523id == storyItem.f22617id) {
                    webPageAttribute.flags |= 1;
                    tL_webPageAttributeStory.storyItem = c(i10, j10, storyItem);
                }
            }
        }
    }

    public static TL_stories.StoryItem c(int i10, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        int i11 = storyItem.expire_date;
        boolean z10 = false;
        if (i11 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i11) {
            z10 = true;
        }
        if (storyItem.pinned || !z10 || j10 == 0 || j10 == UserConfig.getInstance(i10).clientUserId) {
            return storyItem;
        }
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_storyItemDeleted.f22617id = storyItem.f22617id;
        return tL_storyItemDeleted;
    }

    public static int e(MessageObject messageObject) {
        TLRPC.WebPage webPage;
        int i10 = messageObject.type;
        if (i10 == 23 || i10 == 24) {
            return messageObject.messageOwner.media.f22402id;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
            for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).f22523id;
                }
            }
        }
        return messageObject.messageOwner.reply_to.story_id;
    }

    public final void d(a0.h hVar, Runnable runnable, int i10, boolean z10, Timer timer) {
        f7 f7Var = this;
        Timer timer2 = timer;
        int i11 = f7Var.f13331a;
        if (hVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Timer.Task taskStart = Timer.start(timer2, "fillMessagesWithStories: applying stories for existing array");
        int i12 = 0;
        while (i12 < hVar.m()) {
            long j10 = hVar.j(i12);
            ArrayList arrayList2 = (ArrayList) hVar.n(i12);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                TL_stories.StoryItem storyItemF = f7Var.f(e(messageObject), j10);
                if (storyItemF != null && !(storyItemF instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i11, j10, messageObject, storyItemF);
                    arrayList.add(messageObject);
                    arrayList2.remove(i13);
                    i13--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = hVar.f18c;
                        Object obj = objArr[i12];
                        Object obj2 = a0.i.f19a;
                        if (obj != obj2) {
                            objArr[i12] = obj2;
                            hVar.f16a = true;
                        }
                        i12--;
                    }
                }
                i13++;
            }
            i12++;
        }
        Timer.done(taskStart);
        if (z10) {
            f7Var.j(arrayList);
        }
        if (hVar.i()) {
            runnable.run();
            return;
        }
        int[] iArr = {hVar.m()};
        int i14 = 0;
        while (i14 < hVar.m()) {
            long j11 = hVar.j(i14);
            ArrayList arrayList3 = (ArrayList) hVar.n(i14);
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i11).getInputPeer(j11);
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                tL_stories_getStoriesByID.f22624id.add(Integer.valueOf(e((MessageObject) arrayList3.get(i15))));
            }
            StringBuilder sbQ = a9.p.q(j11, "fillMessagesWithStories: getStoriesByID did=", " ids=");
            sbQ.append(TextUtils.join(",", tL_stories_getStoriesByID.f22624id));
            int iSendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new e7(f7Var, Timer.start(timer2, sbQ.toString()), arrayList3, j11, z10, timer2, iArr, runnable));
            if (i10 != 0) {
                ConnectionsManager.getInstance(i11).bindRequestToGuid(iSendRequest, i10);
            }
            i14++;
            f7Var = this;
            timer2 = timer;
        }
    }

    public final TL_stories.StoryItem f(int i10, long j10) {
        SQLiteDatabase database = this.f13332b.getDatabase();
        TL_stories.StoryItem storyItemTLdeserialize = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i10, new Object[0]);
            if (sQLiteCursorQueryFinalized.next()) {
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(1);
                if (nativeByteBufferByteBufferValue != null) {
                    storyItemTLdeserialize = TL_stories.StoryItem.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true);
                    storyItemTLdeserialize.dialogId = j10;
                    nativeByteBufferByteBufferValue.reuse();
                }
                if (storyItemTLdeserialize != null) {
                    f8.a(storyItemTLdeserialize, nativeByteBufferByteBufferValue2);
                }
                if (nativeByteBufferByteBufferValue2 != null) {
                    nativeByteBufferByteBufferValue2.reuse();
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            return storyItemTLdeserialize;
        } catch (SQLiteException e9) {
            FileLog.e(e9);
            return storyItemTLdeserialize;
        }
    }

    public final void g(long j10, TL_stories.PeerStories peerStories) {
        SQLiteDatabase database = this.f13332b.getDatabase();
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    sQLitePreparedStatementExecuteFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i10);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.e("try write deleted story");
                    } else {
                        sQLitePreparedStatementExecuteFast.bindLong(1, j10);
                        sQLitePreparedStatementExecuteFast.bindLong(2, storyItem.f22617id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer nativeByteBufferB = f8.b(storyItem);
                        if (nativeByteBufferB != null) {
                            sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBufferB);
                        } else {
                            sQLitePreparedStatementExecuteFast.bindNull(4);
                        }
                        if (nativeByteBufferB != null) {
                            nativeByteBufferB.reuse();
                        }
                        sQLitePreparedStatementExecuteFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                sQLitePreparedStatementExecuteFast.dispose();
                Locale locale = Locale.US;
                database.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public final void h(long j10, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.f13332b.getDatabase().executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                FileLog.e("putStoryInternal: try write deleted story");
                return;
            }
            sQLitePreparedStatementExecuteFast.bindLong(1, j10);
            sQLitePreparedStatementExecuteFast.bindLong(2, storyItem.f22617id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer nativeByteBufferB = f8.b(storyItem);
            if (nativeByteBufferB != null) {
                sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBufferB);
            } else {
                sQLitePreparedStatementExecuteFast.bindNull(4);
            }
            if (nativeByteBufferB != null) {
                nativeByteBufferB.reuse();
            }
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void i(int i10, long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i11 = this.f13331a;
        MessagesStorage messagesStorage = this.f13332b;
        if (j10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
            if (userFull != null && (peerStories2 = userFull.stories) != null) {
                peerStories2.max_read_id = i10;
                messagesStorage.updateUserInfo(userFull, false);
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j10);
            if (chatFull != null && (peerStories = chatFull.stories) != null) {
                peerStories.max_read_id = i10;
                messagesStorage.updateChatInfo(chatFull, false);
            }
        }
        messagesStorage.getStorageQueue().postRunnable(new d7(this, j10, i10, 1));
    }

    public final void j(List list) {
        MessagesStorage messagesStorage = this.f13332b;
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            if (list.isEmpty()) {
                return;
            }
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = database.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast3 = database.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast4 = database.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
            for (int i10 = 0; i10 < list.size(); i10++) {
                MessageObject messageObject = (MessageObject) list.get(i10);
                int i11 = 0;
                while (i11 < 2) {
                    if (messageObject.messageOwner.replyStory != null) {
                        SQLitePreparedStatement sQLitePreparedStatement = i11 == 0 ? sQLitePreparedStatementExecuteFast : sQLitePreparedStatementExecuteFast2;
                        if (sQLitePreparedStatement != null) {
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.replyStory.getObjectSize());
                            messageObject.messageOwner.replyStory.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.bindInteger(2, messageObject.getId());
                            sQLitePreparedStatement.bindLong(3, messageObject.getDialogId());
                            sQLitePreparedStatement.step();
                        }
                    } else {
                        SQLitePreparedStatement sQLitePreparedStatement2 = i11 == 0 ? sQLitePreparedStatementExecuteFast3 : sQLitePreparedStatementExecuteFast4;
                        if (sQLitePreparedStatement2 != null) {
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
                            messageObject.messageOwner.serializeToStream(nativeByteBuffer2);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer2);
                            sQLitePreparedStatement2.bindInteger(2, messageObject.getId());
                            sQLitePreparedStatement2.bindLong(3, messageObject.getDialogId());
                            sQLitePreparedStatement2.step();
                        }
                    }
                    i11++;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
            sQLitePreparedStatementExecuteFast2.dispose();
            sQLitePreparedStatementExecuteFast3.dispose();
            sQLitePreparedStatementExecuteFast4.dispose();
        } catch (Throwable th) {
            messagesStorage.checkSQLException(th);
        }
    }

    public final void k(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0) {
            return;
        }
        this.f13332b.getStorageQueue().postRunnable(new e5.u(this, j10, storyItem, 9));
    }

    public final void l(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0 || storyItem == null) {
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            FileLog.e("StoriesStorage: try write deleted story");
        }
        if (l7.w(this.f13331a, storyItem)) {
            FileLog.e("StoriesStorage: try write expired story");
        }
        try {
            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = this.f13332b.getDatabase().executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            sQLitePreparedStatementExecuteFast.requery();
            sQLitePreparedStatementExecuteFast.bindLong(1, j10);
            sQLitePreparedStatementExecuteFast.bindLong(2, storyItem.f22617id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            sQLitePreparedStatementExecuteFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer nativeByteBufferB = f8.b(storyItem);
            if (nativeByteBufferB != null) {
                sQLitePreparedStatementExecuteFast.bindByteBuffer(4, nativeByteBufferB);
            } else {
                sQLitePreparedStatementExecuteFast.bindNull(4);
            }
            if (nativeByteBufferB != null) {
                nativeByteBufferB.reuse();
            }
            sQLitePreparedStatementExecuteFast.step();
            nativeByteBuffer.reuse();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
