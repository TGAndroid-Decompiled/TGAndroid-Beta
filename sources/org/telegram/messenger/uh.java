package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class uh implements Runnable {
    public final int f26819a;
    public final long f26820b;
    public final int f26821c;
    public final long d;
    public final c1 f26822e;
    public final Object f26823f;

    public uh(c1 c1Var, long j3, long j10, Object obj, int i7, int i10) {
        this.f26819a = i10;
        this.f26822e = c1Var;
        this.f26820b = j3;
        this.d = j10;
        this.f26823f = obj;
        this.f26821c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26819a) {
            case 0:
                si siVar = (si) this.f26822e;
                long j3 = this.f26820b;
                long j10 = this.d;
                z10 z10Var = (z10) this.f26823f;
                int i7 = this.f26821c;
                try {
                    TL_bots.BotInfo H0 = siVar.H0(j3, j10);
                    if (H0 != null) {
                        g0.h3(new cg(siVar, z10Var, H0, i7, 7));
                    } else if (z10Var != null) {
                        g0.h3(new qf(z10Var, 0));
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                np npVar = (np) this.f26822e;
                long j11 = this.f26820b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f26823f;
                int i10 = this.f26821c;
                long j12 = this.d;
                LongSparseIntArray longSparseIntArray = npVar.H0;
                a0.h hVar = npVar.f25332m1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f(j11);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                hVar.k(tL_messages_chatFull.full_chat, j11);
                long j13 = -j11;
                npVar.f25400t7.M(j13);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                bt btVar = npVar.getNotificationsController().f22577h0;
                btVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.f22416e.c(new t8(btVar, j13, 0L, peerNotifySettings, 6));
                }
                for (int i11 = 0; i11 < tL_messages_chatFull.full_chat.bot_info.size(); i11++) {
                    npVar.getMediaDataController().D1(j13, tL_messages_chatFull.full_chat.bot_info.get(i11));
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
                npVar.f25375r.k(tL_messages_chatFull.full_chat.exported_invite, j11);
                npVar.f25395t1.remove(Long.valueOf(j11));
                npVar.f25432x1.put(j11, System.currentTimeMillis());
                npVar.Y3(tL_messages_chatFull.users, false);
                npVar.S3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    npVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    npVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.emojiset);
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
                            npVar.U4(null);
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
                        vr messagesStorage = npVar.getMessagesStorage();
                        messagesStorage.f27220a.c(new wp(1, j12, messagesStorage, tL_messages_chatFull.full_chat.view_forum_as_messages));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((vr) this.f26822e).getMessagesController().a0(null, null, null, this.f26820b, true, 0, false, this.d, (TLMethod) this.f26823f, this.f26821c);
                return;
        }
    }

    public uh(np npVar, long j3, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i7, long j10) {
        this.f26819a = 1;
        this.f26822e = npVar;
        this.f26820b = j3;
        this.f26823f = tL_messages_chatFull;
        this.f26821c = i7;
        this.d = j10;
    }
}
