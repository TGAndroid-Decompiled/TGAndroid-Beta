package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y0 implements RequestDelegate {
    public final int f21869a;
    public final ChatMessagesMetadataController f21870b;

    public y0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f21869a = i10;
        this.f21870b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21869a) {
            case 0:
                this.f21870b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f21870b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
