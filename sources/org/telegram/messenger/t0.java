package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f18427a;
    public final ChatMessagesMetadataController f18428b;

    public t0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f18427a = i10;
        this.f18428b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18427a) {
            case 0:
                this.f18428b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f18428b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
