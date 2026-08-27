package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class rd implements Runnable {

    public final int f21433a;

    public final MessagesController f21434b;

    public final TLRPC.Dialog f21435c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f21433a = i10;
        this.f21434b = messagesController;
        this.f21435c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f21433a) {
            case 0:
                this.f21434b.lambda$checkLastDialogMessage$225(this.f21435c);
                break;
            case 1:
                this.f21434b.lambda$checkLastDialogMessage$226(this.f21435c);
                break;
            default:
                this.f21434b.lambda$checkLastDialogMessage$224(this.f21435c);
                break;
        }
    }
}
