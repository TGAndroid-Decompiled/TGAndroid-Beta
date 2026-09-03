package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vd implements Runnable {
    public final int f20285a;
    public final MessagesController f20286b;
    public final TLRPC.Dialog f20287c;

    public vd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f20285a = i10;
        this.f20286b = messagesController;
        this.f20287c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f20285a) {
            case 0:
                this.f20286b.lambda$checkLastDialogMessage$225(this.f20287c);
                return;
            case 1:
                this.f20286b.lambda$checkLastDialogMessage$226(this.f20287c);
                return;
            default:
                this.f20286b.lambda$checkLastDialogMessage$224(this.f20287c);
                return;
        }
    }
}
