package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f19076a;
    public final MessagesController f19077b;
    public final TLRPC.Dialog f19078c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19076a = i10;
        this.f19077b = messagesController;
        this.f19078c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19076a) {
            case 0:
                this.f19077b.lambda$checkLastDialogMessage$225(this.f19078c);
                return;
            case 1:
                this.f19077b.lambda$checkLastDialogMessage$226(this.f19078c);
                return;
            default:
                this.f19077b.lambda$checkLastDialogMessage$224(this.f19078c);
                return;
        }
    }
}
