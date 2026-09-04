package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Timer;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class h9 {
    public int f3073a;
    public MessagesStorage f3074b;

    public static void a(bi.h9 r22, bi.q7 r23) {
        throw new UnsupportedOperationException("Method not decompiled: bi.h9.a(bi.h9, bi.q7):void");
    }

    public static void b(int i10, long j3, MessageObject messageObject, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.f20107id) {
            message.replyStory = c(i10, j3, storyItem);
        }
        int i11 = messageObject.type;
        if (i11 == 23 || i11 == 24) {
            TLRPC.TL_messageMediaStory tL_messageMediaStory = new TLRPC.TL_messageMediaStory();
            tL_messageMediaStory.user_id = DialogObject.getPeerDialogId(messageObject.messageOwner.media.peer);
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            tL_messageMediaStory.peer = messageMedia.peer;
            tL_messageMediaStory.f19891id = messageMedia.f19891id;
            tL_messageMediaStory.storyItem = c(i10, j3, storyItem);
            TLRPC.Message message2 = messageObject.messageOwner;
            tL_messageMediaStory.via_mention = message2.media.via_mention;
            message2.media = tL_messageMediaStory;
        }
        TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
        if (messageMedia2 != null && (webPage = messageMedia2.webpage) != null && webPage.attributes != null) {
            for (int i12 = 0; i12 < messageObject.messageOwner.media.webpage.attributes.size(); i12++) {
                TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i12);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                    if (tL_webPageAttributeStory.f20012id == storyItem.f20107id) {
                        webPageAttribute.flags |= 1;
                        tL_webPageAttributeStory.storyItem = c(i10, j3, storyItem);
                    }
                }
            }
        }
    }

    public static TL_stories.StoryItem c(int i10, long j3, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        int i11 = storyItem.expire_date;
        boolean z10 = false;
        if (i11 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i11) {
            z10 = true;
        }
        if (!storyItem.pinned && z10 && j3 != 0 && j3 != UserConfig.getInstance(i10).clientUserId) {
            TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
            tL_storyItemDeleted.f20107id = storyItem.f20107id;
            return tL_storyItemDeleted;
        }
        return storyItem;
    }

    public static int e(MessageObject messageObject) {
        TLRPC.WebPage webPage;
        int i10 = messageObject.type;
        if (i10 != 23 && i10 != 24) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.media.webpage.attributes.size(); i11++) {
                    TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i11);
                    if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                        return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).f20012id;
                    }
                }
            }
            return messageObject.messageOwner.reply_to.story_id;
        }
        return messageObject.messageOwner.media.f19891id;
    }

    public final void d(a0.i iVar, Runnable runnable, int i10, boolean z10, Timer timer) {
        h9 h9Var = this;
        Timer timer2 = timer;
        int i11 = h9Var.f3073a;
        if (iVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Timer.Task start = Timer.start(timer2, "fillMessagesWithStories: applying stories for existing array");
        int i12 = 0;
        while (i12 < iVar.m()) {
            long j3 = iVar.j(i12);
            ArrayList arrayList2 = (ArrayList) iVar.n(i12);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                TL_stories.StoryItem f7 = h9Var.f(e(messageObject), j3);
                if (f7 != null && !(f7 instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i11, j3, messageObject, f7);
                    arrayList.add(messageObject);
                    arrayList2.remove(i13);
                    i13--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = iVar.f21c;
                        Object obj = objArr[i12];
                        Object obj2 = a0.j.f22a;
                        if (obj != obj2) {
                            objArr[i12] = obj2;
                            iVar.f19a = true;
                        }
                        i12--;
                    }
                }
                i13++;
            }
            i12++;
        }
        Timer.done(start);
        if (z10) {
            h9Var.j(arrayList);
        }
        if (!iVar.i()) {
            int[] iArr = {iVar.m()};
            int i14 = 0;
            while (i14 < iVar.m()) {
                long j10 = iVar.j(i14);
                ArrayList arrayList3 = (ArrayList) iVar.n(i14);
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    tL_stories_getStoriesByID.f20114id.add(Integer.valueOf(e((MessageObject) arrayList3.get(i15))));
                }
                StringBuilder t10 = a4.a.t(j10, "fillMessagesWithStories: getStoriesByID did=", " ids=");
                t10.append(TextUtils.join(",", tL_stories_getStoriesByID.f20114id));
                int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new g9(h9Var, Timer.start(timer2, t10.toString()), arrayList3, j10, z10, timer2, iArr, runnable));
                if (i10 != 0) {
                    ConnectionsManager.getInstance(i11).bindRequestToGuid(sendRequest, i10);
                }
                i14++;
                h9Var = this;
                timer2 = timer;
            }
            return;
        }
        runnable.run();
    }

    public final TL_stories.StoryItem f(int i10, long j3) {
        SQLiteDatabase database = this.f3074b.getDatabase();
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j3 + " AND story_id = " + i10, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j3;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    la.a(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e7) {
            FileLog.e(e7);
            return storyItem;
        }
    }

    public final void g(long j3, TL_stories.PeerStories peerStories) {
        SQLiteDatabase database = this.f3074b.getDatabase();
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i10);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.e("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j3);
                        executeFast.bindLong(2, storyItem.f20107id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b10 = la.b(storyItem);
                        if (b10 != null) {
                            executeFast.bindByteBuffer(4, b10);
                        } else {
                            executeFast.bindNull(4);
                        }
                        if (b10 != null) {
                            b10.reuse();
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                executeFast.dispose();
                Locale locale = Locale.US;
                int i11 = peerStories.max_read_id;
                database.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + i11 + ")").stepThis().dispose();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void h(long j3, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.f3074b.getDatabase().executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                FileLog.e("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j3);
            executeFast.bindLong(2, storyItem.f20107id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = la.b(storyItem);
            if (b10 != null) {
                executeFast.bindByteBuffer(4, b10);
            } else {
                executeFast.bindNull(4);
            }
            if (b10 != null) {
                b10.reuse();
            }
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void i(int i10, long j3) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i11 = this.f3073a;
        MessagesStorage messagesStorage = this.f3074b;
        if (j3 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j3);
            if (userFull != null && (peerStories2 = userFull.stories) != null) {
                peerStories2.max_read_id = i10;
                messagesStorage.updateUserInfo(userFull, false);
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i11).getChatFull(-j3);
            if (chatFull != null && (peerStories = chatFull.stories) != null) {
                peerStories.max_read_id = i10;
                messagesStorage.updateChatInfo(chatFull, false);
            }
        }
        messagesStorage.getStorageQueue().postRunnable(new f9(this, j3, i10, 1));
    }

    public final void j(List list) {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        MessagesStorage messagesStorage = this.f3074b;
        try {
            SQLiteDatabase database = messagesStorage.getDatabase();
            if (!list.isEmpty()) {
                SQLitePreparedStatement executeFast = database.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast2 = database.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast3 = database.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast4 = database.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                for (int i10 = 0; i10 < list.size(); i10++) {
                    MessageObject messageObject = (MessageObject) list.get(i10);
                    for (int i11 = 0; i11 < 2; i11++) {
                        if (messageObject.messageOwner.replyStory != null) {
                            if (i11 == 0) {
                                sQLitePreparedStatement2 = executeFast;
                            } else {
                                sQLitePreparedStatement2 = executeFast2;
                            }
                            if (sQLitePreparedStatement2 != null) {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageObject.messageOwner.replyStory.getObjectSize());
                                messageObject.messageOwner.replyStory.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement2.bindInteger(2, messageObject.getId());
                                sQLitePreparedStatement2.bindLong(3, messageObject.getDialogId());
                                sQLitePreparedStatement2.step();
                            }
                        } else {
                            if (i11 == 0) {
                                sQLitePreparedStatement = executeFast3;
                            } else {
                                sQLitePreparedStatement = executeFast4;
                            }
                            if (sQLitePreparedStatement != null) {
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(messageObject.messageOwner.getObjectSize());
                                messageObject.messageOwner.serializeToStream(nativeByteBuffer2);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer2);
                                sQLitePreparedStatement.bindInteger(2, messageObject.getId());
                                sQLitePreparedStatement.bindLong(3, messageObject.getDialogId());
                                sQLitePreparedStatement.step();
                            }
                        }
                    }
                }
                executeFast.dispose();
                executeFast2.dispose();
                executeFast3.dispose();
                executeFast4.dispose();
            }
        } catch (Throwable th2) {
            messagesStorage.checkSQLException(th2);
        }
    }

    public final void k(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0) {
            return;
        }
        this.f3074b.getStorageQueue().postRunnable(new a3.g0(this, j3, storyItem, 5));
    }

    public final void l(long j3, TL_stories.StoryItem storyItem) {
        if (j3 != 0 && storyItem != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                FileLog.e("StoriesStorage: try write deleted story");
            }
            if (p9.w(this.f3073a, storyItem)) {
                FileLog.e("StoriesStorage: try write expired story");
            }
            try {
                SQLitePreparedStatement executeFast = this.f3074b.getDatabase().executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                executeFast.requery();
                executeFast.bindLong(1, j3);
                executeFast.bindLong(2, storyItem.f20107id);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                storyItem.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                NativeByteBuffer b10 = la.b(storyItem);
                if (b10 != null) {
                    executeFast.bindByteBuffer(4, b10);
                } else {
                    executeFast.bindNull(4);
                }
                if (b10 != null) {
                    b10.reuse();
                }
                executeFast.step();
                nativeByteBuffer.reuse();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
