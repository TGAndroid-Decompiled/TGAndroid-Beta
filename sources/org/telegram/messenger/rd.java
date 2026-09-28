package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f17467a;
    public final MessagesController f17468b;
    public final TLRPC.Dialog f17469c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17467a = i10;
        this.f17468b = messagesController;
        this.f17469c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17467a) {
            case 0:
                this.f17468b.lambda$checkLastDialogMessage$225(this.f17469c);
                return;
            case 1:
                this.f17468b.lambda$checkLastDialogMessage$226(this.f17469c);
                return;
            default:
                this.f17468b.lambda$checkLastDialogMessage$224(this.f17469c);
                return;
        }
    }
}
