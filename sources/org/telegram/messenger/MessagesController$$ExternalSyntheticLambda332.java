package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda332 implements RequestDelegate {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final long f$1;
    public final int f$2;
    public final long f$3;

    public MessagesController$$ExternalSyntheticLambda332(int i, long j, long j2, MessagesController messagesController) {
        this.$r8$classId = 0;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = i;
        this.f$3 = j2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getChannelDifference$349(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$sendTyping$172(this.f$2, this.f$1, this.f$3, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$sendTyping$174(this.f$2, this.f$1, this.f$3, tLObject, tL_error);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda332(MessagesController messagesController, int i, long j, long j2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesController;
        this.f$2 = i;
        this.f$1 = j;
        this.f$3 = j2;
    }
}
