package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f17218a;
    public final MessagesController f17219b;
    public final TLObject f17220c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.ActionBar.g6 e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f17218a = i10;
        this.f17219b = messagesController;
        this.f17220c = tLObject;
        this.d = h6Var;
        this.e = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f17218a) {
            case 0:
                this.f17219b.lambda$didReceivedNotification$46(this.f17220c, this.d, this.e);
                return;
            default:
                this.f17219b.lambda$didReceivedNotification$48(this.f17220c, this.d, this.e);
                return;
        }
    }
}
