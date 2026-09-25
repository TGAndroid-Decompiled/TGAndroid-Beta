package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f17464a;
    public final MessagesController f17465b;
    public final TLRPC.Dialog f17466c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17464a = i10;
        this.f17465b = messagesController;
        this.f17466c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17464a) {
            case 0:
                this.f17465b.lambda$checkLastDialogMessage$225(this.f17466c);
                return;
            case 1:
                this.f17465b.lambda$checkLastDialogMessage$226(this.f17466c);
                return;
            default:
                this.f17465b.lambda$checkLastDialogMessage$224(this.f17466c);
                return;
        }
    }
}
