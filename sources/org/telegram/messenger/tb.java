package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tb implements Runnable {
    public final int f19234a;
    public final MessagesController f19235b;
    public final TLRPC.Dialog f19236c;

    public tb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19234a = i10;
        this.f19235b = messagesController;
        this.f19236c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19234a) {
            case 0:
                this.f19235b.lambda$checkLastDialogMessage$224(this.f19236c);
                return;
            case 1:
                this.f19235b.lambda$checkLastDialogMessage$225(this.f19236c);
                return;
            default:
                this.f19235b.lambda$checkLastDialogMessage$223(this.f19236c);
                return;
        }
    }
}
