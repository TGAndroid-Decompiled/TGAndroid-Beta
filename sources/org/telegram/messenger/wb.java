package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wb implements Runnable {
    public final int f19463a;
    public final MessagesController f19464b;
    public final TLRPC.Dialog f19465c;

    public wb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19463a = i10;
        this.f19464b = messagesController;
        this.f19465c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19463a) {
            case 0:
                this.f19464b.lambda$checkLastDialogMessage$224(this.f19465c);
                return;
            case 1:
                this.f19464b.lambda$checkLastDialogMessage$225(this.f19465c);
                return;
            default:
                this.f19464b.lambda$checkLastDialogMessage$223(this.f19465c);
                return;
        }
    }
}
