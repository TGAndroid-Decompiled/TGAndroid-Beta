package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rb implements Runnable {
    public final int f19419a;
    public final MessagesController f19420b;
    public final TLRPC.Dialog f19421c;

    public rb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19419a = i10;
        this.f19420b = messagesController;
        this.f19421c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19419a) {
            case 0:
                this.f19420b.lambda$checkLastDialogMessage$224(this.f19421c);
                return;
            case 1:
                this.f19420b.lambda$checkLastDialogMessage$225(this.f19421c);
                return;
            default:
                this.f19420b.lambda$checkLastDialogMessage$223(this.f19421c);
                return;
        }
    }
}
