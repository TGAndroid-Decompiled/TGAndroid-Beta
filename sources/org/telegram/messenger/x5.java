package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x5 implements RequestDelegate {
    public final int f20119a;
    public final LocationController f20120b;

    public x5(LocationController locationController, int i10) {
        this.f20119a = i10;
        this.f20120b = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20119a) {
            case 0:
                this.f20120b.lambda$removeSharingLocation$19(tLObject, tL_error);
                return;
            case 1:
                this.f20120b.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                return;
            default:
                this.f20120b.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                return;
        }
    }
}
