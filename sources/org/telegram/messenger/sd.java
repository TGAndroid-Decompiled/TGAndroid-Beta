package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sd implements Runnable {
    public final int f18980a;
    public final MessagesController f18981b;
    public final TLRPC.Dialog f18982c;

    public sd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f18980a = i10;
        this.f18981b = messagesController;
        this.f18982c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f18980a) {
            case 0:
                this.f18981b.lambda$checkLastDialogMessage$225(this.f18982c);
                return;
            case 1:
                this.f18981b.lambda$checkLastDialogMessage$226(this.f18982c);
                return;
            default:
                this.f18981b.lambda$checkLastDialogMessage$224(this.f18982c);
                return;
        }
    }
}
