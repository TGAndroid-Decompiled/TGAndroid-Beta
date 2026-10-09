package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class fd implements Runnable {
    public final int f17836a;
    public final MessagesController f17837b;
    public final TLObject f17838c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.ActionBar.g6 f17839e;

    public fd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f17836a = i10;
        this.f17837b = messagesController;
        this.f17838c = tLObject;
        this.d = h6Var;
        this.f17839e = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f17836a) {
            case 0:
                this.f17837b.lambda$didReceivedNotification$47(this.f17838c, this.d, this.f17839e);
                return;
            default:
                this.f17837b.lambda$didReceivedNotification$45(this.f17838c, this.d, this.f17839e);
                return;
        }
    }
}
