package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u0 implements RequestDelegate {
    public final int f17648a;
    public final ChatMessagesMetadataController f17649b;

    public u0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f17648a = i10;
        this.f17649b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17648a) {
            case 0:
                this.f17649b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f17649b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
