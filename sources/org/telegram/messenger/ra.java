package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f19068a;
    public final MessagesController f19069b;
    public final TLObject f19070c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.ActionBar.f6 f19071e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f19068a = i10;
        this.f19069b = messagesController;
        this.f19070c = tLObject;
        this.d = h6Var;
        this.f19071e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f19068a) {
            case 0:
                this.f19069b.lambda$didReceivedNotification$46(this.f19070c, this.d, this.f19071e);
                return;
            default:
                this.f19069b.lambda$didReceivedNotification$48(this.f19070c, this.d, this.f19071e);
                return;
        }
    }
}
