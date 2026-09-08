package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s0 implements RequestDelegate {
    public final int f18965a;
    public final ChatMessagesMetadataController f18966b;

    public s0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f18965a = i10;
        this.f18966b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18965a) {
            case 0:
                this.f18966b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f18966b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
