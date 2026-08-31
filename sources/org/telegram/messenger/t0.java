package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t0 implements RequestDelegate {
    public final int f20039a;
    public final ChatMessagesMetadataController f20040b;

    public t0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f20039a = i10;
        this.f20040b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20039a) {
            case 0:
                this.f20040b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f20040b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
