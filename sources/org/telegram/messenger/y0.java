package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y0 implements RequestDelegate {
    public final int f21867a;
    public final ChatMessagesMetadataController f21868b;

    public y0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f21867a = i10;
        this.f21868b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21867a) {
            case 0:
                this.f21868b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f21868b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
