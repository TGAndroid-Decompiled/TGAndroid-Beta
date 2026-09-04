package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s0 implements RequestDelegate {
    public final int f18938a;
    public final ChatMessagesMetadataController f18939b;

    public s0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f18938a = i10;
        this.f18939b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18938a) {
            case 0:
                this.f18939b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f18939b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
