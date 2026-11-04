package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class nh implements Runnable {
    public final int f24379a;
    public final long f24380b;
    public final int f24381c;
    public final long d;
    public final c1 f24382e;
    public final Object f24383f;

    public nh(c1 c1Var, long j10, long j11, Object obj, int i3, int i10) {
        this.f24379a = i10;
        this.f24382e = c1Var;
        this.f24380b = j10;
        this.d = j11;
        this.f24383f = obj;
        this.f24381c = i3;
    }

    @Override
    public final void run() {
        switch (this.f24379a) {
            case 0:
                li liVar = (li) this.f24382e;
                long j10 = this.f24380b;
                long j11 = this.d;
                u10 u10Var = (u10) this.f24383f;
                int i3 = this.f24381c;
                try {
                    TL_bots.BotInfo H0 = liVar.H0(j10, j11);
                    if (H0 != null) {
                        g0.h3(new vf(liVar, u10Var, H0, i3, 7));
                    } else if (u10Var != null) {
                        g0.h3(new jf(u10Var, 0));
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                hp hpVar = (hp) this.f24382e;
                long j12 = this.f24380b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f24383f;
                int i10 = this.f24381c;
                long j13 = this.d;
                LongSparseIntArray longSparseIntArray = hpVar.H0;
                a0.h hVar = hpVar.m1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f(j12);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                hVar.k(tL_messages_chatFull.full_chat, j12);
                long j14 = -j12;
                hpVar.f23120s7.M(j14);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                ws wsVar = hpVar.getNotificationsController().f25767h0;
                wsVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.f21387e.c(new t8(wsVar, j14, 0L, peerNotifySettings, 6));
                }
                for (int i11 = 0; i11 < tL_messages_chatFull.full_chat.bot_info.size(); i11++) {
                    hpVar.getMediaDataController().D1(j14, tL_messages_chatFull.full_chat.bot_info.get(i11));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j14);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j14, 1);
                        hpVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    hpVar.getNotificationCenter().k(43, new Object[0]);
                }
                hpVar.f23104r.k(tL_messages_chatFull.full_chat.exported_invite, j12);
                hpVar.f23123t1.remove(Long.valueOf(j12));
                hpVar.f23161x1.put(j12, System.currentTimeMillis());
                hpVar.Y3(tL_messages_chatFull.users, false);
                hpVar.S3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    hpVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    hpVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.emojiset);
                }
                hpVar.getNotificationCenter().k(30, tL_messages_chatFull.full_chat, Integer.valueOf(i10), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) hpVar.R.f(j14);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i12 = dialog.folder_id;
                        int i13 = chatFull2.folder_id;
                        if (i12 != i13) {
                            dialog.folder_id = i13;
                            hpVar.T4(null);
                            hpVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i14 = dialog.ttl_period;
                    int i15 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i14 != i15) {
                        dialog.ttl_period = i15;
                        hpVar.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z10 = dialog.view_forum_as_messages;
                    boolean z11 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z10 != z11) {
                        dialog.view_forum_as_messages = z11;
                        qr messagesStorage = hpVar.getMessagesStorage();
                        messagesStorage.f24934a.c(new qp(1, j13, messagesStorage, tL_messages_chatFull.full_chat.view_forum_as_messages));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((qr) this.f24382e).getMessagesController().a0(null, null, null, this.f24380b, true, 0, false, this.d, (TLMethod) this.f24383f, this.f24381c);
                return;
        }
    }

    public nh(hp hpVar, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i3, long j11) {
        this.f24379a = 1;
        this.f24382e = hpVar;
        this.f24380b = j10;
        this.f24383f = tL_messages_chatFull;
        this.f24381c = i3;
        this.d = j11;
    }
}
