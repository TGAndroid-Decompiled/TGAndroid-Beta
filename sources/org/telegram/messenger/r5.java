package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r5 implements RequestDelegate {
    public final int f17428a;
    public final LocationController f17429b;

    public r5(LocationController locationController, int i10) {
        this.f17428a = i10;
        this.f17429b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17428a) {
            case 0:
                this.f17429b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f17429b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f17429b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
