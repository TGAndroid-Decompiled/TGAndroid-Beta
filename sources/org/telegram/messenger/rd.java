package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f19075a;
    public final MessagesController f19076b;
    public final TLRPC.Dialog f19077c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19075a = i10;
        this.f19076b = messagesController;
        this.f19077c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19075a) {
            case 0:
                this.f19076b.lambda$checkLastDialogMessage$225(this.f19077c);
                return;
            case 1:
                this.f19076b.lambda$checkLastDialogMessage$226(this.f19077c);
                return;
            default:
                this.f19076b.lambda$checkLastDialogMessage$224(this.f19077c);
                return;
        }
    }
}
