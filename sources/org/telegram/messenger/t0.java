package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f16359a;
    public final ChatMessagesMetadataController f16360b;

    public t0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f16359a = i10;
        this.f16360b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16359a) {
            case 0:
                this.f16360b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f16360b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
