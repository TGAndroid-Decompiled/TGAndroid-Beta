package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wb implements Runnable {
    public final int f20049a;
    public final MessagesController f20050b;
    public final TLRPC.Dialog f20051c;

    public wb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f20049a = i10;
        this.f20050b = messagesController;
        this.f20051c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f20049a) {
            case 0:
                this.f20050b.lambda$checkLastDialogMessage$224(this.f20051c);
                return;
            case 1:
                this.f20050b.lambda$checkLastDialogMessage$225(this.f20051c);
                return;
            default:
                this.f20050b.lambda$checkLastDialogMessage$223(this.f20051c);
                return;
        }
    }
}
