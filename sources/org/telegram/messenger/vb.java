package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vb implements Runnable {
    public final int f19819a;
    public final MessagesController f19820b;
    public final TLRPC.Dialog f19821c;

    public vb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19819a = i10;
        this.f19820b = messagesController;
        this.f19821c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19819a) {
            case 0:
                this.f19820b.lambda$checkLastDialogMessage$224(this.f19821c);
                return;
            case 1:
                this.f19820b.lambda$checkLastDialogMessage$225(this.f19821c);
                return;
            default:
                this.f19820b.lambda$checkLastDialogMessage$223(this.f19821c);
                return;
        }
    }
}
