package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sd implements Runnable {
    public final int f17493a;
    public final MessagesController f17494b;
    public final TLRPC.Dialog f17495c;

    public sd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17493a = i10;
        this.f17494b = messagesController;
        this.f17495c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17493a) {
            case 0:
                this.f17494b.lambda$checkLastDialogMessage$225(this.f17495c);
                return;
            case 1:
                this.f17494b.lambda$checkLastDialogMessage$226(this.f17495c);
                return;
            default:
                this.f17494b.lambda$checkLastDialogMessage$224(this.f17495c);
                return;
        }
    }
}
