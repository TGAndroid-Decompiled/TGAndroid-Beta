package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ed implements Runnable {
    public final int f18265a;
    public final MessagesController f18266b;
    public final TLObject f18267c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public ed(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f18265a = i10;
        this.f18266b = messagesController;
        this.f18267c = tLObject;
        this.d = g6Var;
        this.e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f18265a) {
            case 0:
                this.f18266b.lambda$didReceivedNotification$47(this.f18267c, this.d, this.e);
                return;
            default:
                this.f18266b.lambda$didReceivedNotification$45(this.f18267c, this.d, this.e);
                return;
        }
    }
}
