package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sd implements Runnable {
    public final int f17309a;
    public final MessagesController f17310b;
    public final TLRPC.Dialog f17311c;

    public sd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17309a = i10;
        this.f17310b = messagesController;
        this.f17311c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17309a) {
            case 0:
                this.f17310b.lambda$checkLastDialogMessage$225(this.f17311c);
                return;
            case 1:
                this.f17310b.lambda$checkLastDialogMessage$226(this.f17311c);
                return;
            default:
                this.f17310b.lambda$checkLastDialogMessage$224(this.f17311c);
                return;
        }
    }
}
