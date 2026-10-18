package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u5 implements RequestDelegate {
    public final int f19633a;
    public final LocationController f19634b;

    public u5(LocationController locationController, int i10) {
        this.f19633a = i10;
        this.f19634b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19633a) {
            case 0:
                this.f19634b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f19634b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f19634b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
