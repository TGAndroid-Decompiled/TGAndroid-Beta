package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wb implements Runnable {
    public final int f19462a;
    public final MessagesController f19463b;
    public final TLRPC.Dialog f19464c;

    public wb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19462a = i10;
        this.f19463b = messagesController;
        this.f19464c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19462a) {
            case 0:
                this.f19463b.lambda$checkLastDialogMessage$224(this.f19464c);
                return;
            case 1:
                this.f19463b.lambda$checkLastDialogMessage$225(this.f19464c);
                return;
            default:
                this.f19463b.lambda$checkLastDialogMessage$223(this.f19464c);
                return;
        }
    }
}
