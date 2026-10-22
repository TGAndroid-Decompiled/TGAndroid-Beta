package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wb implements Runnable {
    public final int f19986a;
    public final MessagesController f19987b;
    public final TLRPC.Dialog f19988c;

    public wb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19986a = i10;
        this.f19987b = messagesController;
        this.f19988c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19986a) {
            case 0:
                this.f19987b.lambda$checkLastDialogMessage$224(this.f19988c);
                return;
            case 1:
                this.f19987b.lambda$checkLastDialogMessage$225(this.f19988c);
                return;
            default:
                this.f19987b.lambda$checkLastDialogMessage$223(this.f19988c);
                return;
        }
    }
}
