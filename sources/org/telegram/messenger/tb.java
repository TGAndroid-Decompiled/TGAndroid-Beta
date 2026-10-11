package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tb implements Runnable {
    public final int f19276a;
    public final MessagesController f19277b;
    public final TLRPC.Dialog f19278c;

    public tb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19276a = i10;
        this.f19277b = messagesController;
        this.f19278c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19276a) {
            case 0:
                this.f19277b.lambda$checkLastDialogMessage$224(this.f19278c);
                return;
            case 1:
                this.f19277b.lambda$checkLastDialogMessage$225(this.f19278c);
                return;
            default:
                this.f19277b.lambda$checkLastDialogMessage$223(this.f19278c);
                return;
        }
    }
}
