package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class wh implements Runnable {
    public final int f26317a;
    public final long f26318b;
    public final int f26319c;
    public final long d;
    public final c1 f26320e;
    public final Object f26321f;

    public wh(c1 c1Var, long j3, long j10, Object obj, int i7, int i10) {
        this.f26317a = i10;
        this.f26320e = c1Var;
        this.f26318b = j3;
        this.d = j10;
        this.f26321f = obj;
        this.f26319c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26317a) {
            case 0:
                ui uiVar = (ui) this.f26320e;
                long j3 = this.f26318b;
                long j10 = this.d;
                c20 c20Var = (c20) this.f26321f;
                int i7 = this.f26319c;
                try {
                    TL_bots.BotInfo H0 = uiVar.H0(j3, j10);
                    if (H0 != null) {
                        g0.h3(new dg(uiVar, c20Var, H0, i7, 7));
                    } else if (c20Var != null) {
                        g0.h3(new rf(c20Var, 0));
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                qp qpVar = (qp) this.f26320e;
                long j11 = this.f26318b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f26321f;
                int i10 = this.f26319c;
                long j12 = this.d;
                LongSparseIntArray longSparseIntArray = qpVar.G0;
                a0.h hVar = qpVar.l1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f(j11);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                hVar.k(tL_messages_chatFull.full_chat, j11);
                long j13 = -j11;
                qpVar.f24896s7.M(j13);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                et etVar = qpVar.getNotificationsController().f22094g0;
                etVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.f21336e.c(new t8(etVar, j13, 0L, peerNotifySettings, 6));
                }
                for (int i11 = 0; i11 < tL_messages_chatFull.full_chat.bot_info.size(); i11++) {
                    qpVar.getMediaDataController().D1(j13, tL_messages_chatFull.full_chat.bot_info.get(i11));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j13);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j13, 1);
                        qpVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    qpVar.getNotificationCenter().k(43, new Object[0]);
                }
                qpVar.f24879r.k(tL_messages_chatFull.full_chat.exported_invite, j11);
                qpVar.f24891s1.remove(Long.valueOf(j11));
                qpVar.f24926w1.put(j11, System.currentTimeMillis());
                qpVar.Y3(tL_messages_chatFull.users, false);
                qpVar.S3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    qpVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    qpVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.emojiset);
                }
                qpVar.getNotificationCenter().k(30, tL_messages_chatFull.full_chat, Integer.valueOf(i10), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) qpVar.Q.f(j13);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i12 = dialog.folder_id;
                        int i13 = chatFull2.folder_id;
                        if (i12 != i13) {
                            dialog.folder_id = i13;
                            qpVar.T4(null);
                            qpVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i14 = dialog.ttl_period;
                    int i15 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i14 != i15) {
                        dialog.ttl_period = i15;
                        qpVar.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z9 = dialog.view_forum_as_messages;
                    boolean z10 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z9 != z10) {
                        dialog.view_forum_as_messages = z10;
                        yr messagesStorage = qpVar.getMessagesStorage();
                        messagesStorage.f26719a.c(new zp(1, j12, messagesStorage, tL_messages_chatFull.full_chat.view_forum_as_messages));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((yr) this.f26320e).getMessagesController().a0(null, null, null, this.f26318b, true, 0, false, this.d, (TLMethod) this.f26321f, this.f26319c);
                return;
        }
    }

    public wh(qp qpVar, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i7, long j10) {
        this.f26317a = 1;
        this.f26320e = qpVar;
        this.f26318b = j3;
        this.f26321f = tL_messages_chatFull;
        this.f26319c = i7;
        this.d = j10;
    }
}
