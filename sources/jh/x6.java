package jh;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements Runnable {
    public final int f13073a = 0;
    public final long f13074b;
    public final boolean f13075c;
    public final long d;
    public final Object f13076e;
    public final TLObject f13077f;

    public x6(s7 s7Var, TLObject tLObject, long j10, long j11, boolean z10) {
        this.f13076e = s7Var;
        this.f13077f = tLObject;
        this.f13074b = j10;
        this.d = j11;
        this.f13075c = z10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f13073a;
        TLObject tLObject = this.f13077f;
        Object obj = this.f13076e;
        switch (i10) {
            case 0:
                s7 s7Var = (s7) obj;
                int i11 = s7Var.f12787a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j10 = this.f13074b;
                    long j11 = this.d;
                    if (j10 != 0) {
                        s7Var.b0(-j10, j11, this.f13075c);
                        return;
                    }
                    TLRPC.UserFull userFull = MessagesController.getInstance(i11).getUserFull(j11);
                    if (userFull != null && (peerSettings = userFull.settings) != null) {
                        peerSettings.flags &= -16385;
                        peerSettings.charge_paid_message_stars = 0L;
                    }
                    MessagesController.getNotificationsSettings(i11).edit().putLong(a4.w.m(j11, "dialog_bar_paying_"), 0L).apply();
                    MessagesController.getInstance(i11).loadPeerSettings(MessagesController.getInstance(i11).getUser(Long.valueOf(j11)), MessagesController.getInstance(i11).getChat(Long.valueOf(-j11)), true);
                    ContactsController.getInstance(i11).loadPrivacySettings(true);
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j11));
                    return;
                }
                return;
            default:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f13074b, this.f13075c, (TLRPC.InputPeer) tLObject, this.d);
                return;
        }
    }

    public x6(MessagesStorage messagesStorage, long j10, boolean z10, TLRPC.InputPeer inputPeer, long j11) {
        this.f13076e = messagesStorage;
        this.f13074b = j10;
        this.f13075c = z10;
        this.f13077f = inputPeer;
        this.d = j11;
    }
}
