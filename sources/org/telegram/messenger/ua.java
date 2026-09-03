package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ua implements Runnable {
    public final int f18558a;
    public final MessagesController f18559b;
    public final TLObject f18560c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.ActionBar.h6 e;

    public ua(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f18558a = i10;
        this.f18559b = messagesController;
        this.f18560c = tLObject;
        this.d = i6Var;
        this.e = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f18558a) {
            case 0:
                this.f18559b.lambda$didReceivedNotification$46(this.f18560c, this.d, this.e);
                return;
            default:
                this.f18559b.lambda$didReceivedNotification$48(this.f18560c, this.d, this.e);
                return;
        }
    }
}
