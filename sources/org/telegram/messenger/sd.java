package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sd implements Runnable {
    public final int f17527a;
    public final MessagesController f17528b;
    public final TLRPC.Dialog f17529c;

    public sd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17527a = i10;
        this.f17528b = messagesController;
        this.f17529c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17527a) {
            case 0:
                this.f17528b.lambda$checkLastDialogMessage$225(this.f17529c);
                return;
            case 1:
                this.f17528b.lambda$checkLastDialogMessage$226(this.f17529c);
                return;
            default:
                this.f17528b.lambda$checkLastDialogMessage$224(this.f17529c);
                return;
        }
    }
}
