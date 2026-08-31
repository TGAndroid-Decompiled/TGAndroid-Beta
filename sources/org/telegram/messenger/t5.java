package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t5 implements RequestDelegate {
    public final int f20065a;
    public final LocationController f20066b;

    public t5(LocationController locationController, int i10) {
        this.f20065a = i10;
        this.f20066b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20065a) {
            case 0:
                this.f20066b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f20066b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f20066b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
