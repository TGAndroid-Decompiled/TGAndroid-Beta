package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f18901a;
    public final MessagesController f18902b;
    public final TLRPC.Dialog f18903c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f18901a = i10;
        this.f18902b = messagesController;
        this.f18903c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f18901a) {
            case 0:
                this.f18902b.lambda$checkLastDialogMessage$225(this.f18903c);
                return;
            case 1:
                this.f18902b.lambda$checkLastDialogMessage$226(this.f18903c);
                return;
            default:
                this.f18902b.lambda$checkLastDialogMessage$224(this.f18903c);
                return;
        }
    }
}
