package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ra implements Runnable {
    public final int f18900a;
    public final MessagesController f18901b;
    public final TLObject f18902c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.ActionBar.h6 f18903e;

    public ra(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f18900a = i10;
        this.f18901b = messagesController;
        this.f18902c = tLObject;
        this.d = i6Var;
        this.f18903e = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f18900a) {
            case 0:
                this.f18901b.lambda$didReceivedNotification$46(this.f18902c, this.d, this.f18903e);
                return;
            default:
                this.f18901b.lambda$didReceivedNotification$48(this.f18902c, this.d, this.f18903e);
                return;
        }
    }
}
