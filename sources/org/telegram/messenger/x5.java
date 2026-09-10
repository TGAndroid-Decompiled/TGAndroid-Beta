package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x5 implements RequestDelegate {
    public final int f16945a;
    public final LocationController f16946b;

    public x5(LocationController locationController, int i10) {
        this.f16945a = i10;
        this.f16946b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16945a) {
            case 0:
                this.f16946b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f16946b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f16946b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
