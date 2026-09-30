package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f17484a;
    public final MessagesController f17485b;
    public final TLRPC.Dialog f17486c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17484a = i10;
        this.f17485b = messagesController;
        this.f17486c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17484a) {
            case 0:
                this.f17485b.lambda$checkLastDialogMessage$225(this.f17486c);
                return;
            case 1:
                this.f17485b.lambda$checkLastDialogMessage$226(this.f17486c);
                return;
            default:
                this.f17485b.lambda$checkLastDialogMessage$224(this.f17486c);
                return;
        }
    }
}
