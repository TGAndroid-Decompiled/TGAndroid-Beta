package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements RequestDelegate {
    public final int f19956a;
    public final ChatMessagesMetadataController f19957b;

    public w0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f19956a = i10;
        this.f19957b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19956a) {
            case 0:
                this.f19957b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f19957b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
