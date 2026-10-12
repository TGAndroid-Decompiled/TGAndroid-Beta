package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wb implements Runnable {
    public final int f18920a;
    public final MessagesController f18921b;
    public final TLRPC.Dialog f18922c;

    public wb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f18920a = i10;
        this.f18921b = messagesController;
        this.f18922c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f18920a) {
            case 0:
                this.f18921b.lambda$checkLastDialogMessage$224(this.f18922c);
                return;
            case 1:
                this.f18921b.lambda$checkLastDialogMessage$225(this.f18922c);
                return;
            default:
                this.f18921b.lambda$checkLastDialogMessage$223(this.f18922c);
                return;
        }
    }
}
