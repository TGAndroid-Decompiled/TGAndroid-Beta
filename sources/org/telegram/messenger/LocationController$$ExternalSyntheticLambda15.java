package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LocationController$$ExternalSyntheticLambda15 implements RequestDelegate {
    public final int $r8$classId;
    public final LocationController f$0;

    public LocationController$$ExternalSyntheticLambda15(LocationController locationController, int i) {
        this.$r8$classId = i;
        this.f$0 = locationController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$removeSharingLocation$19(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$removeAllLocationSharings$22(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$markLiveLoactionsAsRead$27(tLObject, tL_error);
                break;
        }
    }
}
