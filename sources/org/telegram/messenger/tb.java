package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tb implements Runnable {
    public final int f19240a;
    public final MessagesController f19241b;
    public final TLRPC.Dialog f19242c;

    public tb(MessagesController messagesController, TLRPC.Dialog dialog, int i10) {
        this.f19240a = i10;
        this.f19241b = messagesController;
        this.f19242c = dialog;
    }

    @Override
    public final void run() {
        switch (this.f19240a) {
            case 0:
                this.f19241b.lambda$checkLastDialogMessage$224(this.f19242c);
                return;
            case 1:
                this.f19241b.lambda$checkLastDialogMessage$225(this.f19242c);
                return;
            default:
                this.f19241b.lambda$checkLastDialogMessage$223(this.f19242c);
                return;
        }
    }
}
