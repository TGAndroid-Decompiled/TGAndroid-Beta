package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.Consumer;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
public final class pub extends pf0 {
    public static final int[] w = new int[5];
    public vf6 a;
    public vf6 b;
    public LongSparseIntArray c;
    public LongSparseIntArray d;
    public vf6 e;
    public vf6 f;
    public LongSparseLongArray h;
    public LongSparseIntArray n;
    public LongSparseIntArray r;
    public vf6 s;

    public static long p(int i, long j) {
        return j + (i << 12);
    }

    public final void A(int i, long j, boolean z) {
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j2 = -j;
        tL_messages_editForumTopic.peer = getMessagesController().h1(j2);
        tL_messages_editForumTopic.topic_id = i;
        tL_messages_editForumTopic.flags = 8;
        tL_messages_editForumTopic.hidden = !z;
        TLRPC.TL_forumTopic f = f(j, i);
        if (f != null) {
            boolean z2 = tL_messages_editForumTopic.hidden;
            f.hidden = z2;
            if (z2) {
                f.closed = true;
            }
            D(j2, f, 44);
            getMessagesStorage().c2(j2, f, 44);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, null);
    }

    public final int B(int i, long j, long j2, boolean z) {
        long j3 = -j;
        TLRPC.TL_forumTopic f = f(j3, j2);
        if (f != null) {
            if (z) {
                i += f.unread_poll_votes_count;
                f.unread_poll_votes_count = i;
                if (i < 0) {
                    i = 0;
                    f.unread_poll_votes_count = 0;
                }
            } else {
                f.unread_poll_votes_count = i;
            }
            y(j3, true);
            return i;
        }
        return -1;
    }

    public final int C(int i, long j, long j2, boolean z) {
        long j3 = -j;
        TLRPC.TL_forumTopic f = f(j3, j2);
        if (f != null) {
            if (z) {
                i += f.unread_reactions_count;
                f.unread_reactions_count = i;
                if (i < 0) {
                    i = 0;
                    f.unread_reactions_count = 0;
                }
            } else {
                f.unread_reactions_count = i;
            }
            y(j3, true);
            return i;
        }
        return -1;
    }

    public final void D(long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        long j2 = -j;
        TLRPC.TL_forumTopic f = f(j2, tL_forumTopic.id);
        if (f != null) {
            if ((i & 1) != 0) {
                f.title = tL_forumTopic.title;
            }
            if ((i & 2) != 0) {
                f.icon_emoji_id = tL_forumTopic.icon_emoji_id;
            }
            if ((i & 8) != 0) {
                f.closed = tL_forumTopic.closed;
            }
            if ((i & 4) != 0) {
                f.pinned = tL_forumTopic.pinned;
            }
            if ((i & 32) != 0) {
                f.hidden = tL_forumTopic.hidden;
            }
            y(j2, true);
        }
    }

    public final void E(ArrayList arrayList, long j) {
        if (j > 0) {
            return;
        }
        long j2 = -j;
        gl.c3(new fub(this, j, arrayList, hc2.p0(getMessagesController().K0(Long.valueOf(j2))), j2, (byte) 0));
    }

    public final void a(long j, ArrayList arrayList, boolean z) {
        boolean z2;
        if (arrayList != null) {
            ArrayList l = l(j);
            boolean z3 = true;
            if (l != null) {
                boolean z4 = false;
                for (int i = 0; i < l.size(); i++) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i);
                    if (tL_forumTopic != null) {
                        int indexOf = arrayList.indexOf(Integer.valueOf(tL_forumTopic.id));
                        if (indexOf >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (tL_forumTopic.pinned != z2 || (z2 && tL_forumTopic.pinnedOrder != indexOf)) {
                            tL_forumTopic.pinned = z2;
                            tL_forumTopic.pinnedOrder = indexOf;
                            getMessagesStorage().c2(j, tL_forumTopic, 4);
                            z4 = true;
                        }
                    }
                }
                z3 = z4;
            }
            if (z && z3) {
                gl.c3(new jub(this, (byte) 0));
            }
        }
    }

    public final void b() {
        gl.c3(new jub(this, (byte) 1));
    }

    public final void c(int i, int i2, long j) {
        TL_forum.TL_messages_deleteTopicHistory tL_messages_deleteTopicHistory = new TL_forum.TL_messages_deleteTopicHistory();
        long j2 = -j;
        tL_messages_deleteTopicHistory.peer = getMessagesController().h1(j2);
        tL_messages_deleteTopicHistory.top_msg_id = i;
        if (i2 == 0) {
            ad7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new sa7(messagesStorage, j2, i, (byte) 1));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_deleteTopicHistory, new kub(this, j, i));
    }

    public final void d(ArrayList arrayList, long j) {
        ArrayList arrayList2 = (ArrayList) this.a.f(j);
        vf6 vf6Var = (vf6) this.b.f(j);
        if (vf6Var != null && arrayList2 != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                long intValue = ((Integer) arrayList.get(i)).intValue();
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) vf6Var.f(intValue);
                vf6Var.l(intValue);
                if (tL_forumTopic != null) {
                    this.e.l(p(tL_forumTopic.top_message, j));
                    arrayList2.remove(tL_forumTopic);
                }
            }
            y(j, true);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            c(((Integer) arrayList.get(i2)).intValue(), 0, j);
        }
    }

    public final boolean e(long j) {
        if (this.d.get(j, 0) != 1) {
            return false;
        }
        return true;
    }

    public final TLRPC.TL_forumTopic f(long j, long j2) {
        vf6 vf6Var = (vf6) this.b.f(j);
        if (vf6Var != null) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) vf6Var.f(j2);
            if (tL_forumTopic == null && getMessagesController().x2(-j)) {
                int i = mm4.a;
                return (TLRPC.TL_forumTopic) vf6Var.f((int) (j2 ^ (j2 >>> 32)));
            }
            return tL_forumTopic;
        }
        return null;
    }

    public final ArrayList g(long j) {
        ArrayList l = l(j);
        ArrayList arrayList = new ArrayList();
        if (l != null) {
            for (int i = 0; i < l.size(); i++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) l.get(i);
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.id));
                }
            }
        }
        return arrayList;
    }

    public final void h(long j) {
        int i;
        int i2;
        ArrayList arrayList = (ArrayList) this.a.f(j);
        int[] iArr = w;
        Arrays.fill(iArr, 0);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i3);
                int i4 = iArr[0];
                int i5 = 1;
                if (tL_forumTopic.unread_count > 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                iArr[0] = i4 + i;
                int i6 = iArr[1];
                if (tL_forumTopic.unread_mentions_count > 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                iArr[1] = i6 + i2;
                int i7 = iArr[2];
                if (tL_forumTopic.unread_reactions_count <= 0) {
                    i5 = 0;
                }
                iArr[2] = i7 + i5;
                if (!getMessagesController().n2(-j, tL_forumTopic.id, null)) {
                    iArr[3] = iArr[3] + tL_forumTopic.unread_count;
                }
                iArr[4] = iArr[4] + tL_forumTopic.unread_poll_votes_count;
            }
        }
    }

    public final CharSequence i(TLRPC.Chat chat, k27 k27Var, TextPaint textPaint) {
        return j(chat, k27Var, textPaint, null);
    }

    public final CharSequence j(TLRPC.Chat chat, k27 k27Var, TextPaint textPaint, Drawable[] drawableArr) {
        TLRPC.TL_forumTopic f;
        TLRPC.MessageReplyHeader messageReplyHeader = k27Var.k.reply_to;
        if (messageReplyHeader != null) {
            int i = messageReplyHeader.reply_to_top_id;
            if (i == 0) {
                i = messageReplyHeader.reply_to_msg_id;
            }
            if (i != 0 && (f = f(chat.id, i)) != null) {
                return mm4.k(f, textPaint, drawableArr);
            }
            return null;
        }
        return null;
    }

    public final void k(long j, long j2) {
        TLRPC.TL_messages_getReplies tL_messages_getReplies;
        TLRPC.TL_forumTopic f = f(-j, j2);
        if (f != null && f.totalMessagesCount == 0) {
            if (getMessagesController().x2(j)) {
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = new TLRPC.TL_messages_getSavedHistory();
                tL_messages_getSavedHistory.peer = getMessagesController().h1(j2);
                tL_messages_getSavedHistory.parent_peer = getMessagesController().h1(j);
                tL_messages_getSavedHistory.limit = 1;
                tL_messages_getReplies = tL_messages_getSavedHistory;
            } else {
                TLRPC.TL_messages_getReplies tL_messages_getReplies2 = new TLRPC.TL_messages_getReplies();
                tL_messages_getReplies2.peer = getMessagesController().h1(j);
                tL_messages_getReplies2.msg_id = (int) j2;
                tL_messages_getReplies2.limit = 1;
                tL_messages_getReplies = tL_messages_getReplies2;
            }
            getConnectionsManager().sendRequest(tL_messages_getReplies, new pn6(this, f, j, j2, (byte) 3));
        }
    }

    public final ArrayList l(long j) {
        return (ArrayList) this.a.f(j);
    }

    public final void m(final long j, final long j2, final n30 n30Var) {
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new de2(messagesStorage, -j, new Consumer() {
            @Override
            public final void accept(Object obj) {
                pub pubVar = pub.this;
                pubVar.getClass();
                gl.c3(new dt4(pubVar, j, (ArrayList) obj, j2, n30Var));
            }

            public final Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, (byte) 5));
    }

    public final void n(final int r18, final long r19, final boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pub.n(int, long, boolean):void");
    }

    public final void o(long j) {
        n(1, j, false);
    }

    public final void q(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        vf6 vf6Var = this.a;
        vf6 vf6Var2 = this.b;
        long j2 = -j;
        vf6 vf6Var3 = (vf6) vf6Var2.f(j2);
        if (f(j2, tL_forumTopic.id) != null) {
            return;
        }
        if (vf6Var3 == null) {
            vf6Var3 = new vf6();
            vf6Var2.k(vf6Var3, j2);
        }
        ArrayList arrayList = (ArrayList) vf6Var.f(j2);
        if (arrayList == null) {
            arrayList = tb4.s(vf6Var, j2);
        }
        vf6Var3.k(tL_forumTopic, tL_forumTopic.id);
        arrayList.add(tL_forumTopic);
        if (z) {
            getMessagesStorage().z1(getConnectionsManager().getCurrentTime(), j, Collections.singletonList(tL_forumTopic), false);
        }
        y(j2, true);
    }

    public final void r(long j, TL_update.TL_updateEditForumTopic tL_updateEditForumTopic) {
        int i;
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.id = tL_updateEditForumTopic.topic_id;
        int i2 = tL_updateEditForumTopic.flags;
        if ((i2 & 1) != 0) {
            tL_forumTopic.title = tL_updateEditForumTopic.title;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            tL_forumTopic.icon_emoji_id = tL_updateEditForumTopic.icon_emoji_id;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            tL_forumTopic.closed = tL_updateEditForumTopic.closed;
            i |= 8;
        }
        if ((i2 & 8) != 0) {
            tL_forumTopic.hidden = tL_updateEditForumTopic.hidden;
            i |= 32;
        }
        if (i == 0) {
            return;
        }
        D(j, tL_forumTopic, i);
        getMessagesStorage().c2(j, tL_forumTopic, i);
    }

    public final void s(long j, long j2) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(zc7.a(-j, j2));
        gl.c3(new a5b(this, arrayList, (byte) 16));
    }

    public final void t(long j, int i, boolean z, d dVar) {
        TL_forum.TL_messages_updatePinnedForumTopic tL_messages_updatePinnedForumTopic = new TL_forum.TL_messages_updatePinnedForumTopic();
        tL_messages_updatePinnedForumTopic.peer = getMessagesController().h1(-j);
        tL_messages_updatePinnedForumTopic.topic_id = i;
        tL_messages_updatePinnedForumTopic.pinned = z;
        ArrayList g = g(j);
        ArrayList arrayList = new ArrayList(g);
        arrayList.remove(Integer.valueOf(i));
        if (z) {
            arrayList.add(0, Integer.valueOf(i));
        }
        a(j, arrayList, true);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_updatePinnedForumTopic, new ws0(this, dVar, j, g, (byte) 7));
    }

    public final void u(long r24, java.util.ArrayList r26, defpackage.vf6 r27, boolean r28, int r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pub.u(long, java.util.ArrayList, vf6, boolean, int, int):void");
    }

    public final void v(long j, ArrayList arrayList, n30 n30Var) {
        TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID;
        long j2 = -j;
        boolean x2 = getMessagesController().x2(j2);
        HashSet hashSet = new HashSet();
        int i = 0;
        if (x2) {
            TLRPC.TL_messages_getSavedDialogsByID tL_messages_getSavedDialogsByID = new TLRPC.TL_messages_getSavedDialogsByID();
            while (i < arrayList.size()) {
                long n = cf3.n(((TLRPC.TL_forumTopic) arrayList.get(i)).from_id);
                hashSet.add(Long.valueOf(n));
                tL_messages_getSavedDialogsByID.ids.add(getMessagesController().h1(n));
                i++;
            }
            tL_messages_getSavedDialogsByID.parent_peer = getMessagesController().h1(j2);
            tL_messages_getForumTopicsByID = tL_messages_getSavedDialogsByID;
        } else {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID2 = new TL_forum.TL_messages_getForumTopicsByID();
            while (i < arrayList.size()) {
                i = tb4.g(((TLRPC.TL_forumTopic) arrayList.get(i)).id, i, 1, tL_messages_getForumTopicsByID2.topics);
            }
            tL_messages_getForumTopicsByID2.peer = getMessagesController().h1(j2);
            tL_messages_getForumTopicsByID = tL_messages_getForumTopicsByID2;
        }
        getConnectionsManager().sendRequest(tL_messages_getForumTopicsByID, new js0(this, x2, j, hashSet, n30Var, (byte) 5));
    }

    public final void w(ArrayList arrayList, long j) {
        TL_forum.TL_messages_reorderPinnedForumTopics tL_messages_reorderPinnedForumTopics = new TL_forum.TL_messages_reorderPinnedForumTopics();
        tL_messages_reorderPinnedForumTopics.peer = getMessagesController().h1(-j);
        tL_messages_reorderPinnedForumTopics.order.addAll(arrayList);
        tL_messages_reorderPinnedForumTopics.force = true;
        a(j, arrayList, false);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderPinnedForumTopics, null);
    }

    public final void x(int i, int i2, long j, long j2) {
        ?? obj = new Object();
        obj.a = i;
        obj.b = i2;
        obj.c = j2;
        this.s.k(obj, j);
    }

    public final void y(long j, boolean z) {
        ArrayList arrayList = (ArrayList) this.a.f(j);
        if (arrayList != null) {
            if (this.r.get(j, 0) > 0) {
                Collections.sort(arrayList, new pva((byte) 8));
            }
            if (z) {
                getNotificationCenter().k(kk7.s5, Long.valueOf(j), Boolean.TRUE);
            }
        }
    }

    public final void z(int i, long j, boolean z) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
        long j2 = -j;
        tL_messages_editForumTopic.peer = getMessagesController().h1(j2);
        tL_messages_editForumTopic.topic_id = i;
        tL_messages_editForumTopic.flags |= 4;
        tL_messages_editForumTopic.closed = z;
        vf6 vf6Var = (vf6) this.b.f(j);
        if (vf6Var != null && (tL_forumTopic = (TLRPC.TL_forumTopic) vf6Var.f(i)) != null) {
            tL_forumTopic.closed = z;
            getMessagesStorage().c2(j2, tL_forumTopic, 8);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_editForumTopic, new Object());
    }
}
