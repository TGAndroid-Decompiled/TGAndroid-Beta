package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s0 implements RequestDelegate {
    public final int f21484a;
    public final ChatMessagesMetadataController f21485b;

    public s0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f21484a = i10;
        this.f21485b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21484a) {
            case 0:
                this.f21485b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f21485b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
