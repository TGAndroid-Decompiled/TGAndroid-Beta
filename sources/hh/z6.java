package hh;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class z6 implements Runnable {

    public final int f10427a = 0;

    public final long f10428b;

    public final boolean f10429c;
    public final long d;

    public final Object f10430e;

    public final TLObject f10431f;

    public z6(u7 u7Var, TLObject tLObject, long j10, long j11, boolean z10) {
        this.f10430e = u7Var;
        this.f10431f = tLObject;
        this.f10428b = j10;
        this.d = j11;
        this.f10429c = z10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f10427a;
        TLObject tLObject = this.f10431f;
        Object obj = this.f10430e;
        switch (i10) {
            case 0:
                u7 u7Var = (u7) obj;
                int i11 = u7Var.f10151a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.f10428b;
                    long j11 = this.d;
                    if (j10 == 0) {
                        TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j11);
                        if (userFull != null && (peerSettings = userFull.settings) != null) {
                            peerSettings.flags &= -16385;
                            peerSettings.charge_paid_message_stars = 0L;
                        }
                        MessagesController.getNotificationsSettings(i11).edit().putLong(a9.p.l(j11, "dialog_bar_paying_"), 0L).apply();
                        MessagesController.getInstance(i11).loadPeerSettings(MessagesController.getInstance(i11).getUser(Long.valueOf(j11)), MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), true);
                        ContactsController.getInstance(i11).loadPrivacySettings(true);
                        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
                    } else {
                        u7Var.b0(-j10, j11, this.f10429c);
                    }
                }
                break;
            default:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f10428b, this.f10429c, (TLRPC.InputPeer) tLObject, this.d);
                break;
        }
    }

    public z6(MessagesStorage messagesStorage, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.f10430e = messagesStorage;
        this.f10428b = j10;
        this.f10429c = z10;
        this.f10431f = inputPeer;
        this.d = j11;
    }
}
