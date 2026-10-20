package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tb implements Runnable {
    public final int f19591a;
    public final MessagesController f19592b;
    public final TLRPC.Dialog f19593c;

    public tb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19591a = i10;
        this.f19592b = messagesController;
        this.f19593c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19591a) {
            case 0:
                this.f19592b.lambda$checkLastDialogMessage$224(this.f19593c);
                return;
            case 1:
                this.f19592b.lambda$checkLastDialogMessage$225(this.f19593c);
                return;
            default:
                this.f19592b.lambda$checkLastDialogMessage$223(this.f19593c);
                return;
        }
    }
}
