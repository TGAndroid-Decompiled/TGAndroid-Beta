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
public final class k00 extends c1 {
    public static final int[] f23639n = new int[5];
    public final a0.h f23640a;
    public final a0.h f23641b;
    public final LongSparseIntArray f23642c;
    public final LongSparseIntArray d;
    public final a0.h f23643e;
    public final LongSparseIntArray f23644f;
    public final a0.h h;

    public k00(int i7) {
        super(i7);
        this.f23640a = new a0.h();
        this.f23641b = new a0.h();
        this.f23642c = new LongSparseIntArray();
        this.d = new LongSparseIntArray();
        this.f23643e = new a0.h();
        new LongSparseIntArray();
        this.f23644f = new LongSparseIntArray();
        this.h = new a0.h();
    }

    public static long p(int i7, long j3) {
        return j3 + (i7 << 12);
    }

    public final void A(int i7, long j3, boolean z9) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j10 = -j3;
        tL_messages_editForumTopic.peer = getMessagesController().j1(j10);
        tL_messages_editForumTopic.topic_id = i7;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z9;
        TLRPC.TL_forumTopic f10 = f(j3, i7);
        if (f10 != null) {
            boolean z10 = tL_messages_editForumTopic.hidden;
            f10.hidden = z10;
            if (z10) {
                f10.closed = true;
            }
            D(j10, f10, 44);
            getMessagesStorage().f2(j10, f10, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public final int B(int i7, long j3, long j10, boolean z9) {
        long j11 = -j3;
        TLRPC.TL_forumTopic f10 = f(j11, j10);
        if (f10 != null) {
            if (z9) {
                int i10 = f10.unread_poll_votes_count + i7;
                f10.unread_poll_votes_count = i10;
                if (i10 < 0) {
                    f10.unread_poll_votes_count = 0;
                }
            } else {
                f10.unread_poll_votes_count = i7;
            }
            int i11 = f10.unread_poll_votes_count;
            y(j11, true);
            return i11;
        }
        return -1;
    }

    public final int C(int i7, long j3, long j10, boolean z9) {
        long j11 = -j3;
        TLRPC.TL_forumTopic f10 = f(j11, j10);
        if (f10 != null) {
            if (z9) {
                int i10 = f10.unread_reactions_count + i7;
                f10.unread_reactions_count = i10;
                if (i10 < 0) {
                    f10.unread_reactions_count = 0;
                }
            } else {
                f10.unread_reactions_count = i7;
            }
            int i11 = f10.unread_reactions_count;
            y(j11, true);
            return i11;
        }
        return -1;
    }

    public final void D(long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7) {
        long j10 = -j3;
        TLRPC.TL_forumTopic f10 = f(j10, tL_forumTopic.f27008id);
        if (f10 != null) {
            if ((i7 & 1) != 0) {
                f10.title = tL_forumTopic.title;
            }
            if ((i7 & 2) != 0) {
                f10.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i7 & 8) != 0) {
                f10.closed = tL_forumTopic.closed;
            }
            if ((i7 & 4) != 0) {
                f10.pinned = tL_forumTopic.pinned;
            }
            if ((i7 & 32) != 0) {
                f10.hidden = tL_forumTopic.hidden;
            }
            y(j10, true);
        }
    }

    public final void E(ArrayList arrayList, long j3) {
        if (j3 > 0) {
            return;
        }
        long j10 = -j3;
        g0.h3(new d00(this, j3, arrayList, t3.p0(getMessagesController().M0(Long.valueOf(j10))), j10, 0));
    }

    public final void a(long j3, ArrayList arrayList, boolean z9) {
        boolean z10;
        if (arrayList != null) {
            ArrayList l10 = l(j3);
            boolean z11 = true;
            if (l10 != null) {
                boolean z12 = false;
                for (int i7 = 0; i7 < l10.size(); i7++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i7);
                    if (tL_forumTopic != null) {
                        int indexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.f27008id));
                        if (indexOf >= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (tL_forumTopic.pinned != z10 || (z10 && tL_forumTopic.pinnedOrder != indexOf)) {
                            tL_forumTopic.pinned = z10;
                            tL_forumTopic.pinnedOrder = indexOf;
                            getMessagesStorage().f2(j3, tL_forumTopic, 4);
                            z12 = true;
                        }
                    }
                }
                z11 = z12;
            }
            if (z9 && z11) {
                g0.h3(new f00(this, 0));
            }
        }
    }

    public final void b() {
        g0.h3(new f00(this, 1));
    }

    public final void c(int i7, int i10, long j3) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j10 = -j3;
        tL_messages_deleteTopicHistory.peer = getMessagesController().j1(j10);
        tL_messages_deleteTopicHistory.top_msg_id = i7;
        if (i10 == 0) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.f26719a.c(new vp(1, j10, i7, messagesStorage));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new g00(this, j3, i7));
    }

    public final void d(ArrayList arrayList, long j3) {
        ArrayList arrayList2 = (ArrayList) this.f23640a.f(j3);
        a0.h hVar = (a0.h) this.f23641b.f(j3);
        if (hVar != null && arrayList2 != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                long intValue = ((Integer) arrayList.get(i7)).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(intValue);
                hVar.l(intValue);
                if (tL_forumTopic != null) {
                    this.f23643e.l(p(tL_forumTopic.top_message, j3));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            y(j3, true);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c(((Integer) arrayList.get(i10)).intValue(), 0, j3);
        }
    }

    public final boolean e(long j3) {
        if (this.d.get(j3, 0) != 1) {
            return false;
        }
        return true;
    }

    public final TLRPC.TL_forumTopic f(long j3, long j10) {
        a0.h hVar = (a0.h) this.f23641b.f(j3);
        if (hVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(j10);
            if (tL_forumTopic == null && getMessagesController().y2(-j3)) {
                int i7 = qg.d.f54126a;
                return (TLRPC.TL_forumTopic) hVar.f((int) ((j10 >>> 32) ^ j10));
            }
            return tL_forumTopic;
        }
        return null;
    }

    public final ArrayList g(long j3) {
        ArrayList l10 = l(j3);
        ArrayList arrayList = new ArrayList();
        if (l10 != null) {
            for (int i7 = 0; i7 < l10.size(); i7++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l10.get(i7);
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.f27008id));
                }
            }
        }
        return arrayList;
    }

    public final void h(long j3) {
        int i7;
        int i10;
        ArrayList arrayList = (ArrayList) this.f23640a.f(j3);
        int[] iArr = f23639n;
        Arrays.fill(iArr, 0);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i11);
                int i12 = iArr[0];
                int i13 = 1;
                if (tL_forumTopic.unread_count > 0) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                iArr[0] = i12 + i7;
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
                if (!getMessagesController().r2(-j3, tL_forumTopic.f27008id, null)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
    }

    public final CharSequence i(TLRPC.Chat chat, ij ijVar, TextPaint textPaint) {
        return j(chat, ijVar, textPaint, null);
    }

    public final CharSequence j(TLRPC.Chat chat, ij ijVar, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic f10;
        TLRPC.MessageReplyHeader messageReplyHeader = ijVar.f23262k.reply_to;
        if (messageReplyHeader != null) {
            int i7 = messageReplyHeader.reply_to_top_id;
            if (i7 == 0) {
                i7 = messageReplyHeader.reply_to_msg_id;
            }
            if (i7 != 0 && (f10 = f(chat.f26956id, i7)) != null) {
                return qg.d.j(f10, textPaint, drawableArr);
            }
            return null;
        }
        return null;
    }

    public final void k(long j3, long j10) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic f10 = f(-j3, j10);
        if (f10 != null && f10.totalMessagesCount == 0) {
            if (getMessagesController().y2(j3)) {
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
                tL_messages_getSavedHistory.peer = getMessagesController().j1(j10);
                tL_messages_getSavedHistory.parent_peer = getMessagesController().j1(j3);
                tL_messages_getSavedHistory.limit = 1;
                tL_messages_getReplies = tL_messages_getSavedHistory;
            } else {
                TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
                tL_messages_getReplies2.peer = getMessagesController().j1(j3);
                tL_messages_getReplies2.msg_id = (int) j10;
                tL_messages_getReplies2.limit = 1;
                tL_messages_getReplies = tL_messages_getReplies2;
            }
            getConnectionsManager().sendRequest(tL_messages_getReplies, new ag(this, f10, j3, j10, 2));
        }
    }

    public final ArrayList l(long j3) {
        return (ArrayList) this.f23640a.f(j3);
    }

    public final void m(final long j3, final long j10, final bi.h4 h4Var) {
        yr messagesStorage = getMessagesStorage();
        messagesStorage.f26719a.c(new a4(messagesStorage, -j3, new Consumer() {
            @Override
            public final void accept(Object obj) {
                k00 k00Var = k00.this;
                k00Var.getClass();
                g0.h3(new l9(k00Var, j3, (ArrayList) obj, j10, h4Var));
            }

            public Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, 5));
    }

    public final void n(final int r18, final long r19, final boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.k00.n(int, long, boolean):void");
    }

    public final void o(long j3) {
        n(1, j3, false);
    }

    public final void q(long j3, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        long j10 = -j3;
        a0.h hVar = this.f23641b;
        a0.h hVar2 = (a0.h) hVar.f(j10);
        if (f(j10, tL_forumTopic.f27008id) != null) {
            return;
        }
        if (hVar2 == null) {
            hVar2 = new a0.h();
            hVar.k(hVar2, j10);
        }
        a0.h hVar3 = this.f23640a;
        ArrayList arrayList = (ArrayList) hVar3.f(j10);
        if (arrayList == null) {
            arrayList = k5.j(hVar3, j10);
        }
        hVar2.k(tL_forumTopic, tL_forumTopic.f27008id);
        arrayList.add(tL_forumTopic);
        if (z9) {
            getMessagesStorage().C1(getConnectionsManager().getCurrentTime(), j3, Collections.singletonList(tL_forumTopic), false);
        }
        y(j10, true);
    }

    public final void r(long j3, TL_update.TL_updateEditForumTopic tL_updateEditForumTopic) {
        int i7;
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.f27008id = tL_updateEditForumTopic.topic_id;
        int i10 = tL_updateEditForumTopic.flags;
        if ((i10 & 1) != 0) {
            tL_forumTopic.title = tL_updateEditForumTopic.title;
            i7 = 1;
        } else {
            i7 = 0;
        }
        if ((i10 & 2) != 0) {
            tL_forumTopic.icon_emoji_id = tL_updateEditForumTopic.icon_emoji_id;
            i7 |= 2;
        }
        if ((i10 & 4) != 0) {
            tL_forumTopic.closed = tL_updateEditForumTopic.closed;
            i7 |= 8;
        }
        if ((i10 & 8) != 0) {
            tL_forumTopic.hidden = tL_updateEditForumTopic.hidden;
            i7 |= 32;
        }
        if (i7 == 0) {
            return;
        }
        D(j3, tL_forumTopic, i7);
        getMessagesStorage().f2(j3, tL_forumTopic, i7);
    }

    public final void s(long j3, long j10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(xr.a(-j3, j10));
        g0.h3(new zq(22, this, arrayList));
    }

    public final void t(long j3, int i7, boolean z9, org.telegram.ui.ActionBar.f2 f2Var) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().j1(-j3);
        tL_messages_updatePinnedForumTopic.topic_id = i7;
        tL_messages_updatePinnedForumTopic.pinned = z9;
        ArrayList g10 = g(j3);
        ArrayList arrayList = new ArrayList(g10);
        arrayList.remove(Integer.valueOf(i7));
        if (z9) {
            arrayList.add(0, Integer.valueOf(i7));
        }
        a(j3, arrayList, true);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new wm(this, f2Var, j3, g10));
    }

    public final void u(long r24, java.util.ArrayList r26, a0.h r27, boolean r28, int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.k00.u(long, java.util.ArrayList, a0.h, boolean, int, int):void");
    }

    public final void v(long j3, ArrayList arrayList, bi.h4 h4Var) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j10 = -j3;
        boolean y22 = getMessagesController().y2(j10);
        HashSet hashSet = new HashSet();
        int i7 = 0;
        if (y22) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i7 < arrayList.size()) {
                long o4 = m5.o(((TLRPC.TL_forumTopic) arrayList.get(i7)).from_id);
                hashSet.add(Long.valueOf(o4));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().j1(o4));
                i7++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().j1(j10);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i7 < arrayList.size()) {
                i7 = com.google.android.recaptcha.internal.a.f(((TLRPC.TL_forumTopic) arrayList.get(i7)).f27008id, i7, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().j1(j10);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new y3(this, y22, j3, hashSet, h4Var));
    }

    public final void w(ArrayList arrayList, long j3) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().j1(-j3);
        tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        tL_messages_reorderPinnedForumTopics.force = true;
        a(j3, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public final void x(long j3, long j10, int i7, int i10) {
        ?? obj = new Object();
        obj.f23461a = i7;
        obj.f23462b = i10;
        obj.f23463c = j10;
        this.h.k(obj, j3);
    }

    public final void y(long j3, boolean z9) {
        ArrayList arrayList = (ArrayList) this.f23640a.f(j3);
        if (arrayList != null) {
            if (this.f23644f.get(j3, 0) > 0) {
                Collections.sort(arrayList, new jl(21));
            }
            if (z9) {
                getNotificationCenter().k(qs.f25062q5, Long.valueOf(j3), Boolean.TRUE);
            }
        }
    }

    public final void z(int i7, long j3, boolean z9) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j10 = -j3;
        tL_messages_editForumTopic.peer = getMessagesController().j1(j10);
        tL_messages_editForumTopic.topic_id = i7;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z9;
        a0.h hVar = (a0.h) this.f23641b.f(j3);
        if (hVar != null && (tL_forumTopic = (TLRPC.TL_forumTopic) hVar.f(i7)) != null) {
            tL_forumTopic.closed = z9;
            getMessagesStorage().f2(j10, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new Object());
    }
}
