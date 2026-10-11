package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u0 implements RequestDelegate {
    public final int f19322a;
    public final ChatMessagesMetadataController f19323b;

    public u0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f19322a = i10;
        this.f19323b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19322a) {
            case 0:
                this.f19323b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f19323b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
