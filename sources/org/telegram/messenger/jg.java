package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jg implements Runnable {
    public final int f18308a = 0;
    public final long f18309b;
    public final long f18310c;
    public final boolean d;
    public final Object f18311e;
    public final TLObject f18312f;

    public jg(MessagesStorage messagesStorage, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f18311e = messagesStorage;
        this.f18309b = j3;
        this.d = z10;
        this.f18312f = inputPeer;
        this.f18310c = j10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f18308a;
        TLObject tLObject = this.f18312f;
        Object obj = this.f18311e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f18309b, this.d, (TLRPC.InputPeer) tLObject, this.f18310c);
                return;
            default:
                yh.n5 n5Var = (yh.n5) obj;
                int i11 = n5Var.f53031a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.f18309b;
                    int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    long j10 = this.f18310c;
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

    public jg(yh.n5 n5Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.f18311e = n5Var;
        this.f18312f = tLObject;
        this.f18309b = j3;
        this.f18310c = j10;
        this.d = z10;
    }
}
