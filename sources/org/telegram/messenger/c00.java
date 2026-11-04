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
public final class c00 extends c1 {
    public static final int[] f21921n = new int[5];
    public final a0.h f21922a;
    public final a0.h f21923b;
    public final LongSparseIntArray f21924c;
    public final LongSparseIntArray d;
    public final a0.h f21925e;
    public final LongSparseIntArray f21926f;
    public final a0.h h;

    public c00(int i3) {
        super(i3);
        this.f21922a = new a0.h();
        this.f21923b = new a0.h();
        this.f21924c = new LongSparseIntArray();
        this.d = new LongSparseIntArray();
        this.f21925e = new a0.h();
        new LongSparseIntArray();
        this.f21926f = new LongSparseIntArray();
        this.h = new a0.h();
    }

    public static long p(int i3, long j10) {
        return j10 + (i3 << 12);
    }

    public final void A(int i3, long j10, boolean z10) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j11 = -j10;
        tL_messages_editForumTopic.peer = getMessagesController().j1(j11);
        tL_messages_editForumTopic.topic_id = i3;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z10;
        TLRPC.TL_forumTopic f10 = f(j10, i3);
        if (f10 != null) {
            boolean z11 = tL_messages_editForumTopic.hidden;
            f10.hidden = z11;
            if (z11) {
                f10.closed = true;
            }
            D(j11, f10, 44);
            getMessagesStorage().f2(j11, f10, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public final int B(int i3, long j10, long j11, boolean z10) {
        long j12 = -j10;
        TLRPC.TL_forumTopic f10 = f(j12, j11);
        if (f10 != null) {
            if (z10) {
                int i10 = f10.unread_poll_votes_count + i3;
                f10.unread_poll_votes_count = i10;
                if (i10 < 0) {
                    f10.unread_poll_votes_count = 0;
                }
            } else {
                f10.unread_poll_votes_count = i3;
            }
            int i11 = f10.unread_poll_votes_count;
            y(j12, true);
            return i11;
        }
        return -1;
    }

    public final int C(int i3, long j10, long j11, boolean z10) {
        long j12 = -j10;
        TLRPC.TL_forumTopic f10 = f(j12, j11);
        if (f10 != null) {
            if (z10) {
                int i10 = f10.unread_reactions_count + i3;
                f10.unread_reactions_count = i10;
                if (i10 < 0) {
                    f10.unread_reactions_count = 0;
                }
            } else {
                f10.unread_reactions_count = i3;
            }
            int i11 = f10.unread_reactions_count;
            y(j12, true);
            return i11;
        }
        return -1;
    }

    public final void D(long j10, TLRPC.TL_forumTopic tL_forumTopic, int i3) {
        long j11 = -j10;
        TLRPC.TL_forumTopic f10 = f(j11, tL_forumTopic.f27053id);
        if (f10 != null) {
            if ((i3 & 1) != 0) {
                f10.title = tL_forumTopic.title;
            }
            if ((i3 & 2) != 0) {
                f10.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i3 & 8) != 0) {
                f10.closed = tL_forumTopic.closed;
            }
            if ((i3 & 4) != 0) {
                f10.pinned = tL_forumTopic.pinned;
            }
            if ((i3 & 32) != 0) {
                f10.hidden = tL_forumTopic.hidden;
            }
            y(j11, true);
        }
    }

    public final void E(ArrayList arrayList, long j10) {
        if (j10 > 0) {
            return;
        }
        long j11 = -j10;
        g0.h3(new vz(this, j10, arrayList, t3.p0(getMessagesController().M0(Long.valueOf(j11))), j11, 0));
    }

    public final void a(long j10, ArrayList arrayList, boolean z10) {
        boolean z11;
        if (arrayList != null) {
            ArrayList l10 = l(j10);
            boolean z12 = true;
            if (l10 != null) {
                boolean z13 = false;
                for (int i3 = 0; i3 < l10.size(); i3++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i3);
                    if (tL_forumTopic != null) {
                        int indexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.f27053id));
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
                g0.h3(new xz(this, 0));
            }
        }
    }

    public final void b() {
        g0.h3(new xz(this, 1));
    }

    public final void c(int i3, int i10, long j10) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j11 = -j10;
        tL_messages_deleteTopicHistory.peer = getMessagesController().j1(j11);
        tL_messages_deleteTopicHistory.top_msg_id = i3;
        if (i10 == 0) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new mp(1, j11, i3, messagesStorage));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new yz(this, j10, i3));
    }

    public final void d(ArrayList arrayList, long j10) {
        ArrayList arrayList2 = (ArrayList) this.f21922a.f(j10);
        a0.h hVar = (a0.h) this.f21923b.f(j10);
        if (hVar != null && arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                long intValue = ((Integer) arrayList.get(i3)).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(intValue);
                hVar.l(intValue);
                if (tL_forumTopic != null) {
                    this.f21925e.l(p(tL_forumTopic.top_message, j10));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            y(j10, true);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c(((Integer) arrayList.get(i10)).intValue(), 0, j10);
        }
    }

    public final boolean e(long j10) {
        if (this.d.get(j10, 0) != 1) {
            return false;
        }
        return true;
    }

    public final TLRPC.TL_forumTopic f(long j10, long j11) {
        a0.h hVar = (a0.h) this.f21923b.f(j10);
        if (hVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(j11);
            if (tL_forumTopic == null && getMessagesController().y2(-j10)) {
                int i3 = rg.c.f54516a;
                return (TLRPC.TL_forumTopic) hVar.f((int) ((j11 >>> 32) ^ j11));
            }
            return tL_forumTopic;
        }
        return null;
    }

    public final ArrayList g(long j10) {
        ArrayList l10 = l(j10);
        ArrayList arrayList = new ArrayList();
        if (l10 != null) {
            for (int i3 = 0; i3 < l10.size(); i3++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i3);
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.f27053id));
                }
            }
        }
        return arrayList;
    }

    public final void h(long j10) {
        int i3;
        int i10;
        ArrayList arrayList = (ArrayList) this.f21922a.f(j10);
        int[] iArr = f21921n;
        Arrays.fill(iArr, 0);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i11);
                int i12 = iArr[0];
                int i13 = 1;
                if (tL_forumTopic.unread_count > 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                iArr[0] = i12 + i3;
                int i14 = iArr[1];
                if (tL_forumTopic.unread_mentions_count > 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                iArr[1] = i14 + i10;
                int i15 = iArr[2];
                if (tL_forumTopic.unread_reactions_count <= 0) {
                    i13 = 0;
                }
                iArr[2] = i15 + i13;
                if (!getMessagesController().r2(-j10, tL_forumTopic.f27053id, null)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
    }

    public final CharSequence i(TLRPC.Chat chat, zi ziVar, TextPaint textPaint) {
        return j(chat, ziVar, textPaint, null);
    }

    public final CharSequence j(TLRPC.Chat chat, zi ziVar, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic f10;
        TLRPC.MessageReplyHeader messageReplyHeader = ziVar.f26868k.reply_to;
        if (messageReplyHeader != null) {
            int i3 = messageReplyHeader.reply_to_top_id;
            if (i3 == 0) {
                i3 = messageReplyHeader.reply_to_msg_id;
            }
            if (i3 != 0 && (f10 = f(chat.f27001id, i3)) != null) {
                return rg.c.j(f10, textPaint, drawableArr);
            }
            return null;
        }
        return null;
    }

    public final void k(long j10, long j11) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic f10 = f(-j10, j11);
        if (f10 != null && f10.totalMessagesCount == 0) {
            if (getMessagesController().y2(j10)) {
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
                tL_messages_getSavedHistory.peer = getMessagesController().j1(j11);
                tL_messages_getSavedHistory.parent_peer = getMessagesController().j1(j10);
                tL_messages_getSavedHistory.limit = 1;
                tL_messages_getReplies = tL_messages_getSavedHistory;
            } else {
                TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
                tL_messages_getReplies2.peer = getMessagesController().j1(j10);
                tL_messages_getReplies2.msg_id = (int) j11;
                tL_messages_getReplies2.limit = 1;
                tL_messages_getReplies = tL_messages_getReplies2;
            }
            getConnectionsManager().sendRequest(tL_messages_getReplies, new sf(this, f10, j10, j11, 2));
        }
    }

    public final ArrayList l(long j10) {
        return (ArrayList) this.f21922a.f(j10);
    }

    public final void m(final long j10, final long j11, final c3.f0 f0Var) {
        qr messagesStorage = getMessagesStorage();
        messagesStorage.f24934a.c(new a4(messagesStorage, -j10, new Consumer() {
            @Override
            public final void accept(Object obj) {
                c00 c00Var = c00.this;
                c00Var.getClass();
                g0.h3(new f9(c00Var, j10, (ArrayList) obj, j11, f0Var));
            }

            public Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, 5));
    }

    public final void n(final int r18, final long r19, final boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.c00.n(int, long, boolean):void");
    }

    public final void o(long j10) {
        n(1, j10, false);
    }

    public final void q(long j10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        long j11 = -j10;
        a0.h hVar = this.f21923b;
        a0.h hVar2 = (a0.h) hVar.f(j11);
        if (f(j11, tL_forumTopic.f27053id) != null) {
            return;
        }
        if (hVar2 == null) {
            hVar2 = new a0.h();
            hVar.k(hVar2, j11);
        }
        a0.h hVar3 = this.f21922a;
        ArrayList arrayList = (ArrayList) hVar3.f(j11);
        if (arrayList == null) {
            arrayList = k5.j(hVar3, j11);
        }
        hVar2.k(tL_forumTopic, tL_forumTopic.f27053id);
        arrayList.add(tL_forumTopic);
        if (z10) {
            getMessagesStorage().C1(getConnectionsManager().getCurrentTime(), j10, Collections.singletonList(tL_forumTopic), false);
        }
        y(j11, true);
    }

    public final void r(long j10, TL_update.TL_updateEditForumTopic tL_updateEditForumTopic) {
        int i3;
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.f27053id = tL_updateEditForumTopic.topic_id;
        int i10 = tL_updateEditForumTopic.flags;
        if ((i10 & 1) != 0) {
            tL_forumTopic.title = tL_updateEditForumTopic.title;
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i10 & 2) != 0) {
            tL_forumTopic.icon_emoji_id = tL_updateEditForumTopic.icon_emoji_id;
            i3 |= 2;
        }
        if ((i10 & 4) != 0) {
            tL_forumTopic.closed = tL_updateEditForumTopic.closed;
            i3 |= 8;
        }
        if ((i10 & 8) != 0) {
            tL_forumTopic.hidden = tL_updateEditForumTopic.hidden;
            i3 |= 32;
        }
        if (i3 == 0) {
            return;
        }
        D(j10, tL_forumTopic, i3);
        getMessagesStorage().f2(j10, tL_forumTopic, i3);
    }

    public final void s(long j10, long j11) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(pr.a(-j10, j11));
        g0.h3(new pq(22, this, arrayList));
    }

    public final void t(long j10, int i3, boolean z10, org.telegram.ui.ActionBar.d2 d2Var) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().j1(-j10);
        tL_messages_updatePinnedForumTopic.topic_id = i3;
        tL_messages_updatePinnedForumTopic.pinned = z10;
        ArrayList g7 = g(j10);
        ArrayList arrayList = new ArrayList(g7);
        arrayList.remove(Integer.valueOf(i3));
        if (z10) {
            arrayList.add(0, Integer.valueOf(i3));
        }
        a(j10, arrayList, true);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new mm(this, d2Var, j10, g7));
    }

    public final void u(long r24, java.util.ArrayList r26, a0.h r27, boolean r28, int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.c00.u(long, java.util.ArrayList, a0.h, boolean, int, int):void");
    }

    public final void v(long j10, ArrayList arrayList, c3.f0 f0Var) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j11 = -j10;
        boolean y22 = getMessagesController().y2(j11);
        HashSet hashSet = new HashSet();
        int i3 = 0;
        if (y22) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i3 < arrayList.size()) {
                long o10 = m5.o(((TLRPC.TL_forumTopic) arrayList.get(i3)).from_id);
                hashSet.add(Long.valueOf(o10));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().j1(o10));
                i3++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().j1(j11);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i3 < arrayList.size()) {
                i3 = com.google.android.recaptcha.internal.a.f(((TLRPC.TL_forumTopic) arrayList.get(i3)).f27053id, i3, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().j1(j11);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new y3(this, y22, j10, hashSet, f0Var));
    }

    public final void w(ArrayList arrayList, long j10) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().j1(-j10);
        tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        tL_messages_reorderPinnedForumTopics.force = true;
        a(j10, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public final void x(long j10, long j11, int i3, int i10) {
        ?? obj = new Object();
        obj.f21694a = i3;
        obj.f21695b = i10;
        obj.f21696c = j11;
        this.h.k(obj, j10);
    }

    public final void y(long j10, boolean z10) {
        ArrayList arrayList = (ArrayList) this.f21922a.f(j10);
        if (arrayList != null) {
            if (this.f21926f.get(j10, 0) > 0) {
                Collections.sort(arrayList, new tq(11));
            }
            if (z10) {
                getNotificationCenter().k(hs.f23291q5, Long.valueOf(j10), Boolean.TRUE);
            }
        }
    }

    public final void z(int i3, long j10, boolean z10) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j11 = -j10;
        tL_messages_editForumTopic.peer = getMessagesController().j1(j11);
        tL_messages_editForumTopic.topic_id = i3;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z10;
        a0.h hVar = (a0.h) this.f21923b.f(j10);
        if (hVar != null && (tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(i3)) != null) {
            tL_forumTopic.closed = z10;
            getMessagesStorage().f2(j11, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new Object());
    }
}
