package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tb implements Runnable {
    public final int f19238a;
    public final MessagesController f19239b;
    public final TLRPC.Dialog f19240c;

    public tb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19238a = i10;
        this.f19239b = messagesController;
        this.f19240c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19238a) {
            case 0:
                this.f19239b.lambda$checkLastDialogMessage$224(this.f19240c);
                return;
            case 1:
                this.f19239b.lambda$checkLastDialogMessage$225(this.f19240c);
                return;
            default:
                this.f19239b.lambda$checkLastDialogMessage$223(this.f19240c);
                return;
        }
    }
}
