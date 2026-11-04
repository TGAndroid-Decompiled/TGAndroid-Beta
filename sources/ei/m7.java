package ei;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class m7 {
    public int f10643a;
    public qr f10644b;

    public static void a(ei.m7 r22, ei.y5 r23) {
        throw new UnsupportedOperationException("Method not decompiled: ei.m7.a(ei.m7, ei.y5):void");
    }

    public static void b(int i3, long j10, zi ziVar, TL_stories.StoryItem storyItem) {
        TLRPC.WebPage webPage;
        TLRPC.Message message = ziVar.f26868k;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if ((messageReplyHeader instanceof TLRPC.TL_messageReplyStoryHeader) && messageReplyHeader.story_id == storyItem.f27240id) {
            message.replyStory = c(i3, j10, storyItem);
        }
        int i10 = ziVar.D;
        if (i10 == 23 || i10 == 24) {
            TLRPC.TL_messageMediaStory tL_messageMediaStory = new TLRPC.TL_messageMediaStory();
            tL_messageMediaStory.user_id = org.telegram.messenger.m5.o(ziVar.f26868k.media.peer);
            TLRPC.MessageMedia messageMedia = ziVar.f26868k.media;
            tL_messageMediaStory.peer = messageMedia.peer;
            tL_messageMediaStory.f27023id = messageMedia.f27023id;
            tL_messageMediaStory.storyItem = c(i3, j10, storyItem);
            TLRPC.Message message2 = ziVar.f26868k;
            tL_messageMediaStory.via_mention = message2.media.via_mention;
            message2.media = tL_messageMediaStory;
        }
        TLRPC.MessageMedia messageMedia2 = ziVar.f26868k.media;
        if (messageMedia2 != null && (webPage = messageMedia2.webpage) != null && webPage.attributes != null) {
            for (int i11 = 0; i11 < ziVar.f26868k.media.webpage.attributes.size(); i11++) {
                TLRPC.WebPageAttribute webPageAttribute = ziVar.f26868k.media.webpage.attributes.get(i11);
                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute;
                    if (tL_webPageAttributeStory.f27146id == storyItem.f27240id) {
                        webPageAttribute.flags |= 1;
                        tL_webPageAttributeStory.storyItem = c(i3, j10, storyItem);
                    }
                }
            }
        }
    }

    public static TL_stories.StoryItem c(int i3, long j10, TL_stories.StoryItem storyItem) {
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            return storyItem;
        }
        int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        int i10 = storyItem.expire_date;
        boolean z10 = false;
        if (i10 <= 0 ? currentTime - storyItem.date > 86400 : currentTime > i10) {
            z10 = true;
        }
        if (!storyItem.pinned && z10 && j10 != 0 && j10 != h10.i(i3).f22848n) {
            TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
            tL_storyItemDeleted.f27240id = storyItem.f27240id;
            return tL_storyItemDeleted;
        }
        return storyItem;
    }

    public static int e(zi ziVar) {
        TLRPC.WebPage webPage;
        int i3 = ziVar.D;
        if (i3 != 23 && i3 != 24) {
            TLRPC.MessageMedia messageMedia = ziVar.f26868k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                for (int i10 = 0; i10 < ziVar.f26868k.media.webpage.attributes.size(); i10++) {
                    TLRPC.WebPageAttribute webPageAttribute = ziVar.f26868k.media.webpage.attributes.get(i10);
                    if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                        return ((TLRPC.TL_webPageAttributeStory) webPageAttribute).f27146id;
                    }
                }
            }
            return ziVar.f26868k.reply_to.story_id;
        }
        return ziVar.f26868k.media.f27023id;
    }

    public final void d(a0.h hVar, Runnable runnable, int i3, boolean z10, sz szVar) {
        m7 m7Var = this;
        sz szVar2 = szVar;
        int i10 = m7Var.f10643a;
        if (hVar == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = new ArrayList();
        rz d = sz.d(szVar2, "fillMessagesWithStories: applying stories for existing array");
        int i11 = 0;
        while (i11 < hVar.m()) {
            long j10 = hVar.j(i11);
            ArrayList arrayList2 = (ArrayList) hVar.n(i11);
            int i12 = 0;
            while (i12 < arrayList2.size()) {
                zi ziVar = (zi) arrayList2.get(i12);
                TL_stories.StoryItem f10 = m7Var.f(e(ziVar), j10);
                if (f10 != null && !(f10 instanceof TL_stories.TL_storyItemSkipped)) {
                    b(i10, j10, ziVar, f10);
                    arrayList.add(ziVar);
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
        sz.a(d);
        if (z10) {
            m7Var.j(arrayList);
        }
        if (!hVar.i()) {
            int[] iArr = {hVar.m()};
            int i13 = 0;
            while (i13 < hVar.m()) {
                long j11 = hVar.j(i13);
                ArrayList arrayList3 = (ArrayList) hVar.n(i13);
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.peer = hp.s1(i10).j1(j11);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    tL_stories_getStoriesByID.f27247id.add(Integer.valueOf(e((zi) arrayList3.get(i14))));
                }
                StringBuilder t10 = a1.g.t(j11, "fillMessagesWithStories: getStoriesByID did=", " ids=");
                t10.append(TextUtils.join(",", tL_stories_getStoriesByID.f27247id));
                int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new l7(m7Var, sz.d(szVar2, t10.toString()), arrayList3, j11, z10, szVar2, iArr, runnable));
                if (i3 != 0) {
                    ConnectionsManager.getInstance(i10).bindRequestToGuid(sendRequest, i3);
                }
                i13++;
                m7Var = this;
                szVar2 = szVar;
            }
            return;
        }
        runnable.run();
    }

    public final TL_stories.StoryItem f(int i3, long j10) {
        SQLiteDatabase sQLiteDatabase = this.f10644b.f24936b;
        TL_stories.StoryItem storyItem = null;
        try {
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + j10 + " AND story_id = " + i3, new Object[0]);
            if (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                if (byteBufferValue != null) {
                    storyItem = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                    storyItem.dialogId = j10;
                    byteBufferValue.reuse();
                }
                if (storyItem != null) {
                    m8.a(storyItem, byteBufferValue2);
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

    public final void g(long j10, TL_stories.PeerStories peerStories) {
        SQLiteDatabase sQLiteDatabase = this.f10644b.f24936b;
        if (peerStories != null) {
            try {
                ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    executeFast.requery();
                    TL_stories.StoryItem storyItem = arrayList.get(i3);
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        org.telegram.messenger.a8.d("try write deleted story");
                    } else {
                        executeFast.bindLong(1, j10);
                        executeFast.bindLong(2, storyItem.f27240id);
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                        storyItem.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        NativeByteBuffer b10 = m8.b(storyItem);
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
                sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + peerStories.max_read_id + ")").stepThis().dispose();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void h(long j10, TL_stories.StoryItem storyItem) {
        try {
            SQLitePreparedStatement executeFast = this.f10644b.f24936b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.a8.d("putStoryInternal: try write deleted story");
                return;
            }
            executeFast.bindLong(1, j10);
            executeFast.bindLong(2, storyItem.f27240id);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
            storyItem.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            NativeByteBuffer b10 = m8.b(storyItem);
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

    public final void i(int i3, long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i10 = this.f10643a;
        qr qrVar = this.f10644b;
        if (j10 > 0) {
            TLRPC.UserFull b22 = hp.s1(i10).b2(j10);
            if (b22 != null && (peerStories2 = b22.stories) != null) {
                peerStories2.max_read_id = i3;
                qrVar.j2(b22, false);
            }
        } else {
            TLRPC.ChatFull N0 = hp.s1(i10).N0(-j10);
            if (N0 != null && (peerStories = N0.stories) != null) {
                peerStories.max_read_id = i3;
                qrVar.N1(N0, false);
            }
        }
        qrVar.f24934a.c(new j7(this, j10, i3, 0));
    }

    public final void j(List list) {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLitePreparedStatement sQLitePreparedStatement3;
        qr qrVar = this.f10644b;
        int i3 = 1;
        try {
            SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
            if (!list.isEmpty()) {
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("UPDATE messages_v2 SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE messages_topics SET replydata = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast3 = sQLiteDatabase.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                SQLitePreparedStatement executeFast4 = sQLiteDatabase.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                int i10 = 0;
                while (i10 < list.size()) {
                    zi ziVar = (zi) list.get(i10);
                    int i11 = 0;
                    while (i11 < 2) {
                        if (ziVar.f26868k.replyStory != null) {
                            if (i11 == 0) {
                                sQLitePreparedStatement3 = executeFast;
                            } else {
                                sQLitePreparedStatement3 = executeFast2;
                            }
                            if (sQLitePreparedStatement3 == null) {
                                sQLitePreparedStatement = executeFast;
                            } else {
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(ziVar.f26868k.replyStory.getObjectSize());
                                ziVar.f26868k.replyStory.serializeToStream(nativeByteBuffer);
                                sQLitePreparedStatement3.requery();
                                sQLitePreparedStatement3.bindByteBuffer(i3, nativeByteBuffer);
                                sQLitePreparedStatement3.bindInteger(2, ziVar.f1());
                                sQLitePreparedStatement = executeFast;
                                sQLitePreparedStatement3.bindLong(3, zi.B0(ziVar.f26868k));
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
                                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(ziVar.f26868k.getObjectSize());
                                ziVar.f26868k.serializeToStream(nativeByteBuffer2);
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer2);
                                sQLitePreparedStatement2.bindInteger(2, ziVar.f1());
                                sQLitePreparedStatement2.bindLong(3, zi.B0(ziVar.f26868k));
                                sQLitePreparedStatement2.step();
                            }
                        }
                        i11++;
                        executeFast = sQLitePreparedStatement;
                        i3 = 1;
                    }
                    i10++;
                    i3 = 1;
                }
                executeFast.dispose();
                executeFast2.dispose();
                executeFast3.dispose();
                executeFast4.dispose();
            }
        } catch (Throwable th2) {
            qrVar.o(th2, true);
        }
    }

    public final void k(long j10, TL_stories.StoryItem storyItem) {
        if (j10 == 0) {
            return;
        }
        this.f10644b.f24934a.c(new ai.r1(this, j10, storyItem, 8));
    }

    public final void l(long j10, TL_stories.StoryItem storyItem) {
        if (j10 != 0 && storyItem != null) {
            if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                org.telegram.messenger.a8.d("StoriesStorage: try write deleted story");
            }
            if (s7.w(this.f10643a, storyItem)) {
                org.telegram.messenger.a8.d("StoriesStorage: try write expired story");
            }
            try {
                SQLitePreparedStatement executeFast = this.f10644b.f24936b.executeFast("REPLACE INTO stories VALUES(?, ?, ?, ?)");
                executeFast.requery();
                executeFast.bindLong(1, j10);
                executeFast.bindLong(2, storyItem.f27240id);
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem.getObjectSize());
                storyItem.serializeToStream(nativeByteBuffer);
                executeFast.bindByteBuffer(3, nativeByteBuffer);
                NativeByteBuffer b10 = m8.b(storyItem);
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
