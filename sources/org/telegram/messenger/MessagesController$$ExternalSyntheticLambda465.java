package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda465 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final TLRPC.Dialog f$1;

    public MessagesController$$ExternalSyntheticLambda465(MessagesController messagesController, TLRPC.Dialog dialog, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = dialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkLastDialogMessage$225(this.f$1);
                break;
            case 1:
                this.f$0.lambda$checkLastDialogMessage$226(this.f$1);
                break;
            default:
                this.f$0.lambda$checkLastDialogMessage$224(this.f$1);
                break;
        }
    }
}
