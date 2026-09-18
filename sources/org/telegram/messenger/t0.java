package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f17527a;
    public final ChatMessagesMetadataController f17528b;

    public t0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f17527a = i10;
        this.f17528b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17527a) {
            case 0:
                this.f17528b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f17528b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
