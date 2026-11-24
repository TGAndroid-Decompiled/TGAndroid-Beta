package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class s2b {
    public int a;
    public ad7 b;

    public static void a(int i, long j, k27 k27Var, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = k27Var.k;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.id) {
            message.replyStory = b(i, j, storyItem);
        }
        int i2 = k27Var.D;
        if (i2 == 23 || i2 == 24) {
            TLRPC.TL_messageMediaStory tL_messageMediaStory = new TLRPC.TL_messageMediaStory();
            tL_messageMediaStory.user_id = cf3.n(k27Var.k.media.peer);
            TLRPC.MessageMedia messageMedia = k27Var.k.media;
            tL_messageMediaStory.peer = messageMedia.peer;
            tL_messageMediaStory.id = messageMedia.id;
            tL_messageMediaStory.storyItem = b(i, j, storyItem);
            TLRPC.Message message2 = k27Var.k;
            tL_messageMediaStory.via_mention = message2.media.via_mention;
            message2.media = tL_messageMediaStory;
        }
        TLRPC.MessageMedia messageMedia2 = k27Var.k.media;
        if (messageMedia2 != null && (webPage = messageMedia2.webpage) != null && webPage.attributes != null) {
            for (int i3 = 0; i3 < k27Var.k.media.webpage.attributes.size(); i3++) {
                TLRPC.WebPageAttribute webPageAttribute = k27Var.k.media.webpage.attributes.get(i3);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                    if (tL_webPageAttributeStory.id == storyItem.id) {
                        webPageAttribute.flags |= 1;
                        tL_webPageAttributeStory.storyItem = b(i, j, storyItem);
                    }
                }
            }
        }
    }

    public static TL_stories.StoryItem b(int i, long j, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        int i2 = storyItem.expire_date;
        boolean z = false;
        if (i2 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i2) {
            z = true;
        }
        if (!storyItem.pinned && z && j != 0 && j != y6c.h(i).n) {
            TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
            tL_storyItemDeleted.id = storyItem.id;
            return tL_storyItemDeleted;
        }
        return storyItem;
    }

    public static int d(k27 k27Var) {
        TLRPC.WebPage webPage;
        int i = k27Var.D;
        if (i != 23 && i != 24) {
            TLRPC.MessageMedia messageMedia = k27Var.k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                for (int i2 = 0; i2 < k27Var.k.media.webpage.attributes.size(); i2++) {
                    TLRPC.WebPageAttribute webPageAttribute = k27Var.k.media.webpage.attributes.get(i2);
                    if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                        return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).id;
                    }
                }
            }
            return k27Var.k.reply_to.story_id;
        }
        return k27Var.k.media.id;
    }

    public final void c(vf6 vf6Var, Runnable runnable, int i, boolean z, qob qobVar) {
        s2b s2bVar = this;
        qob qobVar2 = qobVar;
        int i2 = s2bVar.a;
        if (vf6Var == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        pob d = qob.d(qobVar2, "fillMessagesWithStories: applying stories for existing array");
        int i3 = 0;
        while (i3 < vf6Var.m()) {
            long j = vf6Var.j(i3);
            ArrayList arrayList2 = (ArrayList) vf6Var.n(i3);
            int i4 = 0;
            while (i4 < arrayList2.size()) {
                k27 k27Var = (k27) arrayList2.get(i4);
                TL_stories.StoryItem e = s2bVar.e(d(k27Var), j);
                if (e != null && !(e instanceof TL_stories.TL_storyItemSkipped)) {
                    a(i2, j, k27Var, e);
                    arrayList.add(k27Var);
                    arrayList2.remove(i4);
                    i4--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = vf6Var.c;
                        Object obj = objArr[i3];
                        Object obj2 = pad.a;
                        if (obj != obj2) {
                            objArr[i3] = obj2;
                            vf6Var.a = true;
                        }
                        i3--;
                    }
                }
                i4++;
            }
            i3++;
        }
        qob.a(d);
        if (z) {
            s2bVar.j(arrayList);
        }
        if (!vf6Var.i()) {
            int[] iArr = {vf6Var.m()};
            int i5 = 0;
            while (i5 < vf6Var.m()) {
                long j2 = vf6Var.j(i5);
                ArrayList arrayList3 = (ArrayList) vf6Var.n(i5);
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = na7.q1(i2).h1(j2);
                for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(d((k27) arrayList3.get(i6))));
                }
                StringBuilder o = ug8.o(j2, "fillMessagesWithStories: getStoriesByID did=", " ids=");
                o.append(TextUtils.join(",", tL_stories_getStoriesByID.id));
                int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoriesByID, new zp6(s2bVar, qob.d(qobVar2, o.toString()), arrayList3, j2, z, qobVar2, iArr, runnable));
                if (i != 0) {
                    ConnectionsManager.getInstance(i2).bindRequestToGuid(sendRequest, i);
                }
                i5++;
                s2bVar = this;
                qobVar2 = qobVar;
            }
            return;
        }
        runnable.run();
    }

    public final TL_stories.StoryItem e(int i, long j) {
        SQLiteDatabase sQLiteDatabase = this.b.b;
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j + " AND story_id = " + i, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    z3b.a(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e) {
            fa4.g(e, true);
            return storyItem;
        }
    }

    public final void f(defpackage.l1b r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s2b.f(l1b):void");
    }

    public final void g(long j, TL_stories.PeerStories peerStories) {
        SQLiteDatabase sQLiteDatabase = this.b.b;
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i = 0; i < arrayList.size(); i++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        fa4.d("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j);
                        executeFast.bindLong(2, storyItem.id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b = z3b.b(storyItem);
                        if (b != null) {
                            executeFast.bindByteBuffer(4, b);
                            b.reuse();
                        } else {
                            executeFast.bindNull(4);
                        }
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    }
                }
                executeFast.dispose();
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final void h(long j, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                fa4.d("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b = z3b.b(storyItem);
            if (b != null) {
                executeFast.bindByteBuffer(4, b);
                b.reuse();
            } else {
                executeFast.bindNull(4);
            }
            executeFast.step();
            nativeByteBuffer.reuse();
            executeFast.dispose();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void i(int i, long j) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        ad7 ad7Var = this.b;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i3 = this.a;
        if (i2 > 0) {
            TLRPC.UserFull W1 = na7.q1(i3).W1(j);
            if (W1 != null && (peerStories2 = W1.stories) != null) {
                peerStories2.max_read_id = i;
                ad7Var.g2(W1, false);
            }
        } else {
            TLRPC.ChatFull L0 = na7.q1(i3).L0(-j);
            if (L0 != null && (peerStories = L0.stories) != null) {
                peerStories.max_read_id = i;
                ad7Var.K1(L0, false);
            }
        }
        ad7Var.a.c(new q2b(this, j, i, (byte) 0));
    }

    public final void j(List list) {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        ad7 ad7Var = this.b;
        try {
            SQLiteDatabase sQLiteDatabase = ad7Var.b;
            if (!list.isEmpty()) {
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast3 = sQLiteDatabase.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast4 = sQLiteDatabase.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                for (int i = 0; i < list.size(); i++) {
                    k27 k27Var = (k27) list.get(i);
                    for (int i2 = 0; i2 < 2; i2++) {
                        if (k27Var.k.replyStory != null) {
                            if (i2 == 0) {
                                sQLitePreparedStatement2 = executeFast;
                            } else {
                                sQLitePreparedStatement2 = executeFast2;
                            }
                            if (sQLitePreparedStatement2 != null) {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(k27Var.k.replyStory.getObjectSize());
                                k27Var.k.replyStory.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement2.bindInteger(2, k27Var.e1());
                                sQLitePreparedStatement2.bindLong(3, k27.B0(k27Var.k));
                                sQLitePreparedStatement2.step();
                            }
                        } else {
                            if (i2 == 0) {
                                sQLitePreparedStatement = executeFast3;
                            } else {
                                sQLitePreparedStatement = executeFast4;
                            }
                            if (sQLitePreparedStatement != null) {
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(k27Var.k.getObjectSize());
                                k27Var.k.serializeToStream(nativeByteBuffer2);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer2);
                                sQLitePreparedStatement.bindInteger(2, k27Var.e1());
                                sQLitePreparedStatement.bindLong(3, k27.B0(k27Var.k));
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
        } catch (Throwable th) {
            ad7Var.n(th, true);
        }
    }

    public final void k(long j, TL_stories.StoryItem storyItem) {
        if (j == 0) {
            return;
        }
        this.b.a.c(new d2b(this, j, storyItem, (byte) 1));
    }

    public final void l(long j, TL_stories.StoryItem storyItem) {
        if (j != 0 && storyItem != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                fa4.d("StoriesStorage: try write deleted story");
            }
            if (x2b.w(this.a, storyItem)) {
                fa4.d("StoriesStorage: try write expired story");
            }
            try {
                SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindLong(2, storyItem.id);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                storyItem.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                NativeByteBuffer b = z3b.b(storyItem);
                if (b != null) {
                    executeFast.bindByteBuffer(4, b);
                    b.reuse();
                } else {
                    executeFast.bindNull(4);
                }
                executeFast.step();
                nativeByteBuffer.reuse();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
