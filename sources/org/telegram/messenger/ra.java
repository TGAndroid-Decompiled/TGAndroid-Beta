package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f19073a;
    public final MessagesController f19074b;
    public final TLObject f19075c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.ActionBar.f6 f19076e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f19073a = i10;
        this.f19074b = messagesController;
        this.f19075c = tLObject;
        this.d = h6Var;
        this.f19076e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f19073a) {
            case 0:
                this.f19074b.lambda$didReceivedNotification$46(this.f19075c, this.d, this.f19076e);
                return;
            default:
                this.f19074b.lambda$didReceivedNotification$48(this.f19075c, this.d, this.f19076e);
                return;
        }
    }
}
