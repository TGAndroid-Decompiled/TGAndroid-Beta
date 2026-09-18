package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r5 implements RequestDelegate {
    public final int f17387a;
    public final LocationController f17388b;

    public r5(LocationController locationController, int i10) {
        this.f17387a = i10;
        this.f17388b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17387a) {
            case 0:
                this.f17388b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f17388b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f17388b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
