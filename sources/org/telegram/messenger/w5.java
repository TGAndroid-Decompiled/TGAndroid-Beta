package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w5 implements RequestDelegate {
    public final int f19955a;
    public final LocationController f19956b;

    public w5(LocationController locationController, int i10) {
        this.f19955a = i10;
        this.f19956b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19955a) {
            case 0:
                this.f19956b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f19956b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f19956b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
