package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c6 implements RequestDelegate {
    public final int f15801a;
    public final int f15802b;
    public final int f15803c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public c6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f15801a = i12;
        this.d = notificationCenterDelegate;
        this.f15802b = i10;
        this.f15803c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15801a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f15802b, this.f15803c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f15802b, this.f15803c, tLObject, tL_error);
                return;
        }
    }
}
