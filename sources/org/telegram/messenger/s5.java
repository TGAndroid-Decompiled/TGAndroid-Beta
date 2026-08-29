package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s5 implements RequestDelegate {
    public final int f21510a;
    public final LocationController f21511b;

    public s5(LocationController locationController, int i10) {
        this.f21510a = i10;
        this.f21511b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21510a) {
            case 0:
                this.f21511b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f21511b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f21511b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
