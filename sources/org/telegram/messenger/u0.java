package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u0 implements RequestDelegate {
    public final int f19281a;
    public final ChatMessagesMetadataController f19282b;

    public u0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f19281a = i10;
        this.f19282b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19281a) {
            case 0:
                this.f19282b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f19282b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
