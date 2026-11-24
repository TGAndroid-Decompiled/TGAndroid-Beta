package defpackage;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class ed2 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final int d;
    public final Object e;
    public final Object f;

    public ed2(int i, long j, long j2, a8 a8Var, a8 a8Var2) {
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
                if (oc7.r1(i2).o2(j, j2, null)) {
                    a8Var.j(jb6.M0(2131743535, null), 2131232418, null);
                    i = cmb.w6;
                    a8Var2.setVisibility(8);
                } else {
                    a8Var.j(jb6.M0(2131748063, null), 2131232262, null);
                    int i3 = cmb.p7;
                    a8Var2.setVisibility(0);
                    if (oc7.r1(i2).p2(j, j2)) {
                        a8Var2.j(jb6.M0(2131745011, null), 2131232408, null);
                    } else {
                        a8Var2.j(jb6.M0(2131745009, null), 2131232409, null);
                    }
                    i = i3;
                }
                jd2.c(a8Var, i);
                return;
            case 1:
                hs6 hs6Var = (hs6) this.e;
                long j3 = this.b;
                long j4 = this.c;
                h97 h97Var = (h97) this.f;
                int i4 = this.d;
                try {
                    TL_bots.BotInfo J0 = hs6Var.J0(j3, j4);
                    if (J0 != null) {
                        gm.c3(new dd2(hs6Var, j3, j4, J0, h97Var, i4));
                    } else if (h97Var != null) {
                        gm.c3(new pg6(h97Var, (byte) 13));
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 2:
                oc7 oc7Var = (oc7) this.e;
                long j5 = this.b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f;
                int i5 = this.d;
                long j6 = this.c;
                LongSparseIntArray longSparseIntArray = oc7Var.x0;
                vh6 vh6Var = oc7Var.c1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) vh6Var.f(j5);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                vh6Var.k(tL_messages_chatFull.full_chat, j5);
                long j7 = -j5;
                oc7Var.i4.M(j7);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                ap7 ap7Var = oc7Var.getNotificationsController().h0;
                ap7Var.getClass();
                if (peerNotifySettings != null) {
                    mp3 mp3Var = Utilities.e;
                    n40 n40Var = new n40(ap7Var, j7, 0L, peerNotifySettings, (byte) 12);
                    j7 = j7;
                    mp3Var.c(n40Var);
                }
                for (int i6 = 0; i6 < tL_messages_chatFull.full_chat.bot_info.size(); i6++) {
                    oc7Var.getMediaDataController().G1(j7, tL_messages_chatFull.full_chat.bot_info.get(i6));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j7);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j7, 1);
                        oc7Var.getNotificationCenter().k(44, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    oc7Var.getNotificationCenter().k(44, new Object[0]);
                }
                oc7Var.r.k(tL_messages_chatFull.full_chat.exported_invite, j5);
                oc7Var.l1.remove(Long.valueOf(j5));
                oc7Var.p1.put(j5, System.currentTimeMillis());
                oc7Var.d4(tL_messages_chatFull.users, false);
                oc7Var.X3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    oc7Var.getMediaDataController().a0(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    oc7Var.getMediaDataController().a0(tL_messages_chatFull.full_chat.emojiset);
                }
                oc7Var.getNotificationCenter().k(31, tL_messages_chatFull.full_chat, Integer.valueOf(i5), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) oc7Var.R.f(j7);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i7 = dialog.folder_id;
                        int i8 = chatFull2.folder_id;
                        if (i7 != i8) {
                            dialog.folder_id = i8;
                            oc7Var.b5(null);
                            oc7Var.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i9 = dialog.ttl_period;
                    int i10 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i9 != i10) {
                        dialog.ttl_period = i10;
                        oc7Var.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z = dialog.view_forum_as_messages;
                    boolean z2 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z != z2) {
                        dialog.view_forum_as_messages = z2;
                        cf7 messagesStorage = oc7Var.getMessagesStorage();
                        messagesStorage.a.c(new bd7(messagesStorage, j6, tL_messages_chatFull.full_chat.view_forum_as_messages, (byte) 1));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((cf7) this.e).getMessagesController().W(null, null, null, this.b, true, 0, false, this.c, (TLMethod) this.f, this.d);
                return;
        }
    }

    public ed2(pg0 pg0Var, long j, long j2, Object obj, int i, byte b) {
        this.a = b;
        this.e = pg0Var;
        this.b = j;
        this.c = j2;
        this.f = obj;
        this.d = i;
    }

    public ed2(oc7 oc7Var, long j, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i, long j2) {
        this.a = (byte) 2;
        this.e = oc7Var;
        this.b = j;
        this.f = tL_messages_chatFull;
        this.d = i;
        this.c = j2;
    }
}
