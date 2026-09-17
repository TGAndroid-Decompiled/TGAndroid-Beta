package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qa implements Runnable {
    public final int f18798a;
    public final MessagesController f18799b;
    public final TLObject f18800c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.ActionBar.h6 f18801e;

    public qa(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f18798a = i10;
        this.f18799b = messagesController;
        this.f18800c = tLObject;
        this.d = i6Var;
        this.f18801e = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f18798a) {
            case 0:
                this.f18799b.lambda$didReceivedNotification$46(this.f18800c, this.d, this.f18801e);
                return;
            default:
                this.f18799b.lambda$didReceivedNotification$48(this.f18800c, this.d, this.f18801e);
                return;
        }
    }
}
