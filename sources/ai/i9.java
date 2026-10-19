package ai;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Runnable {
    public final int f1491a = 0;
    public final long f1492b;
    public final boolean f1493c;
    public final long d;
    public final Object e;
    public final TLObject f1494f;

    public i9(ga gaVar, TLObject tLObject, long j10, long j11, boolean z10) {
        this.e = gaVar;
        this.f1494f = tLObject;
        this.f1492b = j10;
        this.d = j11;
        this.f1493c = z10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f1491a;
        TLObject tLObject = this.f1494f;
        Object obj = this.e;
        switch (i10) {
            case 0:
                ga gaVar = (ga) obj;
                int i11 = gaVar.f1348a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.f1492b;
                    int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    long j11 = this.d;
                    if (i12 != 0) {
                        gaVar.b0(-j10, j11, this.f1493c);
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
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f1492b, this.f1493c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public i9(MessagesStorage messagesStorage, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.e = messagesStorage;
        this.f1492b = j10;
        this.f1493c = z10;
        this.f1494f = inputPeer;
        this.d = j11;
    }
}
