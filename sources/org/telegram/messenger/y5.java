package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y5 implements RequestDelegate {
    public final int f21887a;
    public final LocationController f21888b;

    public y5(LocationController locationController, int i10) {
        this.f21887a = i10;
        this.f21888b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21887a) {
            case 0:
                this.f21888b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f21888b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f21888b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
