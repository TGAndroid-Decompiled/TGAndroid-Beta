package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f17449a;
    public final MessagesController f17450b;
    public final TLObject f17451c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.ActionBar.g6 e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f17449a = i10;
        this.f17450b = messagesController;
        this.f17451c = tLObject;
        this.d = h6Var;
        this.e = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f17449a) {
            case 0:
                this.f17450b.lambda$didReceivedNotification$46(this.f17451c, this.d, this.e);
                return;
            default:
                this.f17450b.lambda$didReceivedNotification$48(this.f17451c, this.d, this.e);
                return;
        }
    }
}
