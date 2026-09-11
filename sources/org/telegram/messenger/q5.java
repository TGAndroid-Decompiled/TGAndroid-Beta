package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q5 implements RequestDelegate {
    public final int f18786a;
    public final LocationController f18787b;

    public q5(LocationController locationController, int i10) {
        this.f18786a = i10;
        this.f18787b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18786a) {
            case 0:
                this.f18787b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f18787b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f18787b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
