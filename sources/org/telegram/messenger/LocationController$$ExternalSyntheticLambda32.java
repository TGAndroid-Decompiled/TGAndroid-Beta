package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class LocationController$$ExternalSyntheticLambda32 implements RequestDelegate {
    public static final LocationController$$ExternalSyntheticLambda32 INSTANCE = new LocationController$$ExternalSyntheticLambda32();

    private LocationController$$ExternalSyntheticLambda32() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        LocationController.lambda$broadcastLastKnownLocation$8(tLObject, tLRPC$TL_error);
    }
}
