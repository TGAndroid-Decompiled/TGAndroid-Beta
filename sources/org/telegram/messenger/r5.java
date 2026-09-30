package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r5 implements RequestDelegate {
    public final int f17458a;
    public final LocationController f17459b;

    public r5(LocationController locationController, int i10) {
        this.f17458a = i10;
        this.f17459b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17458a) {
            case 0:
                this.f17459b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f17459b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f17459b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
