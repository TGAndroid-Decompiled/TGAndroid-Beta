package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.Consumer;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_update;
public final class x00 extends f1 {
    public static final int[] f19170n = new int[5];
    public final a0.h f19171a;
    public final a0.h f19172b;
    public final LongSparseIntArray f19173c;
    public final LongSparseIntArray d;
    public final a0.h e;
    public final LongSparseIntArray f19174f;
    public final a0.h h;

    public x00(int i10) {
        super(i10);
        this.f19171a = new a0.h();
        this.f19172b = new a0.h();
        this.f19173c = new LongSparseIntArray();
        this.d = new LongSparseIntArray();
        this.e = new a0.h();
        new LongSparseIntArray();
        this.f19174f = new LongSparseIntArray();
        this.h = new a0.h();
    }

    public static long p(int i10, long j10) {
        return j10 + (i10 << 12);
    }

    public final void A(int i10, long j10, boolean z10) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j11 = -j10;
        tL_messages_editForumTopic.peer = getMessagesController().i1(j11);
        tL_messages_editForumTopic.topic_id = i10;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z10;
        TLRPC.TL_forumTopic f7 = f(j10, i10);
        if (f7 != null) {
            boolean z11 = tL_messages_editForumTopic.hidden;
            f7.hidden = z11;
            if (z11) {
                f7.closed = true;
            }
            D(j11, f7, 44);
            getMessagesStorage().f2(j11, f7, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public final int B(int i10, long j10, long j11, boolean z10) {
        long j12 = -j10;
        TLRPC.TL_forumTopic f7 = f(j12, j11);
        if (f7 != null) {
            if (z10) {
                int i11 = f7.unread_poll_votes_count + i10;
                f7.unread_poll_votes_count = i11;
                if (i11 < 0) {
                    f7.unread_poll_votes_count = 0;
                }
            } else {
                f7.unread_poll_votes_count = i10;
            }
            int i12 = f7.unread_poll_votes_count;
            y(j12, true);
            return i12;
        }
        return -1;
    }

    public final int C(int i10, long j10, long j11, boolean z10) {
        long j12 = -j10;
        TLRPC.TL_forumTopic f7 = f(j12, j11);
        if (f7 != null) {
            if (z10) {
                int i11 = f7.unread_reactions_count + i10;
                f7.unread_reactions_count = i11;
                if (i11 < 0) {
                    f7.unread_reactions_count = 0;
                }
            } else {
                f7.unread_reactions_count = i10;
            }
            int i12 = f7.unread_reactions_count;
            y(j12, true);
            return i12;
        }
        return -1;
    }

    public final void D(long j10, TLRPC.TL_forumTopic tL_forumTopic, int i10) {
        long j11 = -j10;
        TLRPC.TL_forumTopic f7 = f(j11, tL_forumTopic.f19845id);
        if (f7 != null) {
            if ((i10 & 1) != 0) {
                f7.title = tL_forumTopic.title;
            }
            if ((i10 & 2) != 0) {
                f7.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i10 & 8) != 0) {
                f7.closed = tL_forumTopic.closed;
            }
            if ((i10 & 4) != 0) {
                f7.pinned = tL_forumTopic.pinned;
            }
            if ((i10 & 32) != 0) {
                f7.hidden = tL_forumTopic.hidden;
            }
            y(j11, true);
        }
    }

    public final void E(ArrayList arrayList, long j10) {
        if (j10 > 0) {
            return;
        }
        long j11 = -j10;
        i0.g3(new p00(this, j10, arrayList, w3.p0(getMessagesController().L0(Long.valueOf(j11))), j11, 0));
    }

    public final void a(long j10, ArrayList arrayList, boolean z10) {
        boolean z11;
        if (arrayList != null) {
            ArrayList l4 = l(j10);
            boolean z12 = true;
            if (l4 != null) {
                boolean z13 = false;
                for (int i10 = 0; i10 < l4.size(); i10++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l4.get(i10);
                    if (tL_forumTopic != null) {
                        int indexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.f19845id));
                        if (indexOf >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (tL_forumTopic.pinned != z11 || (z11 && tL_forumTopic.pinnedOrder != indexOf)) {
                            tL_forumTopic.pinned = z11;
                            tL_forumTopic.pinnedOrder = indexOf;
                            getMessagesStorage().f2(j10, tL_forumTopic, 4);
                            z13 = true;
                        }
                    }
                }
                z12 = z13;
            }
            if (z10 && z12) {
                i0.g3(new s00(this, 0));
            }
        }
    }

    public final void b() {
        i0.g3(new s00(this, 1));
    }

    public final void c(int i10, int i11, long j10) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j11 = -j10;
        tL_messages_deleteTopicHistory.peer = getMessagesController().i1(j11);
        tL_messages_deleteTopicHistory.top_msg_id = i10;
        if (i11 == 0) {
            hs messagesStorage = getMessagesStorage();
            messagesStorage.f15938a.c(new aq(1, j11, i10, messagesStorage));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new t00(this, j10, i10));
    }

    public final void d(ArrayList arrayList, long j10) {
        ArrayList arrayList2 = (ArrayList) this.f19171a.f(j10);
        a0.h hVar = (a0.h) this.f19172b.f(j10);
        if (hVar != null && arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long intValue = ((Integer) arrayList.get(i10)).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(intValue);
                hVar.l(intValue);
                if (tL_forumTopic != null) {
                    this.e.l(p(tL_forumTopic.top_message, j10));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            y(j10, true);
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c(((Integer) arrayList.get(i11)).intValue(), 0, j10);
        }
    }

    public final boolean e(long j10) {
        if (this.d.get(j10, 0) != 1) {
            return false;
        }
        return true;
    }

    public final TLRPC.TL_forumTopic f(long j10, long j11) {
        a0.h hVar = (a0.h) this.f19172b.f(j10);
        if (hVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(j11);
            if (tL_forumTopic == null && getMessagesController().x2(-j10)) {
                int i10 = gg.e.f7507a;
                return (TLRPC.TL_forumTopic) hVar.f((int) ((j11 >>> 32) ^ j11));
            }
            return tL_forumTopic;
        }
        return null;
    }

    public final ArrayList g(long j10) {
        ArrayList l4 = l(j10);
        ArrayList arrayList = new ArrayList();
        if (l4 != null) {
            for (int i10 = 0; i10 < l4.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l4.get(i10);
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.f19845id));
                }
            }
        }
        return arrayList;
    }

    public final void h(long j10) {
        int i10;
        int i11;
        ArrayList arrayList = (ArrayList) this.f19171a.f(j10);
        int[] iArr = f19170n;
        Arrays.fill(iArr, 0);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i12);
                int i13 = iArr[0];
                int i14 = 1;
                if (tL_forumTopic.unread_count > 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                iArr[0] = i13 + i10;
                int i15 = iArr[1];
                if (tL_forumTopic.unread_mentions_count > 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                iArr[1] = i15 + i11;
                int i16 = iArr[2];
                if (tL_forumTopic.unread_reactions_count <= 0) {
                    i14 = 0;
                }
                iArr[2] = i16 + i14;
                if (!getMessagesController().q2(-j10, tL_forumTopic.f19845id, null)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
    }

    public final CharSequence i(TLRPC.Chat chat, jj jjVar, TextPaint textPaint) {
        return j(chat, jjVar, textPaint, null);
    }

    public final CharSequence j(TLRPC.Chat chat, jj jjVar, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic f7;
        TLRPC.MessageReplyHeader messageReplyHeader = jjVar.f16337k.reply_to;
        if (messageReplyHeader != null) {
            int i10 = messageReplyHeader.reply_to_top_id;
            if (i10 == 0) {
                i10 = messageReplyHeader.reply_to_msg_id;
            }
            if (i10 != 0 && (f7 = f(chat.f19793id, i10)) != null) {
                return gg.e.j(f7, textPaint, drawableArr);
            }
            return null;
        }
        return null;
    }

    public final void k(long j10, long j11) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic f7 = f(-j10, j11);
        if (f7 != null && f7.totalMessagesCount == 0) {
            if (getMessagesController().x2(j10)) {
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
                tL_messages_getSavedHistory.peer = getMessagesController().i1(j11);
                tL_messages_getSavedHistory.parent_peer = getMessagesController().i1(j10);
                tL_messages_getSavedHistory.limit = 1;
                tL_messages_getReplies = tL_messages_getSavedHistory;
            } else {
                TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
                tL_messages_getReplies2.peer = getMessagesController().i1(j10);
                tL_messages_getReplies2.msg_id = (int) j11;
                tL_messages_getReplies2.limit = 1;
                tL_messages_getReplies = tL_messages_getReplies2;
            }
            getConnectionsManager().sendRequest(tL_messages_getReplies, new yf(this, f7, j10, j11, 2));
        }
    }

    public final ArrayList l(long j10) {
        return (ArrayList) this.f19171a.f(j10);
    }

    public final void m(final long j10, final long j11, final a3.h0 h0Var) {
        hs messagesStorage = getMessagesStorage();
        messagesStorage.f15938a.c(new d4(messagesStorage, -j10, new Consumer() {
            @Override
            public final void accept(Object obj) {
                x00 x00Var = x00.this;
                x00Var.getClass();
                i0.g3(new m9(x00Var, j10, (ArrayList) obj, j11, h0Var));
            }

            public Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, 5));
    }

    public final void n(final int r18, final long r19, final boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.x00.n(int, long, boolean):void");
    }

    public final void o(long j10) {
        n(1, j10, false);
    }

    public final void q(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        long j11 = -j10;
        a0.h hVar = this.f19172b;
        a0.h hVar2 = (a0.h) hVar.f(j11);
        if (f(j11, tL_forumTopic.f19845id) != null) {
            return;
        }
        if (hVar2 == null) {
            hVar2 = new a0.h();
            hVar.k(hVar2, j11);
        }
        a0.h hVar3 = this.f19171a;
        ArrayList arrayList = (ArrayList) hVar3.f(j11);
        if (arrayList == null) {
            arrayList = m5.i(hVar3, j11);
        }
        hVar2.k(tL_forumTopic, tL_forumTopic.f19845id);
        arrayList.add(tL_forumTopic);
        if (z10) {
            getMessagesStorage().C1(getConnectionsManager().getCurrentTime(), j10, Collections.singletonList(tL_forumTopic), false);
        }
        y(j11, true);
    }

    public final void r(long j10, TL_update.TL_updateEditForumTopic tL_updateEditForumTopic) {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.f19845id = tL_updateEditForumTopic.topic_id;
        int i11 = tL_updateEditForumTopic.flags;
        if ((i11 & 1) != 0) {
            tL_forumTopic.title = tL_updateEditForumTopic.title;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            tL_forumTopic.icon_emoji_id = tL_updateEditForumTopic.icon_emoji_id;
            i10 |= 2;
        }
        if ((i11 & 4) != 0) {
            tL_forumTopic.closed = tL_updateEditForumTopic.closed;
            i10 |= 8;
        }
        if ((i11 & 8) != 0) {
            tL_forumTopic.hidden = tL_updateEditForumTopic.hidden;
            i10 |= 32;
        }
        if (i10 == 0) {
            return;
        }
        D(j10, tL_forumTopic, i10);
        getMessagesStorage().f2(j10, tL_forumTopic, i10);
    }

    public final void s(long j10, long j11) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(gs.a(-j10, j11));
        i0.g3(new hr(20, this, arrayList));
    }

    public final void t(long j10, int i10, boolean z10, org.telegram.ui.ActionBar.k2 k2Var) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().i1(-j10);
        tL_messages_updatePinnedForumTopic.topic_id = i10;
        tL_messages_updatePinnedForumTopic.pinned = z10;
        ArrayList g10 = g(j10);
        ArrayList arrayList = new ArrayList(g10);
        arrayList.remove(Integer.valueOf(i10));
        if (z10) {
            arrayList.add(0, Integer.valueOf(i10));
        }
        a(j10, arrayList, true);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new hm(this, k2Var, j10, g10));
    }

    public final void u(long r23, java.util.ArrayList r25, a0.h r26, boolean r27, int r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.x00.u(long, java.util.ArrayList, a0.h, boolean, int, int):void");
    }

    public final void v(long j10, ArrayList arrayList, a3.h0 h0Var) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j11 = -j10;
        boolean x22 = getMessagesController().x2(j11);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        if (x22) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i10 < arrayList.size()) {
                long o10 = o5.o(((TLRPC.TL_forumTopic) arrayList.get(i10)).from_id);
                hashSet.add(Long.valueOf(o10));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().i1(o10));
                i10++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().i1(j11);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i10 < arrayList.size()) {
                i10 = c3.i0.j(((TLRPC.TL_forumTopic) arrayList.get(i10)).f19845id, i10, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().i1(j11);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new b4(this, x22, j10, hashSet, h0Var));
    }

    public final void w(ArrayList arrayList, long j10) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().i1(-j10);
        tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        tL_messages_reorderPinnedForumTopics.force = true;
        a(j10, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public final void x(long j10, long j11, int i10, int i11) {
        ?? obj = new Object();
        obj.f19034a = i10;
        obj.f19035b = i11;
        obj.f19036c = j11;
        this.h.k(obj, j10);
    }

    public final void y(long j10, boolean z10) {
        ArrayList arrayList = (ArrayList) this.f19171a.f(j10);
        if (arrayList != null) {
            if (this.f19174f.get(j10, 0) > 0) {
                Collections.sort(arrayList, new bk(23));
            }
            if (z10) {
                getNotificationCenter().k(zs.f19675q5, Long.valueOf(j10), Boolean.TRUE);
            }
        }
    }

    public final void z(int i10, long j10, boolean z10) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j11 = -j10;
        tL_messages_editForumTopic.peer = getMessagesController().i1(j11);
        tL_messages_editForumTopic.topic_id = i10;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z10;
        a0.h hVar = (a0.h) this.f19172b.f(j10);
        if (hVar != null && (tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(i10)) != null) {
            tL_forumTopic.closed = z10;
            getMessagesStorage().f2(j11, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new Object());
    }
}
