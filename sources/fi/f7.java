package fi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.messenger.wz;
import org.telegram.messenger.xz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class f7 {
    public int f11708a;
    public vr f11709b;

    public static void a(fi.f7 r22, fi.q5 r23) {
        throw new UnsupportedOperationException("Method not decompiled: fi.f7.a(fi.f7, fi.q5):void");
    }

    public static void b(int i7, long j3, gj gjVar, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = gjVar.f23817k;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.f28290id) {
            message.replyStory = c(i7, j3, storyItem);
        }
        int i10 = gjVar.D;
        if (i10 == 23 || i10 == 24) {
            TLRPC.TL_messageMediaStory tL_messageMediaStory = new TLRPC.TL_messageMediaStory();
            tL_messageMediaStory.user_id = org.telegram.messenger.m5.o(gjVar.f23817k.media.peer);
            TLRPC.MessageMedia messageMedia = gjVar.f23817k.media;
            tL_messageMediaStory.peer = messageMedia.peer;
            tL_messageMediaStory.f28073id = messageMedia.f28073id;
            tL_messageMediaStory.storyItem = c(i7, j3, storyItem);
            TLRPC.Message message2 = gjVar.f23817k;
            tL_messageMediaStory.via_mention = message2.media.via_mention;
            message2.media = tL_messageMediaStory;
        }
        TLRPC.MessageMedia messageMedia2 = gjVar.f23817k.media;
        if (messageMedia2 != null && (webPage = messageMedia2.webpage) != null && webPage.attributes != null) {
            for (int i11 = 0; i11 < gjVar.f23817k.media.webpage.attributes.size(); i11++) {
                TLRPC.WebPageAttribute webPageAttribute = gjVar.f23817k.media.webpage.attributes.get(i11);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                    if (tL_webPageAttributeStory.f28196id == storyItem.f28290id) {
                        webPageAttribute.flags |= 1;
                        tL_webPageAttributeStory.storyItem = c(i7, j3, storyItem);
                    }
                }
            }
        }
    }

    public static TL_stories.StoryItem c(int i7, long j3, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        int i10 = storyItem.expire_date;
        boolean z10 = false;
        if (i10 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i10) {
            z10 = true;
        }
        if (!storyItem.pinned && z10 && j3 != 0 && j3 != m10.i(i7).f24953n) {
            TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
            tL_storyItemDeleted.f28290id = storyItem.f28290id;
            return tL_storyItemDeleted;
        }
        return storyItem;
    }

    public static int e(gj gjVar) {
        TLRPC.WebPage webPage;
        int i7 = gjVar.D;
        if (i7 != 23 && i7 != 24) {
            TLRPC.MessageMedia messageMedia = gjVar.f23817k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                for (int i10 = 0; i10 < gjVar.f23817k.media.webpage.attributes.size(); i10++) {
                    TLRPC.WebPageAttribute webPageAttribute = gjVar.f23817k.media.webpage.attributes.get(i10);
                    if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                        return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).f28196id;
                    }
                }
            }
            return gjVar.f23817k.reply_to.story_id;
        }
        return gjVar.f23817k.media.f28073id;
    }

    public final void d(a0.h hVar, Runnable runnable, int i7, boolean z10, xz xzVar) {
        f7 f7Var = this;
        xz xzVar2 = xzVar;
        int i10 = f7Var.f11708a;
        if (hVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        wz d = xz.d(xzVar2, "fillMessagesWithStories: applying stories for existing array");
        int i11 = 0;
        while (i11 < hVar.m()) {
            long j3 = hVar.j(i11);
            ArrayList arrayList2 = (ArrayList) hVar.n(i11);
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                gj gjVar = (gj) arrayList2.get(i12);
                TL_stories.StoryItem f10 = f7Var.f(e(gjVar), j3);
                if (f10 != null && !(f10 instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i10, j3, gjVar, f10);
                    arrayList.add(gjVar);
                    arrayList2.remove(i12);
                    i12--;
                    if (arrayList2.isEmpty()) {
                        Object[] objArr = hVar.f19c;
                        Object obj = objArr[i11];
                        Object obj2 = a0.i.f20a;
                        if (obj != obj2) {
                            objArr[i11] = obj2;
                            hVar.f17a = true;
                        }
                        i11--;
                    }
                }
                i12++;
            }
            i11++;
        }
        xz.a(d);
        if (z10) {
            f7Var.j(arrayList);
        }
        if (!hVar.i()) {
            int[] iArr = {hVar.m()};
            int i13 = 0;
            while (i13 < hVar.m()) {
                long j10 = hVar.j(i13);
                ArrayList arrayList3 = (ArrayList) hVar.n(i13);
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = np.s1(i10).j1(j10);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    tL_stories_getStoriesByID.f28297id.add(Integer.valueOf(e((gj) arrayList3.get(i14))));
                }
                StringBuilder t6 = a8.p0.t(j10, "fillMessagesWithStories: getStoriesByID did=", " ids=");
                t6.append(TextUtils.join(",", tL_stories_getStoriesByID.f28297id));
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new e7(f7Var, xz.d(xzVar2, t6.toString()), arrayList3, j10, z10, xzVar2, iArr, runnable));
                if (i7 != 0) {
                    ConnectionsManager.getInstance(i10).bindRequestToGuid(sendRequest, i7);
                }
                i13++;
                f7Var = this;
                xzVar2 = xzVar;
            }
            return;
        }
        runnable.run();
    }

    public final TL_stories.StoryItem f(int i7, long j3) {
        SQLiteDatabase sQLiteDatabase = this.f11709b.f27222b;
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j3 + " AND story_id = " + i7, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j3;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    f8.a(storyItem, byteBufferValue2);
                }
                if (byteBufferValue2 != null) {
                    byteBufferValue2.reuse();
                }
            }
            queryFinalized.dispose();
            return storyItem;
        } catch (SQLiteException e10) {
            org.telegram.messenger.a8.g(e10, true);
            return storyItem;
        }
    }

    public final void g(long j3, TL_stories.PeerStories peerStories) {
        SQLiteDatabase sQLiteDatabase = this.f11709b.f27222b;
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i7);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        org.telegram.messenger.a8.d("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j3);
                        executeFast.bindLong(2, storyItem.f28290id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b10 = f8.b(storyItem);
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
                sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j3 + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void h(long j3, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.f11709b.f27222b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.a8.d("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j3);
            executeFast.bindLong(2, storyItem.f28290id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = f8.b(storyItem);
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void i(int i7, long j3) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i10 = this.f11708a;
        vr vrVar = this.f11709b;
        if (j3 > 0) {
            TLRPC.UserFull b22 = np.s1(i10).b2(j3);
            if (b22 != null && (peerStories2 = b22.stories) != null) {
                peerStories2.max_read_id = i7;
                vrVar.j2(b22, false);
            }
        } else {
            TLRPC.ChatFull N0 = np.s1(i10).N0(-j3);
            if (N0 != null && (peerStories = N0.stories) != null) {
                peerStories.max_read_id = i7;
                vrVar.N1(N0, false);
            }
        }
        vrVar.f27220a.c(new c7(this, j3, i7, 0));
    }

    public final void j(List list) {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement sQLitePreparedStatement3;
        vr vrVar = this.f11709b;
        int i7 = 1;
        try {
            SQLiteDatabase sQLiteDatabase = vrVar.f27222b;
            if (!list.isEmpty()) {
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast3 = sQLiteDatabase.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast4 = sQLiteDatabase.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                int i10 = 0;
                while (i10 < list.size()) {
                    gj gjVar = (gj) list.get(i10);
                    int i11 = 0;
                    while (i11 < 2) {
                        if (gjVar.f23817k.replyStory != null) {
                            if (i11 == 0) {
                                sQLitePreparedStatement3 = executeFast;
                            } else {
                                sQLitePreparedStatement3 = executeFast2;
                            }
                            if (sQLitePreparedStatement3 == null) {
                                sQLitePreparedStatement = executeFast;
                            } else {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(gjVar.f23817k.replyStory.getObjectSize());
                                gjVar.f23817k.replyStory.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement3.requery();
                                sQLitePreparedStatement3.bindByteBuffer(i7, nativeByteBuffer);
                                sQLitePreparedStatement3.bindInteger(2, gjVar.e1());
                                sQLitePreparedStatement = executeFast;
                                sQLitePreparedStatement3.bindLong(3, gj.B0(gjVar.f23817k));
                                sQLitePreparedStatement3.step();
                            }
                        } else {
                            sQLitePreparedStatement = executeFast;
                            if (i11 == 0) {
                                sQLitePreparedStatement2 = executeFast3;
                            } else {
                                sQLitePreparedStatement2 = executeFast4;
                            }
                            if (sQLitePreparedStatement2 != null) {
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(gjVar.f23817k.getObjectSize());
                                gjVar.f23817k.serializeToStream(nativeByteBuffer2);
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer2);
                                sQLitePreparedStatement2.bindInteger(2, gjVar.e1());
                                sQLitePreparedStatement2.bindLong(3, gj.B0(gjVar.f23817k));
                                sQLitePreparedStatement2.step();
                            }
                        }
                        i11++;
                        executeFast = sQLitePreparedStatement;
                        i7 = 1;
                    }
                    i10++;
                    i7 = 1;
                }
                executeFast.dispose();
                executeFast2.dispose();
                executeFast3.dispose();
                executeFast4.dispose();
            }
        } catch (Throwable th2) {
            vrVar.o(th2, true);
        }
    }

    public final void k(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0) {
            return;
        }
        this.f11709b.f27220a.c(new bi.m1(this, j3, storyItem, 8));
    }

    public final void l(long j3, TL_stories.StoryItem storyItem) {
        if (j3 != 0 && storyItem != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.a8.d("StoriesStorage: try write deleted story");
            }
            if (l7.w(this.f11708a, storyItem)) {
                org.telegram.messenger.a8.d("StoriesStorage: try write expired story");
            }
            try {
                SQLitePreparedStatement executeFast = this.f11709b.f27222b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                executeFast.requery();
                executeFast.bindLong(1, j3);
                executeFast.bindLong(2, storyItem.f28290id);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                storyItem.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                NativeByteBuffer b10 = f8.b(storyItem);
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
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
