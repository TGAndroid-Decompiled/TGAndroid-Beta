package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vd implements Runnable {
    public final int f20283a;
    public final MessagesController f20284b;
    public final TLRPC.Dialog f20285c;

    public vd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f20283a = i10;
        this.f20284b = messagesController;
        this.f20285c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f20283a) {
            case 0:
                this.f20284b.lambda$checkLastDialogMessage$225(this.f20285c);
                return;
            case 1:
                this.f20284b.lambda$checkLastDialogMessage$226(this.f20285c);
                return;
            default:
                this.f20284b.lambda$checkLastDialogMessage$224(this.f20285c);
                return;
        }
    }
}
