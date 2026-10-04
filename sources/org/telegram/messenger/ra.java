package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f19063a;
    public final MessagesController f19064b;
    public final TLObject f19065c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.ActionBar.f6 f19066e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f19063a = i10;
        this.f19064b = messagesController;
        this.f19065c = tLObject;
        this.d = h6Var;
        this.f19066e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f19063a) {
            case 0:
                this.f19064b.lambda$didReceivedNotification$46(this.f19065c, this.d, this.f19066e);
                return;
            default:
                this.f19064b.lambda$didReceivedNotification$48(this.f19065c, this.d, this.f19066e);
                return;
        }
    }
}
