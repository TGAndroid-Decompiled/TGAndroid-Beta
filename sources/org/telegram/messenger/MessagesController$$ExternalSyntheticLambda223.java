package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda223 implements Runnable {
    public final int $r8$classId;
    public final MessagesController.ErrorDelegate f$0;
    public final TLRPC.TL_error f$1;

    public MessagesController$$ExternalSyntheticLambda223(MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = errorDelegate;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(this.f$1);
                break;
            default:
                this.f$0.run(this.f$1);
                break;
        }
    }
}
