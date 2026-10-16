package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class id implements Runnable {
    public final int f17186a;
    public final MessagesController f17187b;
    public final TLObject f17188c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.ActionBar.e6 e;

    public id(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f17186a = i10;
        this.f17187b = messagesController;
        this.f17188c = tLObject;
        this.d = f6Var;
        this.e = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f17186a) {
            case 0:
                this.f17187b.lambda$didReceivedNotification$47(this.f17188c, this.d, this.e);
                return;
            default:
                this.f17187b.lambda$didReceivedNotification$45(this.f17188c, this.d, this.e);
                return;
        }
    }
}
