package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s0 implements RequestDelegate {
    public final int f18940a;
    public final ChatMessagesMetadataController f18941b;

    public s0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f18940a = i10;
        this.f18941b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18940a) {
            case 0:
                this.f18941b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f18941b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
