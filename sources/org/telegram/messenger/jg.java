package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jg implements Runnable {
    public final int f18098a = 0;
    public final long f18099b;
    public final long f18100c;
    public final boolean d;
    public final Object f18101e;
    public final TLObject f18102f;

    public jg(MessagesStorage messagesStorage, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f18101e = messagesStorage;
        this.f18099b = j3;
        this.d = z10;
        this.f18102f = inputPeer;
        this.f18100c = j10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f18098a;
        TLObject tLObject = this.f18102f;
        Object obj = this.f18101e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f18099b, this.d, (TLRPC.InputPeer) tLObject, this.f18100c);
                return;
            default:
                zh.s5 s5Var = (zh.s5) obj;
                int i11 = s5Var.f52566a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.f18099b;
                    long j10 = this.f18100c;
                    if (j3 != 0) {
                        s5Var.b0(-j3, j10, this.d);
                        return;
                    }
                    TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
                    if (userFull != null && (peerSettings = userFull.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    MessagesController.getNotificationsSettings(i11).edit().putLong(a4.a.o(j10, "dialog_bar_paying_"), 0L).apply();
                    MessagesController.getInstance(i11).loadPeerSettings(MessagesController.getInstance(i11).getUser(Long.valueOf(j10)), MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)), true);
                    ContactsController.getInstance(i11).loadPrivacySettings(true);
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j10));
                    return;
                }
                return;
        }
    }

    public jg(zh.s5 s5Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.f18101e = s5Var;
        this.f18102f = tLObject;
        this.f18099b = j3;
        this.f18100c = j10;
        this.d = z10;
    }
}
