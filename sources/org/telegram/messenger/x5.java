package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x5 implements RequestDelegate {
    public final int f20054a;
    public final LocationController f20055b;

    public x5(LocationController locationController, int i10) {
        this.f20054a = i10;
        this.f20055b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20054a) {
            case 0:
                this.f20055b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f20055b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f20055b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
