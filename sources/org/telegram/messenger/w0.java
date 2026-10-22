package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w0 implements RequestDelegate {
    public final int f19953a;
    public final ChatMessagesMetadataController f19954b;

    public w0(ChatMessagesMetadataController chatMessagesMetadataController, int i10) {
        this.f19953a = i10;
        this.f19954b = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19953a) {
            case 0:
                this.f19954b.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                return;
            default:
                this.f19954b.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                return;
        }
    }
}
