package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sd implements Runnable {
    public final int f17312a;
    public final MessagesController f17313b;
    public final TLRPC.Dialog f17314c;

    public sd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17312a = i10;
        this.f17313b = messagesController;
        this.f17314c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17312a) {
            case 0:
                this.f17313b.lambda$checkLastDialogMessage$225(this.f17314c);
                return;
            case 1:
                this.f17313b.lambda$checkLastDialogMessage$226(this.f17314c);
                return;
            default:
                this.f17313b.lambda$checkLastDialogMessage$224(this.f17314c);
                return;
        }
    }
}
