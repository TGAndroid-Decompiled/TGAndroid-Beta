package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s0 implements RequestDelegate {
    public final int f17273a;
    public final ChatMessagesMetadataController f17274b;

    public s0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f17273a = i10;
        this.f17274b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17273a) {
            case 0:
                this.f17274b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f17274b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
