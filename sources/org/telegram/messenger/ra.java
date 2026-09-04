package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f18873a;
    public final MessagesController f18874b;
    public final TLObject f18875c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.ActionBar.h6 f18876e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f18873a = i10;
        this.f18874b = messagesController;
        this.f18875c = tLObject;
        this.d = i6Var;
        this.f18876e = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f18873a) {
            case 0:
                this.f18874b.lambda$didReceivedNotification$46(this.f18875c, this.d, this.f18876e);
                return;
            default:
                this.f18874b.lambda$didReceivedNotification$48(this.f18875c, this.d, this.f18876e);
                return;
        }
    }
}
