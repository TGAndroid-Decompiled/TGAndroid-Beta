package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ed implements Runnable {
    public final int f18268a;
    public final MessagesController f18269b;
    public final TLObject f18270c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public ed(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f18268a = i10;
        this.f18269b = messagesController;
        this.f18270c = tLObject;
        this.d = g6Var;
        this.e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f18268a) {
            case 0:
                this.f18269b.lambda$didReceivedNotification$47(this.f18270c, this.d, this.e);
                return;
            default:
                this.f18269b.lambda$didReceivedNotification$45(this.f18270c, this.d, this.e);
                return;
        }
    }
}
