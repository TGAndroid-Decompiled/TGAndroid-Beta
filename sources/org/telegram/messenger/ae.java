package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ae implements Runnable {
    public final int f14711a;
    public final MessagesController f14712b;
    public final TLRPC.Dialog f14713c;

    public ae(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f14711a = i10;
        this.f14712b = messagesController;
        this.f14713c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f14711a) {
            case 0:
                this.f14712b.lambda$checkLastDialogMessage$225(this.f14713c);
                return;
            case 1:
                this.f14712b.lambda$checkLastDialogMessage$226(this.f14713c);
                return;
            default:
                this.f14712b.lambda$checkLastDialogMessage$224(this.f14713c);
                return;
        }
    }
}
