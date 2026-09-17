package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f18928a;
    public final MessagesController f18929b;
    public final TLRPC.Dialog f18930c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f18928a = i10;
        this.f18929b = messagesController;
        this.f18930c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f18928a) {
            case 0:
                this.f18929b.lambda$checkLastDialogMessage$225(this.f18930c);
                return;
            case 1:
                this.f18929b.lambda$checkLastDialogMessage$226(this.f18930c);
                return;
            default:
                this.f18929b.lambda$checkLastDialogMessage$224(this.f18930c);
                return;
        }
    }
}
