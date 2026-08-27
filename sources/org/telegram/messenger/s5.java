package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class s5 implements RequestDelegate {

    public final int f21501a;

    public final LocationController f21502b;

    public s5(LocationController locationController, int i10) {
        this.f21501a = i10;
        this.f21502b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21501a) {
            case 0:
                this.f21502b.lambda$removeSharingLocation$19(tLObject, tL_error);
                break;
            case 1:
                this.f21502b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                break;
            default:
                this.f21502b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                break;
        }
    }
}
