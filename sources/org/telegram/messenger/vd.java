package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vd implements Runnable {
    public final int f18664a;
    public final MessagesController f18665b;
    public final TLRPC.Dialog f18666c;

    public vd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f18664a = i10;
        this.f18665b = messagesController;
        this.f18666c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f18664a) {
            case 0:
                this.f18665b.lambda$checkLastDialogMessage$225(this.f18666c);
                return;
            case 1:
                this.f18665b.lambda$checkLastDialogMessage$226(this.f18666c);
                return;
            default:
                this.f18665b.lambda$checkLastDialogMessage$224(this.f18666c);
                return;
        }
    }
}
