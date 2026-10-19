package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class dd implements Runnable {
    public final int f18187a;
    public final MessagesController f18188b;
    public final TLObject f18189c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public dd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f18187a = i10;
        this.f18188b = messagesController;
        this.f18189c = tLObject;
        this.d = g6Var;
        this.e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f18187a) {
            case 0:
                this.f18188b.lambda$didReceivedNotification$47(this.f18189c, this.d, this.e);
                return;
            default:
                this.f18188b.lambda$didReceivedNotification$45(this.f18189c, this.d, this.e);
                return;
        }
    }
}
