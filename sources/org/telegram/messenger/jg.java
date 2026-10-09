package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jg implements Runnable {
    public final int f18263a = 0;
    public final long f18264b;
    public final long f18265c;
    public final boolean d;
    public final Object f18266e;
    public final TLObject f18267f;

    public jg(MessagesStorage messagesStorage, long j3, boolean z10, TLRPC.InputPeer inputPeer, long j10) {
        this.f18266e = messagesStorage;
        this.f18264b = j3;
        this.d = z10;
        this.f18267f = inputPeer;
        this.f18265c = j10;
    }

    @Override
    public final void run() {
        TLRPC.PeerSettings peerSettings;
        int i10 = this.f18263a;
        TLObject tLObject = this.f18267f;
        Object obj = this.f18266e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj).lambda$loadPendingTasks$15(this.f18264b, this.d, (TLRPC.InputPeer) tLObject, this.f18265c);
                return;
            default:
                yh.m5 m5Var = (yh.m5) obj;
                int i11 = m5Var.f52880a;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    long j3 = this.f18264b;
                    int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    long j10 = this.f18265c;
                    if (i12 != 0) {
                        m5Var.b0(-j3, j10, this.d);
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

    public jg(yh.m5 m5Var, TLObject tLObject, long j3, long j10, boolean z10) {
        this.f18266e = m5Var;
        this.f18267f = tLObject;
        this.f18264b = j3;
        this.f18265c = j10;
        this.d = z10;
    }
}
