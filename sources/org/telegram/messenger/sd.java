package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sd implements Runnable {
    public final int f17321a;
    public final MessagesController f17322b;
    public final TLRPC.Dialog f17323c;

    public sd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17321a = i10;
        this.f17322b = messagesController;
        this.f17323c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17321a) {
            case 0:
                this.f17322b.lambda$checkLastDialogMessage$225(this.f17323c);
                return;
            case 1:
                this.f17322b.lambda$checkLastDialogMessage$226(this.f17323c);
                return;
            default:
                this.f17322b.lambda$checkLastDialogMessage$224(this.f17323c);
                return;
        }
    }
}
