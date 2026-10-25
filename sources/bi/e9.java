package bi;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e9 implements Runnable {
    public final int f4567a = 0;
    public final long f4568b;
    public final boolean f4569c;
    public final long d;
    public final Object e;
    public final TLObject f4570f;

    public e9(ca caVar, TLObject tLObject, long j10, long j11, boolean z10) {
        this.e = caVar;
        this.f4570f = tLObject;
        this.f4568b = j10;
        this.d = j11;
        this.f4569c = z10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f4567a;
        TLObject tLObject = this.f4570f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                ca caVar = (ca) obj;
                int i11 = caVar.f4441a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.f4568b;
                    int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    long j11 = this.d;
                    if (i12 != 0) {
                        caVar.b0(-j10, j11, this.f4569c);
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
            default:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f4568b, this.f4569c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public e9(MessagesStorage messagesStorage, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.e = messagesStorage;
        this.f4568b = j10;
        this.f4569c = z10;
        this.f4570f = inputPeer;
        this.d = j11;
    }
}
