package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e6 implements RequestDelegate {
    public final int f20096a;
    public final int f20097b;
    public final int f20098c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public e6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f20096a = i12;
        this.d = notificationCenterDelegate;
        this.f20097b = i10;
        this.f20098c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20096a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f20097b, this.f20098c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f20097b, this.f20098c, tLObject, tL_error);
                return;
        }
    }
}
