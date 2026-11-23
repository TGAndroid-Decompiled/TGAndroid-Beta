package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class uh implements Runnable {
    public final int f27280a;
    public final long f27281b;
    public final int f27282c;
    public final long d;
    public final c1 f27283e;
    public final Object f27284f;

    public uh(c1 c1Var, long j3, long j10, Object obj, int i7, int i10) {
        this.f27280a = i10;
        this.f27283e = c1Var;
        this.f27281b = j3;
        this.d = j10;
        this.f27284f = obj;
        this.f27282c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27280a) {
            case 0:
                ri riVar = (ri) this.f27283e;
                long j3 = this.f27281b;
                long j10 = this.d;
                w10 w10Var = (w10) this.f27284f;
                int i7 = this.f27282c;
                try {
                    TL_bots.BotInfo K0 = riVar.K0(j3, j10);
                    if (K0 != null) {
                        g0.g3(new di.j9(riVar, j3, j10, K0, w10Var, i7));
                    } else if (w10Var != null) {
                        g0.g3(new fg(w10Var, 5));
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                mp mpVar = (mp) this.f27283e;
                long j11 = this.f27281b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f27284f;
                int i10 = this.f27282c;
                long j12 = this.d;
                LongSparseIntArray longSparseIntArray = mpVar.H0;
                a0.h hVar = mpVar.f25796m1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f(j11);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                hVar.k(tL_messages_chatFull.full_chat, j11);
                long j13 = -j11;
                mpVar.f25882v7.M(j13);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                ys ysVar = mpVar.getNotificationsController().f28092h0;
                ysVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.f22877e.c(new s8(ysVar, j13, 0L, peerNotifySettings, 6));
                }
                for (int i11 = 0; i11 < tL_messages_chatFull.full_chat.bot_info.size(); i11++) {
                    mpVar.getMediaDataController().I1(j13, tL_messages_chatFull.full_chat.bot_info.get(i11));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j13);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j13, 1);
                        mpVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    mpVar.getNotificationCenter().k(43, new Object[0]);
                }
                mpVar.f25839r.k(tL_messages_chatFull.full_chat.exported_invite, j11);
                mpVar.f25876v1.remove(Long.valueOf(j11));
                mpVar.f25915z1.put(j11, System.currentTimeMillis());
                mpVar.f4(tL_messages_chatFull.users, false);
                mpVar.Z3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    mpVar.getMediaDataController().a0(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    mpVar.getMediaDataController().a0(tL_messages_chatFull.full_chat.emojiset);
                }
                mpVar.getNotificationCenter().k(30, tL_messages_chatFull.full_chat, Integer.valueOf(i10), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) mpVar.R.f(j13);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i12 = dialog.folder_id;
                        int i13 = chatFull2.folder_id;
                        if (i12 != i13) {
                            dialog.folder_id = i13;
                            mpVar.f5(null);
                            mpVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i14 = dialog.ttl_period;
                    int i15 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i14 != i15) {
                        dialog.ttl_period = i15;
                        mpVar.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z10 = dialog.view_forum_as_messages;
                    boolean z11 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z10 != z11) {
                        dialog.view_forum_as_messages = z11;
                        tr messagesStorage = mpVar.getMessagesStorage();
                        messagesStorage.f27149a.c(new up(1, j12, messagesStorage, tL_messages_chatFull.full_chat.view_forum_as_messages));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((tr) this.f27283e).getMessagesController().a0(null, null, null, this.f27281b, true, 0, false, this.d, (TLMethod) this.f27284f, this.f27282c);
                return;
        }
    }

    public uh(mp mpVar, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i7, long j10) {
        this.f27280a = 1;
        this.f27283e = mpVar;
        this.f27281b = j3;
        this.f27284f = tL_messages_chatFull;
        this.f27282c = i7;
        this.d = j10;
    }
}
