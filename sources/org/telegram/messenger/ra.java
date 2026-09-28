package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f17459a;
    public final MessagesController f17460b;
    public final TLObject f17461c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f17459a = i10;
        this.f17460b = messagesController;
        this.f17461c = tLObject;
        this.d = g6Var;
        this.e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f17459a) {
            case 0:
                this.f17460b.lambda$didReceivedNotification$46(this.f17461c, this.d, this.e);
                return;
            default:
                this.f17460b.lambda$didReceivedNotification$48(this.f17461c, this.d, this.e);
                return;
        }
    }
}
