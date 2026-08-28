package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nd implements Runnable {
    public final int f21052a;
    public final MessagesController f21053b;
    public final TLRPC.Dialog f21054c;

    public nd(MessagesController messagesController, TLRPC.Dialog dialog, int i9) {
        this.f21052a = i9;
        this.f21053b = messagesController;
        this.f21054c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f21052a) {
            case 0:
                this.f21053b.lambda$checkLastDialogMessage$225(this.f21054c);
                return;
            case 1:
                this.f21053b.lambda$checkLastDialogMessage$226(this.f21054c);
                return;
            default:
                this.f21053b.lambda$checkLastDialogMessage$224(this.f21054c);
                return;
        }
    }
}
