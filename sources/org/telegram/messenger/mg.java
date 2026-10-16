package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mg implements Runnable {
    public final int f17572a = 0;
    public final long f17573b;
    public final long f17574c;
    public final boolean d;
    public final Object e;
    public final TLObject f17575f;

    public mg(MessagesStorage messagesStorage, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.e = messagesStorage;
        this.f17573b = j10;
        this.d = z10;
        this.f17575f = inputPeer;
        this.f17574c = j11;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f17572a;
        TLObject tLObject = this.f17575f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f17573b, this.d, (TLRPC.InputPeer) tLObject, this.f17574c);
                return;
            default:
                zh.n5 n5Var = (zh.n5) obj;
                int i11 = n5Var.f50865a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.f17573b;
                    int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    long j11 = this.f17574c;
                    if (i12 != 0) {
                        n5Var.b0(-j10, j11, this.d);
                        return;
                    }
                    TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j11);
                    if (userFull != null && (peerSettings = userFull.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    MessagesController.getNotificationsSettings(i11).edit().putLong(a1.g.o(j11, "dialog_bar_paying_"), 0L).apply();
                    MessagesController.getInstance(i11).loadPeerSettings(MessagesController.getInstance(i11).getUser(Long.valueOf(j11)), MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), true);
                    ContactsController.getInstance(i11).loadPrivacySettings(true);
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
                    return;
                }
                return;
        }
    }

    public mg(zh.n5 n5Var, TLObject tLObject, long j10, long j11, boolean z10) {
        this.e = n5Var;
        this.f17575f = tLObject;
        this.f17573b = j10;
        this.f17574c = j11;
        this.d = z10;
    }
}
