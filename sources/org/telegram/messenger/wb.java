package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wb implements Runnable {
    public final int f18620a;
    public final MessagesController f18621b;
    public final TLRPC.Dialog f18622c;

    public wb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f18620a = i10;
        this.f18621b = messagesController;
        this.f18622c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f18620a) {
            case 0:
                this.f18621b.lambda$checkLastDialogMessage$224(this.f18622c);
                return;
            case 1:
                this.f18621b.lambda$checkLastDialogMessage$225(this.f18622c);
                return;
            default:
                this.f18621b.lambda$checkLastDialogMessage$223(this.f18622c);
                return;
        }
    }
}
