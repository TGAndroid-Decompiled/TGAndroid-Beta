package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i6 implements RequestDelegate {
    public final int f15428a;
    public final int f15429b;
    public final int f15430c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public i6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f15428a = i12;
        this.d = notificationCenterDelegate;
        this.f15429b = i10;
        this.f15430c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15428a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f15429b, this.f15430c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f15429b, this.f15430c, tLObject, tL_error);
                return;
        }
    }
}
