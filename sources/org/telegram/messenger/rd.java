package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rd implements Runnable {
    public final int f19085a;
    public final MessagesController f19086b;
    public final TLRPC.Dialog f19087c;

    public rd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19085a = i10;
        this.f19086b = messagesController;
        this.f19087c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19085a) {
            case 0:
                this.f19086b.lambda$checkLastDialogMessage$225(this.f19087c);
                return;
            case 1:
                this.f19086b.lambda$checkLastDialogMessage$226(this.f19087c);
                return;
            default:
                this.f19086b.lambda$checkLastDialogMessage$224(this.f19087c);
                return;
        }
    }
}
