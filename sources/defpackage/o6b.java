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
public final class o6b {
    public int a;
    public kf7 b;

    public static void a(int i, long j, r47 r47Var, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = r47Var.k;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.id) {
            message.replyStory = b(i, j, storyItem);
        }
        int i2 = r47Var.D;
        if (i2 == 23 || i2 == 24) {
            TLRPC.TL_messageMediaStory tL_messageMediaStory = new TLRPC.TL_messageMediaStory();
            tL_messageMediaStory.user_id = wf3.n(r47Var.k.media.peer);
            TLRPC.MessageMedia messageMedia = r47Var.k.media;
            tL_messageMediaStory.peer = messageMedia.peer;
            tL_messageMediaStory.id = messageMedia.id;
            tL_messageMediaStory.storyItem = b(i, j, storyItem);
            TLRPC.Message message2 = r47Var.k;
            tL_messageMediaStory.via_mention = message2.media.via_mention;
            message2.media = tL_messageMediaStory;
        }
        TLRPC.MessageMedia messageMedia2 = r47Var.k.media;
        if (messageMedia2 != null && (webPage = messageMedia2.webpage) != null && webPage.attributes != null) {
            for (int i3 = 0; i3 < r47Var.k.media.webpage.attributes.size(); i3++) {
                TLRPC.WebPageAttribute webPageAttribute = r47Var.k.media.webpage.attributes.get(i3);
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
        if (!storyItem.pinned && z && j != 0 && j != yac.h(i).n) {
            TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
            tL_storyItemDeleted.id = storyItem.id;
            return tL_storyItemDeleted;
        }
        return storyItem;
    }

    public static int d(r47 r47Var) {
        TLRPC.WebPage webPage;
        int i = r47Var.D;
        if (i != 23 && i != 24) {
            TLRPC.MessageMedia messageMedia = r47Var.k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                for (int i2 = 0; i2 < r47Var.k.media.webpage.attributes.size(); i2++) {
                    TLRPC.WebPageAttribute webPageAttribute = r47Var.k.media.webpage.attributes.get(i2);
                    if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                        return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).id;
                    }
                }
            }
            return r47Var.k.reply_to.story_id;
        }
        return r47Var.k.media.id;
    }

    public final void c(zh6 zh6Var, Runnable runnable, int i, boolean z, qsb qsbVar) {
        o6b o6bVar = this;
        qsb qsbVar2 = qsbVar;
        int i2 = o6bVar.a;
        if (zh6Var == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        psb d = qsb.d(qsbVar2, "fillMessagesWithStories: applying stories for existing array");
        int i3 = 0;
        while (i3 < zh6Var.m()) {
            long j = zh6Var.j(i3);
            ArrayList arrayList2 = (ArrayList) zh6Var.n(i3);
            int i4 = 0;
            while (i4 < arrayList2.size()) {
                r47 r47Var = (r47) arrayList2.get(i4);
                TL_stories.StoryItem e = o6bVar.e(d(r47Var), j);
                if (e != null && !(e instanceof TL_stories.TL_storyItemSkipped)) {
                    a(i2, j, r47Var, e);
                    arrayList.add(r47Var);
                    arrayList2.remove(i4);
                    i4--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = zh6Var.c;
                        Object obj = objArr[i3];
                        Object obj2 = ifd.a;
                        if (obj != obj2) {
                            objArr[i3] = obj2;
                            zh6Var.a = true;
                        }
                        i3--;
                    }
                }
                i4++;
            }
            i3++;
        }
        qsb.a(d);
        if (z) {
            o6bVar.j(arrayList);
        }
        if (!zh6Var.i()) {
            int[] iArr = {zh6Var.m()};
            int i5 = 0;
            while (i5 < zh6Var.m()) {
                long j2 = zh6Var.j(i5);
                ArrayList arrayList3 = (ArrayList) zh6Var.n(i5);
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = uc7.s1(i2).j1(j2);
                for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(d((r47) arrayList3.get(i6))));
                }
                StringBuilder o = ik8.o(j2, "fillMessagesWithStories: getStoriesByID did=", " ids=");
                o.append(TextUtils.join(",", tL_stories_getStoriesByID.id));
                int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoriesByID, new fq6(o6bVar, qsb.d(qsbVar2, o.toString()), arrayList3, j2, z, qsbVar2, iArr, runnable));
                if (i != 0) {
                    ConnectionsManager.getInstance(i2).bindRequestToGuid(sendRequest, i);
                }
                i5++;
                o6bVar = this;
                qsbVar2 = qsbVar;
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
                    w7b.a(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e) {
            cc4.g(e, true);
            return storyItem;
        }
    }

    public final void f(defpackage.h5b r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o6b.f(h5b):void");
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
                        cc4.d("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j);
                        executeFast.bindLong(2, storyItem.id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b = w7b.b(storyItem);
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
                cc4.g(e, true);
            }
        }
    }

    public final void h(long j, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                cc4.d("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j);
            executeFast.bindLong(2, storyItem.id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b = w7b.b(storyItem);
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
            cc4.g(e, true);
        }
    }

    public final void i(int i, long j) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        kf7 kf7Var = this.b;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i3 = this.a;
        if (i2 > 0) {
            TLRPC.UserFull Y1 = uc7.s1(i3).Y1(j);
            if (Y1 != null && (peerStories2 = Y1.stories) != null) {
                peerStories2.max_read_id = i;
                kf7Var.l2(Y1, false);
            }
        } else {
            TLRPC.ChatFull N0 = uc7.s1(i3).N0(-j);
            if (N0 != null && (peerStories = N0.stories) != null) {
                peerStories.max_read_id = i;
                kf7Var.P1(N0, false);
            }
        }
        kf7Var.a.c(new m6b(this, j, i, (byte) 1));
    }

    public final void j(List list) {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        kf7 kf7Var = this.b;
        try {
            SQLiteDatabase sQLiteDatabase = kf7Var.b;
            if (!list.isEmpty()) {
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast3 = sQLiteDatabase.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast4 = sQLiteDatabase.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                for (int i = 0; i < list.size(); i++) {
                    r47 r47Var = (r47) list.get(i);
                    for (int i2 = 0; i2 < 2; i2++) {
                        if (r47Var.k.replyStory != null) {
                            if (i2 == 0) {
                                sQLitePreparedStatement2 = executeFast;
                            } else {
                                sQLitePreparedStatement2 = executeFast2;
                            }
                            if (sQLitePreparedStatement2 != null) {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(r47Var.k.replyStory.getObjectSize());
                                r47Var.k.replyStory.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                                sQLitePreparedStatement2.bindInteger(2, r47Var.e1());
                                sQLitePreparedStatement2.bindLong(3, r47.B0(r47Var.k));
                                sQLitePreparedStatement2.step();
                            }
                        } else {
                            if (i2 == 0) {
                                sQLitePreparedStatement = executeFast3;
                            } else {
                                sQLitePreparedStatement = executeFast4;
                            }
                            if (sQLitePreparedStatement != null) {
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(r47Var.k.getObjectSize());
                                r47Var.k.serializeToStream(nativeByteBuffer2);
                                sQLitePreparedStatement.requery();
                                sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer2);
                                sQLitePreparedStatement.bindInteger(2, r47Var.e1());
                                sQLitePreparedStatement.bindLong(3, r47.B0(r47Var.k));
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
            kf7Var.p(th, true);
        }
    }

    public final void k(long j, TL_stories.StoryItem storyItem) {
        if (j == 0) {
            return;
        }
        this.b.a.c(new j5b(this, j, storyItem, (byte) 2));
    }

    public final void l(long j, TL_stories.StoryItem storyItem) {
        if (j != 0 && storyItem != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                cc4.d("StoriesStorage: try write deleted story");
            }
            if (t6b.w(this.a, storyItem)) {
                cc4.d("StoriesStorage: try write expired story");
            }
            try {
                SQLitePreparedStatement executeFast = this.b.b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                executeFast.requery();
                executeFast.bindLong(1, j);
                executeFast.bindLong(2, storyItem.id);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                storyItem.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                NativeByteBuffer b = w7b.b(storyItem);
                if (b != null) {
                    executeFast.bindByteBuffer(4, b);
                    b.reuse();
                } else {
                    executeFast.bindNull(4);
                }
                executeFast.step();
                nativeByteBuffer.reuse();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
