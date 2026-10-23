package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vb implements Runnable {
    public final int f19756a;
    public final MessagesController f19757b;
    public final TLRPC.Dialog f19758c;

    public vb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19756a = i10;
        this.f19757b = messagesController;
        this.f19758c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19756a) {
            case 0:
                this.f19757b.lambda$checkLastDialogMessage$224(this.f19758c);
                return;
            case 1:
                this.f19757b.lambda$checkLastDialogMessage$225(this.f19758c);
                return;
            default:
                this.f19757b.lambda$checkLastDialogMessage$223(this.f19758c);
                return;
        }
    }
}
