package lh;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f13396a = 0;
    public final long f13397b;
    public final boolean f13398c;
    public final long d;
    public final Object e;
    public final TLObject f13399f;

    public y6(t7 t7Var, TLObject tLObject, long j10, long j11, boolean z4) {
        this.e = t7Var;
        this.f13399f = tLObject;
        this.f13397b = j10;
        this.d = j11;
        this.f13398c = z4;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f13396a;
        TLObject tLObject = this.f13399f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                t7 t7Var = (t7) obj;
                int i11 = t7Var.f13149a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.f13397b;
                    long j11 = this.d;
                    if (j10 != 0) {
                        t7Var.b0(-j10, j11, this.f13398c);
                        return;
                    }
                    TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j11);
                    if (userFull != null && (peerSettings = userFull.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    MessagesController.getNotificationsSettings(i11).edit().putLong(android.support.v4.media.a.n(j11, "dialog_bar_paying_"), 0L).apply();
                    MessagesController.getInstance(i11).loadPeerSettings(MessagesController.getInstance(i11).getUser(Long.valueOf(j11)), MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), true);
                    ContactsController.getInstance(i11).loadPrivacySettings(true);
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
                    return;
                }
                return;
            default:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f13397b, this.f13398c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public y6(MessagesStorage messagesStorage, long j10, boolean z4, TLRPC.InputPeer inputPeer, long j11) {
        this.e = messagesStorage;
        this.f13397b = j10;
        this.f13398c = z4;
        this.f13399f = inputPeer;
        this.d = j11;
    }
}
