package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f17216a;
    public final MessagesController f17217b;
    public final TLRPC.Dialog f17218c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17216a = i10;
        this.f17217b = messagesController;
        this.f17218c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17216a) {
            case 0:
                this.f17217b.lambda$checkLastDialogMessage$225(this.f17218c);
                return;
            case 1:
                this.f17217b.lambda$checkLastDialogMessage$226(this.f17218c);
                return;
            default:
                this.f17217b.lambda$checkLastDialogMessage$224(this.f17218c);
                return;
        }
    }
}
