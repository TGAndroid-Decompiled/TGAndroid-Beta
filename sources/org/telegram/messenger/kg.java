package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kg implements Runnable {
    public final int f16815a = 0;
    public final long f16816b;
    public final long f16817c;
    public final boolean d;
    public final Object e;
    public final TLObject f16818f;

    public kg(MessagesStorage messagesStorage, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.e = messagesStorage;
        this.f16816b = j3;
        this.d = z10;
        this.f16818f = inputPeer;
        this.f16817c = j10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f16815a;
        TLObject tLObject = this.f16818f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f16816b, this.d, (TLRPC.InputPeer) tLObject, this.f16817c);
                return;
            default:
                yh.u5 u5Var = (yh.u5) obj;
                int i11 = u5Var.f48111a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.f16816b;
                    long j10 = this.f16817c;
                    if (j3 != 0) {
                        u5Var.b0(-j3, j10, this.d);
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

    public kg(yh.u5 u5Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.e = u5Var;
        this.f16818f = tLObject;
        this.f16816b = j3;
        this.f16817c = j10;
        this.d = z10;
    }
}
