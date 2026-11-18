package fi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.sz;
import org.telegram.messenger.tr;
import org.telegram.messenger.tz;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class c7 {
    public int f11817a;
    public tr f11818b;

    public static void a(fi.c7 r22, fi.o5 r23) {
        throw new UnsupportedOperationException("Method not decompiled: fi.c7.a(fi.c7, fi.o5):void");
    }

    public static void b(int i7, long j3, fj fjVar, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = fjVar.f23968k;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.f28644id) {
            message.replyStory = c(i7, j3, storyItem);
        }
        int i10 = fjVar.D;
        if (i10 == 23 || i10 == 24) {
            TLRPC.TL_messageMediaStory tL_messageMediaStory = new TLRPC.TL_messageMediaStory();
            tL_messageMediaStory.user_id = org.telegram.messenger.n5.o(fjVar.f23968k.media.peer);
            TLRPC.MessageMedia messageMedia = fjVar.f23968k.media;
            tL_messageMediaStory.peer = messageMedia.peer;
            tL_messageMediaStory.f28427id = messageMedia.f28427id;
            tL_messageMediaStory.storyItem = c(i7, j3, storyItem);
            TLRPC.Message message2 = fjVar.f23968k;
            tL_messageMediaStory.via_mention = message2.media.via_mention;
            message2.media = tL_messageMediaStory;
        }
        TLRPC.MessageMedia messageMedia2 = fjVar.f23968k.media;
        if (messageMedia2 != null && (webPage = messageMedia2.webpage) != null && webPage.attributes != null) {
            for (int i11 = 0; i11 < fjVar.f23968k.media.webpage.attributes.size(); i11++) {
                TLRPC.WebPageAttribute webPageAttribute = fjVar.f23968k.media.webpage.attributes.get(i11);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                    if (tL_webPageAttributeStory.f28550id == storyItem.f28644id) {
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
        if (!storyItem.pinned && z10 && j3 != 0 && j3 != j10.i(i7).f24792n) {
            TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
            tL_storyItemDeleted.f28644id = storyItem.f28644id;
            return tL_storyItemDeleted;
        }
        return storyItem;
    }

    public static int e(fj fjVar) {
        TLRPC.WebPage webPage;
        int i7 = fjVar.D;
        if (i7 != 23 && i7 != 24) {
            TLRPC.MessageMedia messageMedia = fjVar.f23968k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                for (int i10 = 0; i10 < fjVar.f23968k.media.webpage.attributes.size(); i10++) {
                    TLRPC.WebPageAttribute webPageAttribute = fjVar.f23968k.media.webpage.attributes.get(i10);
                    if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                        return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).f28550id;
                    }
                }
            }
            return fjVar.f23968k.reply_to.story_id;
        }
        return fjVar.f23968k.media.f28427id;
    }

    public final void d(a0.h hVar, Runnable runnable, int i7, boolean z10, tz tzVar) {
        c7 c7Var = this;
        tz tzVar2 = tzVar;
        int i10 = c7Var.f11817a;
        if (hVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        sz d = tz.d(tzVar2, "fillMessagesWithStories: applying stories for existing array");
        int i11 = 0;
        while (i11 < hVar.m()) {
            long j3 = hVar.j(i11);
            ArrayList arrayList2 = (ArrayList) hVar.n(i11);
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                fj fjVar = (fj) arrayList2.get(i12);
                TL_stories.StoryItem f10 = c7Var.f(e(fjVar), j3);
                if (f10 != null && !(f10 instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i10, j3, fjVar, f10);
                    arrayList.add(fjVar);
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
        tz.a(d);
        if (z10) {
            c7Var.j(arrayList);
        }
        if (!hVar.i()) {
            int[] iArr = {hVar.m()};
            int i13 = 0;
            while (i13 < hVar.m()) {
                long j10 = hVar.j(i13);
                ArrayList arrayList3 = (ArrayList) hVar.n(i13);
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = mp.u1(i10).l1(j10);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    tL_stories_getStoriesByID.f28651id.add(Integer.valueOf(e((fj) arrayList3.get(i14))));
                }
                StringBuilder t6 = a8.p0.t(j10, "fillMessagesWithStories: getStoriesByID did=", " ids=");
                t6.append(TextUtils.join(",", tL_stories_getStoriesByID.f28651id));
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new b7(c7Var, tz.d(tzVar2, t6.toString()), arrayList3, j10, z10, tzVar2, iArr, runnable));
                if (i7 != 0) {
                    ConnectionsManager.getInstance(i10).bindRequestToGuid(sendRequest, i7);
                }
                i13++;
                c7Var = this;
                tzVar2 = tzVar;
            }
            return;
        }
        runnable.run();
    }

    public final TL_stories.StoryItem f(int i7, long j3) {
        SQLiteDatabase sQLiteDatabase = this.f11818b.f27056b;
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
                    c8.a(storyItem, byteBufferValue2);
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
        SQLiteDatabase sQLiteDatabase = this.f11818b.f27056b;
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
                        executeFast.bindLong(2, storyItem.f28644id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b10 = c8.b(storyItem);
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
            SQLitePreparedStatement executeFast = this.f11818b.f27056b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.a8.d("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j3);
            executeFast.bindLong(2, storyItem.f28644id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = c8.b(storyItem);
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
        int i10 = this.f11817a;
        tr trVar = this.f11818b;
        if (j3 > 0) {
            TLRPC.UserFull d2 = mp.u1(i10).d2(j3);
            if (d2 != null && (peerStories2 = d2.stories) != null) {
                peerStories2.max_read_id = i7;
                trVar.j2(d2, false);
            }
        } else {
            TLRPC.ChatFull P0 = mp.u1(i10).P0(-j3);
            if (P0 != null && (peerStories = P0.stories) != null) {
                peerStories.max_read_id = i7;
                trVar.N1(P0, false);
            }
        }
        trVar.f27054a.c(new z6(this, j3, i7, 0));
    }

    public final void j(List list) {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement sQLitePreparedStatement3;
        tr trVar = this.f11818b;
        int i7 = 1;
        try {
            SQLiteDatabase sQLiteDatabase = trVar.f27056b;
            if (!list.isEmpty()) {
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast3 = sQLiteDatabase.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast4 = sQLiteDatabase.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                int i10 = 0;
                while (i10 < list.size()) {
                    fj fjVar = (fj) list.get(i10);
                    int i11 = 0;
                    while (i11 < 2) {
                        if (fjVar.f23968k.replyStory != null) {
                            if (i11 == 0) {
                                sQLitePreparedStatement3 = executeFast;
                            } else {
                                sQLitePreparedStatement3 = executeFast2;
                            }
                            if (sQLitePreparedStatement3 == null) {
                                sQLitePreparedStatement = executeFast;
                            } else {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(fjVar.f23968k.replyStory.getObjectSize());
                                fjVar.f23968k.replyStory.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement3.requery();
                                sQLitePreparedStatement3.bindByteBuffer(i7, nativeByteBuffer);
                                sQLitePreparedStatement3.bindInteger(2, fjVar.e1());
                                sQLitePreparedStatement = executeFast;
                                sQLitePreparedStatement3.bindLong(3, fj.B0(fjVar.f23968k));
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
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(fjVar.f23968k.getObjectSize());
                                fjVar.f23968k.serializeToStream(nativeByteBuffer2);
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer2);
                                sQLitePreparedStatement2.bindInteger(2, fjVar.e1());
                                sQLitePreparedStatement2.bindLong(3, fj.B0(fjVar.f23968k));
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
            trVar.o(th2, true);
        }
    }

    public final void k(long j3, TL_stories.StoryItem storyItem) {
        if (j3 == 0) {
            return;
        }
        this.f11818b.f27054a.c(new bi.m2(this, j3, storyItem, 8));
    }

    public final void l(long j3, TL_stories.StoryItem storyItem) {
        if (j3 != 0 && storyItem != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.a8.d("StoriesStorage: try write deleted story");
            }
            if (i7.w(this.f11817a, storyItem)) {
                org.telegram.messenger.a8.d("StoriesStorage: try write expired story");
            }
            try {
                SQLitePreparedStatement executeFast = this.f11818b.f27056b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                executeFast.requery();
                executeFast.bindLong(1, j3);
                executeFast.bindLong(2, storyItem.f28644id);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                storyItem.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                NativeByteBuffer b10 = c8.b(storyItem);
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
