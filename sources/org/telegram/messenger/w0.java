package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements RequestDelegate {
    public final int f20021a;
    public final ChatMessagesMetadataController f20022b;

    public w0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f20021a = i10;
        this.f20022b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20021a) {
            case 0:
                this.f20022b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f20022b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
