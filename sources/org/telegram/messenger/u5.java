package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u5 implements RequestDelegate {
    public final int f19629a;
    public final LocationController f19630b;

    public u5(LocationController locationController, int i10) {
        this.f19629a = i10;
        this.f19630b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19629a) {
            case 0:
                this.f19630b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f19630b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f19630b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
