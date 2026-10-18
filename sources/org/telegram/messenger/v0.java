package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v0 implements RequestDelegate {
    public final int f19688a;
    public final ChatMessagesMetadataController f19689b;

    public v0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f19688a = i10;
        this.f19689b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19688a) {
            case 0:
                this.f19689b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f19689b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
