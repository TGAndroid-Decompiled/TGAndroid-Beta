package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ud implements Runnable {
    public final int f21731a;
    public final MessagesController f21732b;
    public final TLRPC.Dialog f21733c;

    public ud(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f21731a = i10;
        this.f21732b = messagesController;
        this.f21733c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f21731a) {
            case 0:
                this.f21732b.lambda$checkLastDialogMessage$225(this.f21733c);
                return;
            case 1:
                this.f21732b.lambda$checkLastDialogMessage$226(this.f21733c);
                return;
            default:
                this.f21732b.lambda$checkLastDialogMessage$224(this.f21733c);
                return;
        }
    }
}
