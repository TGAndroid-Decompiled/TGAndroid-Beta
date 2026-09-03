package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ua implements Runnable {
    public final int f20184a;
    public final MessagesController f20185b;
    public final TLObject f20186c;
    public final org.telegram.ui.ActionBar.j6 d;
    public final org.telegram.ui.ActionBar.i6 f20187e;

    public ua(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.f20184a = i10;
        this.f20185b = messagesController;
        this.f20186c = tLObject;
        this.d = j6Var;
        this.f20187e = i6Var;
    }

    @Override
    public final void run() {
        switch (this.f20184a) {
            case 0:
                this.f20185b.lambda$didReceivedNotification$46(this.f20186c, this.d, this.f20187e);
                return;
            default:
                this.f20185b.lambda$didReceivedNotification$48(this.f20186c, this.d, this.f20187e);
                return;
        }
    }
}
