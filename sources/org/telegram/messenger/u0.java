package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u0 implements RequestDelegate {
    public final int f17654a;
    public final ChatMessagesMetadataController f17655b;

    public u0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f17654a = i10;
        this.f17655b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17654a) {
            case 0:
                this.f17655b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f17655b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
