package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class tb2 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final int d;
    public final Object e;
    public final Object f;

    public tb2(int i, long j, long j2, a8 a8Var, a8 a8Var2) {
        this.a = (byte) 0;
        this.d = i;
        this.b = j;
        this.c = j2;
        this.e = a8Var;
        this.f = a8Var2;
    }

    @Override
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                int i2 = this.d;
                long j = this.b;
                long j2 = this.c;
                a8 a8Var = (a8) this.e;
                a8 a8Var2 = (a8) this.f;
                if (na7.q1(i2).n2(j, j2, null)) {
                    a8Var.j(k96.M0(2131743609, null), 2131232417, null);
                    i = bkb.w6;
                    a8Var2.setVisibility(8);
                } else {
                    a8Var.j(k96.M0(2131748114, null), 2131232261, null);
                    int i3 = bkb.p7;
                    a8Var2.setVisibility(0);
                    if (na7.q1(i2).o2(j, j2)) {
                        a8Var2.j(k96.M0(2131745085, null), 2131232407, null);
                    } else {
                        a8Var2.j(k96.M0(2131745083, null), 2131232408, null);
                    }
                    i = i3;
                }
                yb2.c(a8Var, i);
                return;
            case 1:
                hq6 hq6Var = (hq6) this.e;
                long j3 = this.b;
                long j4 = this.c;
                e77 e77Var = (e77) this.f;
                int i4 = this.d;
                try {
                    TL_bots.BotInfo J0 = hq6Var.J0(j3, j4);
                    if (J0 != null) {
                        gl.c3(new sb2(hq6Var, j3, j4, J0, e77Var, i4));
                    } else if (e77Var != null) {
                        gl.c3(new vl6(e77Var, (byte) 6));
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 2:
                na7 na7Var = (na7) this.e;
                long j5 = this.b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f;
                int i5 = this.d;
                long j6 = this.c;
                LongSparseIntArray longSparseIntArray = na7Var.x0;
                vf6 vf6Var = na7Var.c1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) vf6Var.f(j5);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                vf6Var.k(tL_messages_chatFull.full_chat, j5);
                long j7 = -j5;
                na7Var.i4.M(j7);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                wm7 wm7Var = na7Var.getNotificationsController().h0;
                wm7Var.getClass();
                if (peerNotifySettings != null) {
                    co3 co3Var = Utilities.e;
                    n30 n30Var = new n30(wm7Var, j7, 0L, peerNotifySettings, (byte) 12);
                    j7 = j7;
                    co3Var.c(n30Var);
                }
                for (int i6 = 0; i6 < tL_messages_chatFull.full_chat.bot_info.size(); i6++) {
                    na7Var.getMediaDataController().G1(j7, tL_messages_chatFull.full_chat.bot_info.get(i6));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j7);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j7, 1);
                        na7Var.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    na7Var.getNotificationCenter().k(43, new Object[0]);
                }
                na7Var.r.k(tL_messages_chatFull.full_chat.exported_invite, j5);
                na7Var.l1.remove(Long.valueOf(j5));
                na7Var.p1.put(j5, System.currentTimeMillis());
                na7Var.b4(tL_messages_chatFull.users, false);
                na7Var.V3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    na7Var.getMediaDataController().a0(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    na7Var.getMediaDataController().a0(tL_messages_chatFull.full_chat.emojiset);
                }
                na7Var.getNotificationCenter().k(30, tL_messages_chatFull.full_chat, Integer.valueOf(i5), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) na7Var.R.f(j7);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i7 = dialog.folder_id;
                        int i8 = chatFull2.folder_id;
                        if (i7 != i8) {
                            dialog.folder_id = i8;
                            na7Var.Z4(null);
                            na7Var.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i9 = dialog.ttl_period;
                    int i10 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i9 != i10) {
                        dialog.ttl_period = i10;
                        na7Var.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z = dialog.view_forum_as_messages;
                    boolean z2 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z != z2) {
                        dialog.view_forum_as_messages = z2;
                        ad7 messagesStorage = na7Var.getMessagesStorage();
                        messagesStorage.a.c(new ab7(messagesStorage, j6, tL_messages_chatFull.full_chat.view_forum_as_messages, (byte) 1));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ad7) this.e).getMessagesController().W(null, null, null, this.b, true, 0, false, this.c, (TLMethod) this.f, this.d);
                return;
        }
    }

    public tb2(pf0 pf0Var, long j, long j2, Object obj, int i, byte b) {
        this.a = b;
        this.e = pf0Var;
        this.b = j;
        this.c = j2;
        this.f = obj;
        this.d = i;
    }

    public tb2(na7 na7Var, long j, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i, long j2) {
        this.a = (byte) 2;
        this.e = na7Var;
        this.b = j;
        this.f = tL_messages_chatFull;
        this.d = i;
        this.c = j2;
    }
}
