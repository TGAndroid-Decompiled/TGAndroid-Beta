package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class wh implements Runnable {
    public final int f19054a;
    public final long f19055b;
    public final int f19056c;
    public final long d;
    public final f1 e;
    public final Object f19057f;

    public wh(f1 f1Var, long j10, long j11, Object obj, int i10, int i11) {
        this.f19054a = i11;
        this.e = f1Var;
        this.f19055b = j10;
        this.d = j11;
        this.f19057f = obj;
        this.f19056c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19054a) {
            case 0:
                vi viVar = (vi) this.e;
                long j10 = this.f19055b;
                long j11 = this.d;
                r20 r20Var = (r20) this.f19057f;
                int i10 = this.f19056c;
                try {
                    TL_bots.BotInfo H0 = viVar.H0(j10, j11);
                    if (H0 != null) {
                        i0.g3(new dg(viVar, r20Var, H0, i10, 7));
                    } else if (r20Var != null) {
                        i0.g3(new qf(r20Var, 0));
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                wp wpVar = (wp) this.e;
                long j12 = this.f19055b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f19057f;
                int i11 = this.f19056c;
                long j13 = this.d;
                LongSparseIntArray longSparseIntArray = wpVar.G0;
                a0.h hVar = wpVar.l1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f(j12);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                hVar.k(tL_messages_chatFull.full_chat, j12);
                long j14 = -j12;
                wpVar.f19253t7.M(j14);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                qt qtVar = wpVar.getNotificationsController().f17654g0;
                qtVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new y8(qtVar, j14, 0L, peerNotifySettings, 6));
                }
                for (int i12 = 0; i12 < tL_messages_chatFull.full_chat.bot_info.size(); i12++) {
                    wpVar.getMediaDataController().D1(j14, tL_messages_chatFull.full_chat.bot_info.get(i12));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j14);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j14, 1);
                        wpVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    wpVar.getNotificationCenter().k(43, new Object[0]);
                }
                wpVar.f19226r.k(tL_messages_chatFull.full_chat.exported_invite, j12);
                wpVar.f19238s1.remove(Long.valueOf(j12));
                wpVar.f19275w1.put(j12, System.currentTimeMillis());
                wpVar.V3(tL_messages_chatFull.users, false);
                wpVar.P3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    wpVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    wpVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.emojiset);
                }
                wpVar.getNotificationCenter().k(30, tL_messages_chatFull.full_chat, Integer.valueOf(i11), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) wpVar.Q.f(j14);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i13 = dialog.folder_id;
                        int i14 = chatFull2.folder_id;
                        if (i13 != i14) {
                            dialog.folder_id = i14;
                            wpVar.Q4(null);
                            wpVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i15 = dialog.ttl_period;
                    int i16 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i15 != i16) {
                        dialog.ttl_period = i16;
                        wpVar.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z10 = dialog.view_forum_as_messages;
                    boolean z11 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z10 != z11) {
                        dialog.view_forum_as_messages = z11;
                        is messagesStorage = wpVar.getMessagesStorage();
                        messagesStorage.f16331a.c(new gq(1, j13, messagesStorage, tL_messages_chatFull.full_chat.view_forum_as_messages));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((is) this.e).getMessagesController().a0(null, null, null, this.f19055b, true, 0, false, this.d, (TLMethod) this.f19057f, this.f19056c);
                return;
        }
    }

    public wh(wp wpVar, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f19054a = 1;
        this.e = wpVar;
        this.f19055b = j10;
        this.f19057f = tL_messages_chatFull;
        this.f19056c = i10;
        this.d = j11;
    }
}
