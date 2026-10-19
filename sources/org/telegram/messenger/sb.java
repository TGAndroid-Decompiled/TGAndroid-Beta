package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sb implements Runnable {
    public final int f19499a;
    public final MessagesController f19500b;
    public final TLRPC.Dialog f19501c;

    public sb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19499a = i10;
        this.f19500b = messagesController;
        this.f19501c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19499a) {
            case 0:
                this.f19500b.lambda$checkLastDialogMessage$224(this.f19501c);
                return;
            case 1:
                this.f19500b.lambda$checkLastDialogMessage$225(this.f19501c);
                return;
            default:
                this.f19500b.lambda$checkLastDialogMessage$223(this.f19501c);
                return;
        }
    }
}
