package gh;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements Runnable {
    public final int f7797a = 0;
    public final long f7798b;
    public final boolean f7799c;
    public final long d;
    public final Object f7800e;
    public final TLObject f7801f;

    public a7(v7 v7Var, TLObject tLObject, long j10, long j11, boolean z10) {
        this.f7800e = v7Var;
        this.f7801f = tLObject;
        this.f7798b = j10;
        this.d = j11;
        this.f7799c = z10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i9 = this.f7797a;
        TLObject tLObject = this.f7801f;
        Object obj = this.f7800e;
        switch (i9) {
            case 0:
                v7 v7Var = (v7) obj;
                int i10 = v7Var.f9045a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.f7798b;
                    long j11 = this.d;
                    if (j10 != 0) {
                        v7Var.b0(-j10, j11, this.f7799c);
                        return;
                    }
                    TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j11);
                    if (userFull != null && (peerSettings = userFull.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    MessagesController.getNotificationsSettings(i10).edit().putLong(aa.d.m(j11, "dialog_bar_paying_"), 0L).apply();
                    MessagesController.getInstance(i10).loadPeerSettings(MessagesController.getInstance(i10).getUser(Long.valueOf(j11)), MessagesController.getInstance(i10).getChat(Long.valueOf(-j11)), true);
                    ContactsController.getInstance(i10).loadPrivacySettings(true);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
                    return;
                }
                return;
            default:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f7798b, this.f7799c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public a7(MessagesStorage messagesStorage, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.f7800e = messagesStorage;
        this.f7798b = j10;
        this.f7799c = z10;
        this.f7801f = inputPeer;
        this.d = j11;
    }
}
