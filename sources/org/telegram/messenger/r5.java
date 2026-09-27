package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r5 implements RequestDelegate {
    public final int f17437a;
    public final LocationController f17438b;

    public r5(LocationController locationController, int i10) {
        this.f17437a = i10;
        this.f17438b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17437a) {
            case 0:
                this.f17438b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f17438b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f17438b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
