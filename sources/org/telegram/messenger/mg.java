package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mg implements Runnable {
    public final int f18288a = 0;
    public final long f18289b;
    public final long f18290c;
    public final boolean d;
    public final Object f18291e;
    public final TLObject f18292f;

    public mg(MessagesStorage messagesStorage, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f18291e = messagesStorage;
        this.f18289b = j3;
        this.d = z10;
        this.f18292f = inputPeer;
        this.f18290c = j10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f18288a;
        TLObject tLObject = this.f18292f;
        Object obj = this.f18291e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f18289b, this.d, (TLRPC.InputPeer) tLObject, this.f18290c);
                return;
            default:
                yh.n5 n5Var = (yh.n5) obj;
                int i11 = n5Var.f53146a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.f18289b;
                    int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    long j10 = this.f18290c;
                    if (i12 != 0) {
                        n5Var.b0(-j3, j10, this.d);
                        return;
                    }
                    TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j10);
                    if (userFull != null && (peerSettings = userFull.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    MessagesController.getNotificationsSettings(i11).edit().putLong(a1.g.p(j10, "dialog_bar_paying_"), 0L).apply();
                    MessagesController.getInstance(i11).loadPeerSettings(MessagesController.getInstance(i11).getUser(Long.valueOf(j10)), MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)), true);
                    ContactsController.getInstance(i11).loadPrivacySettings(true);
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j10));
                    return;
                }
                return;
        }
    }

    public mg(yh.n5 n5Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.f18291e = n5Var;
        this.f18292f = tLObject;
        this.f18289b = j3;
        this.f18290c = j10;
        this.d = z10;
    }
}
