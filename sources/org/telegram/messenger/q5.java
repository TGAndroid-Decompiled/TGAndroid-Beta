package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q5 implements RequestDelegate {
    public final int f21295a;
    public final LocationController f21296b;

    public q5(LocationController locationController, int i9) {
        this.f21295a = i9;
        this.f21296b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21295a) {
            case 0:
                this.f21296b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f21296b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f21296b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
