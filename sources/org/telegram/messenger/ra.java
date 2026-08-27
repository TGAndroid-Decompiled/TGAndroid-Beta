package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class ra implements Runnable {

    public final int f21423a;

    public final MessagesController f21424b;

    public final TLObject f21425c;
    public final org.telegram.ui.ActionBar.f6 d;

    public final org.telegram.ui.ActionBar.e6 f21426e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f21423a = i10;
        this.f21424b = messagesController;
        this.f21425c = tLObject;
        this.d = f6Var;
        this.f21426e = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f21423a) {
            case 0:
                this.f21424b.lambda$didReceivedNotification$46(this.f21425c, this.d, this.f21426e);
                break;
            default:
                this.f21424b.lambda$didReceivedNotification$48(this.f21425c, this.d, this.f21426e);
                break;
        }
    }
}
