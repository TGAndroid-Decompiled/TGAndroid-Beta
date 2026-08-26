package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda272 implements RequestDelegate {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final long f$1;
    public final long f$2;

    public MessagesController$$ExternalSyntheticLambda272(int i, long j, long j2, MessagesController messagesController) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadUnknownDialog$208(this.f$1, this.f$2, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$deleteMessages$124(this.f$1, this.f$2, tLObject, tL_error);
                break;
        }
    }
}
