package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sb implements Runnable {
    public final int f19496a;
    public final MessagesController f19497b;
    public final TLRPC.Dialog f19498c;

    public sb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19496a = i10;
        this.f19497b = messagesController;
        this.f19498c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19496a) {
            case 0:
                this.f19497b.lambda$checkLastDialogMessage$224(this.f19498c);
                return;
            case 1:
                this.f19497b.lambda$checkLastDialogMessage$225(this.f19498c);
                return;
            default:
                this.f19497b.lambda$checkLastDialogMessage$223(this.f19498c);
                return;
        }
    }
}
