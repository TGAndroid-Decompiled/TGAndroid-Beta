package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements RequestDelegate {
    public final int f19932a;
    public final ChatMessagesMetadataController f19933b;

    public w0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f19932a = i10;
        this.f19933b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19932a) {
            case 0:
                this.f19933b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f19933b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
