package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sd implements Runnable {
    public final int f19007a;
    public final MessagesController f19008b;
    public final TLRPC.Dialog f19009c;

    public sd(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19007a = i10;
        this.f19008b = messagesController;
        this.f19009c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19007a) {
            case 0:
                this.f19008b.lambda$checkLastDialogMessage$225(this.f19009c);
                return;
            case 1:
                this.f19008b.lambda$checkLastDialogMessage$226(this.f19009c);
                return;
            default:
                this.f19008b.lambda$checkLastDialogMessage$224(this.f19009c);
                return;
        }
    }
}
