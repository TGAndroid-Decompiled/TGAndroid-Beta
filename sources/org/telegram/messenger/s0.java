package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s0 implements RequestDelegate {
    public final int f17269a;
    public final ChatMessagesMetadataController f17270b;

    public s0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f17269a = i10;
        this.f17270b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17269a) {
            case 0:
                this.f17270b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f17270b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
