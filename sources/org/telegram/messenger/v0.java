package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v0 implements RequestDelegate {
    public final int f18326a;
    public final ChatMessagesMetadataController f18327b;

    public v0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f18326a = i10;
        this.f18327b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18326a) {
            case 0:
                this.f18327b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f18327b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
