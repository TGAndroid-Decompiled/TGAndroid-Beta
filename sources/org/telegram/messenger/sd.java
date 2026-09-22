package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sd implements Runnable {
    public final int f17542a;
    public final MessagesController f17543b;
    public final TLRPC.Dialog f17544c;

    public sd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17542a = i10;
        this.f17543b = messagesController;
        this.f17544c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17542a) {
            case 0:
                this.f17543b.lambda$checkLastDialogMessage$225(this.f17544c);
                return;
            case 1:
                this.f17543b.lambda$checkLastDialogMessage$226(this.f17544c);
                return;
            default:
                this.f17543b.lambda$checkLastDialogMessage$224(this.f17544c);
                return;
        }
    }
}
