package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v5 implements RequestDelegate {
    public final int f18346a;
    public final LocationController f18347b;

    public v5(LocationController locationController, int i10) {
        this.f18346a = i10;
        this.f18347b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18346a) {
            case 0:
                this.f18347b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f18347b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f18347b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
