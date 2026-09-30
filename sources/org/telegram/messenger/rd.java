package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f17468a;
    public final MessagesController f17469b;
    public final TLRPC.Dialog f17470c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f17468a = i10;
        this.f17469b = messagesController;
        this.f17470c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f17468a) {
            case 0:
                this.f17469b.lambda$checkLastDialogMessage$225(this.f17470c);
                return;
            case 1:
                this.f17469b.lambda$checkLastDialogMessage$226(this.f17470c);
                return;
            default:
                this.f17469b.lambda$checkLastDialogMessage$224(this.f17470c);
                return;
        }
    }
}
