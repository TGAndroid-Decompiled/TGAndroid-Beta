package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r5 implements RequestDelegate {
    public final int f19050a;
    public final LocationController f19051b;

    public r5(LocationController locationController, int i10) {
        this.f19050a = i10;
        this.f19051b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19050a) {
            case 0:
                this.f19051b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f19051b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f19051b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
