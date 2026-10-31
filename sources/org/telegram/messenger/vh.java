package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class vh implements Runnable {
    public final int f18532a;
    public final long f18533b;
    public final int f18534c;
    public final long d;
    public final f1 e;
    public final Object f18535f;

    public vh(f1 f1Var, long j10, long j11, Object obj, int i10, int i11) {
        this.f18532a = i11;
        this.e = f1Var;
        this.f18533b = j10;
        this.d = j11;
        this.f18535f = obj;
        this.f18534c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18532a) {
            case 0:
                ui uiVar = (ui) this.e;
                long j10 = this.f18533b;
                long j11 = this.d;
                q20 q20Var = (q20) this.f18535f;
                int i10 = this.f18534c;
                try {
                    TL_bots.BotInfo H0 = uiVar.H0(j10, j11);
                    if (H0 != null) {
                        i0.g3(new cg(uiVar, q20Var, H0, i10, 7));
                    } else if (q20Var != null) {
                        i0.g3(new pf(q20Var, 0));
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                vp vpVar = (vp) this.e;
                long j12 = this.f18533b;
                TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) this.f18535f;
                int i11 = this.f18534c;
                long j13 = this.d;
                LongSparseIntArray longSparseIntArray = vpVar.G0;
                a0.h hVar = vpVar.l1;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.f(j12);
                if (chatFull != null) {
                    tL_messages_chatFull.full_chat.inviterId = chatFull.inviterId;
                }
                hVar.k(tL_messages_chatFull.full_chat, j12);
                long j14 = -j12;
                vpVar.f18910t7.M(j14);
                TLRPC.PeerNotifySettings peerNotifySettings = tL_messages_chatFull.full_chat.notify_settings;
                pt ptVar = vpVar.getNotificationsController().f17321g0;
                ptVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new y8(ptVar, j14, 0L, peerNotifySettings, 6));
                }
                for (int i12 = 0; i12 < tL_messages_chatFull.full_chat.bot_info.size(); i12++) {
                    vpVar.getMediaDataController().D1(j14, tL_messages_chatFull.full_chat.bot_info.get(i12));
                }
                int indexOfKey = longSparseIntArray.indexOfKey(j14);
                if (tL_messages_chatFull.full_chat.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(j14, 1);
                        vpVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    vpVar.getNotificationCenter().k(43, new Object[0]);
                }
                vpVar.f18883r.k(tL_messages_chatFull.full_chat.exported_invite, j12);
                vpVar.f18895s1.remove(Long.valueOf(j12));
                vpVar.f18932w1.put(j12, System.currentTimeMillis());
                vpVar.V3(tL_messages_chatFull.users, false);
                vpVar.P3(tL_messages_chatFull.chats, false);
                if (tL_messages_chatFull.full_chat.stickerset != null) {
                    vpVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.stickerset);
                }
                if (tL_messages_chatFull.full_chat.emojiset != null) {
                    vpVar.getMediaDataController().Y(tL_messages_chatFull.full_chat.emojiset);
                }
                vpVar.getNotificationCenter().k(30, tL_messages_chatFull.full_chat, Integer.valueOf(i11), Boolean.FALSE, Boolean.TRUE);
                TLRPC.Dialog dialog = (TLRPC.Dialog) vpVar.Q.f(j14);
                if (dialog != null) {
                    TLRPC.ChatFull chatFull2 = tL_messages_chatFull.full_chat;
                    if ((chatFull2.flags & 2048) != 0) {
                        int i13 = dialog.folder_id;
                        int i14 = chatFull2.folder_id;
                        if (i13 != i14) {
                            dialog.folder_id = i14;
                            vpVar.Q4(null);
                            vpVar.getNotificationCenter().k(3, new Object[0]);
                        }
                    }
                    int i15 = dialog.ttl_period;
                    int i16 = tL_messages_chatFull.full_chat.ttl_period;
                    if (i15 != i16) {
                        dialog.ttl_period = i16;
                        vpVar.getNotificationCenter().k(3, new Object[0]);
                    }
                    boolean z10 = dialog.view_forum_as_messages;
                    boolean z11 = tL_messages_chatFull.full_chat.view_forum_as_messages;
                    if (z10 != z11) {
                        dialog.view_forum_as_messages = z11;
                        hs messagesStorage = vpVar.getMessagesStorage();
                        messagesStorage.f15938a.c(new fq(1, j13, messagesStorage, tL_messages_chatFull.full_chat.view_forum_as_messages));
                        return;
                    }
                    return;
                }
                return;
            default:
                ((hs) this.e).getMessagesController().a0(null, null, null, this.f18533b, true, 0, false, this.d, (TLMethod) this.f18535f, this.f18534c);
                return;
        }
    }

    public vh(vp vpVar, long j10, TLRPC.TL_messages_chatFull tL_messages_chatFull, int i10, long j11) {
        this.f18532a = 1;
        this.e = vpVar;
        this.f18533b = j10;
        this.f18535f = tL_messages_chatFull;
        this.f18534c = i10;
        this.d = j11;
    }
}
