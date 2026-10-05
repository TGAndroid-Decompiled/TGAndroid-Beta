package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u0 implements RequestDelegate {
    public final int f19293a;
    public final ChatMessagesMetadataController f19294b;

    public u0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f19293a = i10;
        this.f19294b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19293a) {
            case 0:
                this.f19294b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f19294b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
