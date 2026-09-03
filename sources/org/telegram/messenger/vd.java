package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vd implements Runnable {
    public final int f18646a;
    public final MessagesController f18647b;
    public final TLRPC.Dialog f18648c;

    public vd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f18646a = i10;
        this.f18647b = messagesController;
        this.f18648c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f18646a) {
            case 0:
                this.f18647b.lambda$checkLastDialogMessage$225(this.f18648c);
                return;
            case 1:
                this.f18647b.lambda$checkLastDialogMessage$226(this.f18648c);
                return;
            default:
                this.f18647b.lambda$checkLastDialogMessage$224(this.f18648c);
                return;
        }
    }
}
