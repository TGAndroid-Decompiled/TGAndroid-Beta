package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r5 implements RequestDelegate {
    public final int f18861a;
    public final LocationController f18862b;

    public r5(LocationController locationController, int i10) {
        this.f18861a = i10;
        this.f18862b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18861a) {
            case 0:
                this.f18862b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f18862b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f18862b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
