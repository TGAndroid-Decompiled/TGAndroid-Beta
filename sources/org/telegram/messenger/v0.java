package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v0 implements RequestDelegate {
    public final int f19691a;
    public final ChatMessagesMetadataController f19692b;

    public v0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f19691a = i10;
        this.f19692b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19691a) {
            case 0:
                this.f19692b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f19692b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
