package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f17458a;
    public final MessagesController f17459b;
    public final TLRPC.Dialog f17460c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17458a = i10;
        this.f17459b = messagesController;
        this.f17460c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17458a) {
            case 0:
                this.f17459b.lambda$checkLastDialogMessage$225(this.f17460c);
                return;
            case 1:
                this.f17459b.lambda$checkLastDialogMessage$226(this.f17460c);
                return;
            default:
                this.f17459b.lambda$checkLastDialogMessage$224(this.f17460c);
                return;
        }
    }
}
