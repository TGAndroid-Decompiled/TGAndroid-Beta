package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChatMessagesMetadataController$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final ChatMessagesMetadataController f$0;

    public ChatMessagesMetadataController$$ExternalSyntheticLambda0(ChatMessagesMetadataController chatMessagesMetadataController, int i) {
        this.$r8$classId = i;
        this.f$0 = chatMessagesMetadataController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadExtendedMediaForMessages$4(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadReactionsForMessages$3(tLObject, tL_error);
                break;
        }
    }
}
