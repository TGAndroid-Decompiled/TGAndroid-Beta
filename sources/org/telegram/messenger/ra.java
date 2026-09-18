package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f17399a;
    public final MessagesController f17400b;
    public final TLObject f17401c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.ActionBar.g6 e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f17399a = i10;
        this.f17400b = messagesController;
        this.f17401c = tLObject;
        this.d = i6Var;
        this.e = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f17399a) {
            case 0:
                this.f17400b.lambda$didReceivedNotification$46(this.f17401c, this.d, this.e);
                return;
            default:
                this.f17400b.lambda$didReceivedNotification$48(this.f17401c, this.d, this.e);
                return;
        }
    }
}
