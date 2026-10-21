package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tb implements Runnable {
    public final int f19590a;
    public final MessagesController f19591b;
    public final TLRPC.Dialog f19592c;

    public tb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19590a = i10;
        this.f19591b = messagesController;
        this.f19592c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19590a) {
            case 0:
                this.f19591b.lambda$checkLastDialogMessage$224(this.f19592c);
                return;
            case 1:
                this.f19591b.lambda$checkLastDialogMessage$225(this.f19592c);
                return;
            default:
                this.f19591b.lambda$checkLastDialogMessage$223(this.f19592c);
                return;
        }
    }
}
