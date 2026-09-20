package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f17440a;
    public final MessagesController f17441b;
    public final TLObject f17442c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.ActionBar.h6 e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f17440a = i10;
        this.f17441b = messagesController;
        this.f17442c = tLObject;
        this.d = i6Var;
        this.e = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f17440a) {
            case 0:
                this.f17441b.lambda$didReceivedNotification$46(this.f17442c, this.d, this.e);
                return;
            default:
                this.f17441b.lambda$didReceivedNotification$48(this.f17442c, this.d, this.e);
                return;
        }
    }
}
