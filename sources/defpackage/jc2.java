package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jc2 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final int d;
    public final Object e;
    public final Object f;

    public jc2(int i, long j, long j2, b8 b8Var, b8 b8Var2) {
        this.a = (byte) 0;
        this.d = i;
        this.b = j;
        this.c = j2;
        this.e = b8Var;
        this.f = b8Var2;
    }

    @Override
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                int i2 = this.d;
                long j = this.b;
                long j2 = this.c;
                b8 b8Var = (b8) this.e;
                b8 b8Var2 = (b8) this.f;
                if (uc7.s1(i2).p2(j, j2, null)) {
                    b8Var.j(ob6.M0(2131743503, null), 2131232417, null);
                    i = aob.x6;
                    b8Var2.setVisibility(8);
                } else {
                    b8Var.j(ob6.M0(2131748060, null), 2131232261, null);
                    int i3 = aob.q7;
                    b8Var2.setVisibility(0);
                    if (uc7.s1(i2).q2(j, j2)) {
                        b8Var2.j(ob6.M0(2131745005, null), 2131232407, null);
                    } else {
                        b8Var2.j(ob6.M0(2131745003, null), 2131232408, null);
                    }
                    i = i3;
                }
                oc2.c(b8Var, i);
                return;
            case 1:
                ls6 ls6Var = (ls6) this.e;
                long j3 = this.b;
                long j4 = this.c;
                c97 c97Var = (c97) this.f;
                int i4 = this.d;
                try {
                    TL_bots.BotInfo J0 = ls6Var.J0(j3, j4);
                    if (J0 != null) {
                        hl.c3(new ic2(ls6Var, j3, j4, J0, c97Var, i4));
                    } else if (c97Var != null) {
                        hl.c3(new z96(c97Var, (byte) 18));
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 2:
                uc7 uc7Var = (uc7) this.e;
                long j5 = this.b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f;
                int i5 = this.d;
                long j6 = this.c;
                LongSparseIntArray longSparseIntArray = uc7Var.x0;
                zh6 zh6Var = uc7Var.c1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) zh6Var.f(j5);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                zh6Var.k(j5, tL_messages_chatFull.full_chat);
                long j7 = -j5;
                uc7Var.i4.M(j7);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                wp7 wp7Var = uc7Var.getNotificationsController().h0;
                wp7Var.getClass();
                if (peerNotifySettings != null) {
                    to3 to3Var = Utilities.e;
                    o30 o30Var = new o30(wp7Var, j7, 0L, peerNotifySettings, (byte) 12);
                    j7 = j7;
                    to3Var.c(o30Var);
                }
                for (int i6 = 0; i6 < tL_messages_chatFull.full_chat.bot_info.size(); i6++) {
                    uc7Var.getMediaDataController().G1(j7, tL_messages_chatFull.full_chat.bot_info.get(i6));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j7);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j7, 1);
                        uc7Var.getNotificationCenter().k(44, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    uc7Var.getNotificationCenter().k(44, new Object[0]);
                }
                uc7Var.r.k(j5, tL_messages_chatFull.full_chat.exported_invite);
                uc7Var.l1.remove(Long.valueOf(j5));
                uc7Var.p1.put(j5, System.currentTimeMillis());
                uc7Var.j4(tL_messages_chatFull.users, false);
                uc7Var.c4(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    uc7Var.getMediaDataController().a0(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    uc7Var.getMediaDataController().a0(tL_messages_chatFull.full_chat.emojiset);
                }
                uc7Var.getNotificationCenter().k(31, tL_messages_chatFull.full_chat, Integer.valueOf(i5), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) uc7Var.R.f(j7);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i7 = dialog.folder_id;
                        int i8 = chatFull2.folder_id;
                        if (i7 != i8) {
                            dialog.folder_id = i8;
                            uc7Var.h5(null);
                            uc7Var.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i9 = dialog.ttl_period;
                    int i10 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i9 != i10) {
                        dialog.ttl_period = i10;
                        uc7Var.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z = dialog.view_forum_as_messages;
                    boolean z2 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z != z2) {
                        dialog.view_forum_as_messages = z2;
                        jf7 messagesStorage = uc7Var.getMessagesStorage();
                        messagesStorage.a.c(new ge7(messagesStorage, j6, tL_messages_chatFull.full_chat.view_forum_as_messages, (byte) 1));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((jf7) this.e).getMessagesController().Y(null, null, null, this.b, true, 0, false, this.c, (TLMethod) this.f, this.d);
                return;
        }
    }

    public jc2(rf0 rf0Var, long j, long j2, Object obj, int i, byte b) {
        this.a = b;
        this.e = rf0Var;
        this.b = j;
        this.c = j2;
        this.f = obj;
        this.d = i;
    }

    public jc2(uc7 uc7Var, long j, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i, long j2) {
        this.a = (byte) 2;
        this.e = uc7Var;
        this.b = j;
        this.f = tL_messages_chatFull;
        this.d = i;
        this.c = j2;
    }
}
