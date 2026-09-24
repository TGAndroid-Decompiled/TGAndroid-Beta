package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f17449a;
    public final MessagesController f17450b;
    public final TLRPC.Dialog f17451c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17449a = i10;
        this.f17450b = messagesController;
        this.f17451c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17449a) {
            case 0:
                this.f17450b.lambda$checkLastDialogMessage$225(this.f17451c);
                return;
            case 1:
                this.f17450b.lambda$checkLastDialogMessage$226(this.f17451c);
                return;
            default:
                this.f17450b.lambda$checkLastDialogMessage$224(this.f17451c);
                return;
        }
    }
}
