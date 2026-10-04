package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f19064a;
    public final MessagesController f19065b;
    public final TLObject f19066c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.ActionBar.f6 f19067e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f19064a = i10;
        this.f19065b = messagesController;
        this.f19066c = tLObject;
        this.d = h6Var;
        this.f19067e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f19064a) {
            case 0:
                this.f19065b.lambda$didReceivedNotification$46(this.f19066c, this.d, this.f19067e);
                return;
            default:
                this.f19065b.lambda$didReceivedNotification$48(this.f19066c, this.d, this.f19067e);
                return;
        }
    }
}
