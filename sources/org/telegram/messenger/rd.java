package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f19080a;
    public final MessagesController f19081b;
    public final TLRPC.Dialog f19082c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19080a = i10;
        this.f19081b = messagesController;
        this.f19082c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19080a) {
            case 0:
                this.f19081b.lambda$checkLastDialogMessage$225(this.f19082c);
                return;
            case 1:
                this.f19081b.lambda$checkLastDialogMessage$226(this.f19082c);
                return;
            default:
                this.f19081b.lambda$checkLastDialogMessage$224(this.f19082c);
                return;
        }
    }
}
