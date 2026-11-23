package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class vh implements Runnable {
    public final int f27339a;
    public final long f27340b;
    public final int f27341c;
    public final long d;
    public final c1 f27342e;
    public final Object f27343f;

    public vh(c1 c1Var, long j3, long j10, Object obj, int i7, int i10) {
        this.f27339a = i10;
        this.f27342e = c1Var;
        this.f27340b = j3;
        this.d = j10;
        this.f27343f = obj;
        this.f27341c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27339a) {
            case 0:
                si siVar = (si) this.f27342e;
                long j3 = this.f27340b;
                long j10 = this.d;
                y10 y10Var = (y10) this.f27343f;
                int i7 = this.f27341c;
                try {
                    TL_bots.BotInfo K0 = siVar.K0(j3, j10);
                    if (K0 != null) {
                        g0.g3(new di.j9(siVar, j3, j10, K0, y10Var, i7));
                    } else if (y10Var != null) {
                        g0.g3(new gg(y10Var, 5));
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                np npVar = (np) this.f27342e;
                long j11 = this.f27340b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f27343f;
                int i10 = this.f27341c;
                long j12 = this.d;
                LongSparseIntArray longSparseIntArray = npVar.H0;
                a0.h hVar = npVar.f25864m1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f(j11);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                hVar.k(tL_messages_chatFull.full_chat, j11);
                long j13 = -j11;
                npVar.f25950v7.M(j13);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                zs zsVar = npVar.getNotificationsController().f28152h0;
                zsVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.f22774e.c(new t8(zsVar, j13, 0L, peerNotifySettings, 6));
                }
                for (int i11 = 0; i11 < tL_messages_chatFull.full_chat.bot_info.size(); i11++) {
                    npVar.getMediaDataController().I1(j13, tL_messages_chatFull.full_chat.bot_info.get(i11));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j13);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j13, 1);
                        npVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    npVar.getNotificationCenter().k(43, new Object[0]);
                }
                npVar.f25907r.k(tL_messages_chatFull.full_chat.exported_invite, j11);
                npVar.f25944v1.remove(Long.valueOf(j11));
                npVar.f25983z1.put(j11, System.currentTimeMillis());
                npVar.f4(tL_messages_chatFull.users, false);
                npVar.Z3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    npVar.getMediaDataController().a0(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    npVar.getMediaDataController().a0(tL_messages_chatFull.full_chat.emojiset);
                }
                npVar.getNotificationCenter().k(30, tL_messages_chatFull.full_chat, Integer.valueOf(i10), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) npVar.R.f(j13);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i12 = dialog.folder_id;
                        int i13 = chatFull2.folder_id;
                        if (i12 != i13) {
                            dialog.folder_id = i13;
                            npVar.f5(null);
                            npVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i14 = dialog.ttl_period;
                    int i15 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i14 != i15) {
                        dialog.ttl_period = i15;
                        npVar.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z10 = dialog.view_forum_as_messages;
                    boolean z11 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z10 != z11) {
                        dialog.view_forum_as_messages = z11;
                        ur messagesStorage = npVar.getMessagesStorage();
                        messagesStorage.f27214a.c(new vp(1, j12, messagesStorage, tL_messages_chatFull.full_chat.view_forum_as_messages));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ur) this.f27342e).getMessagesController().a0(null, null, null, this.f27340b, true, 0, false, this.d, (TLMethod) this.f27343f, this.f27341c);
                return;
        }
    }

    public vh(np npVar, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i7, long j10) {
        this.f27339a = 1;
        this.f27342e = npVar;
        this.f27340b = j3;
        this.f27343f = tL_messages_chatFull;
        this.f27341c = i7;
        this.d = j10;
    }
}
