package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f21523a;
    public final ChatMessagesMetadataController f21524b;

    public t0(ChatMessagesMetadataController chatMessagesMetadataController, int i9) {
        this.f21523a = i9;
        this.f21524b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21523a) {
            case 0:
                this.f21524b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f21524b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
