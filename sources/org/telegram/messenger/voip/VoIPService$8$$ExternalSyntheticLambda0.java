package org.telegram.messenger.voip;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class VoIPService$8$$ExternalSyntheticLambda0 implements RequestDelegate {
    public static final VoIPService$8$$ExternalSyntheticLambda0 INSTANCE = new VoIPService$8$$ExternalSyntheticLambda0();

    private VoIPService$8$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        VoIPService.C09398.lambda$didReceivedNotification$0(tLObject, tLRPC$TL_error);
    }
}
