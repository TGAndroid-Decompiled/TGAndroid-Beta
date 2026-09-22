package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f17573a;
    public final ChatMessagesMetadataController f17574b;

    public t0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f17573a = i10;
        this.f17574b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17573a) {
            case 0:
                this.f17574b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f17574b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
