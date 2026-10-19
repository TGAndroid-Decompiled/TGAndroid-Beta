package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rb implements Runnable {
    public final int f19416a;
    public final MessagesController f19417b;
    public final TLRPC.Dialog f19418c;

    public rb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19416a = i10;
        this.f19417b = messagesController;
        this.f19418c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19416a) {
            case 0:
                this.f19417b.lambda$checkLastDialogMessage$224(this.f19418c);
                return;
            case 1:
                this.f19417b.lambda$checkLastDialogMessage$225(this.f19418c);
                return;
            default:
                this.f19417b.lambda$checkLastDialogMessage$223(this.f19418c);
                return;
        }
    }
}
