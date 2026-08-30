package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f18443a;
    public final ChatMessagesMetadataController f18444b;

    public t0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f18443a = i10;
        this.f18444b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18443a) {
            case 0:
                this.f18444b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f18444b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
