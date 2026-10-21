package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class fd implements Runnable {
    public final int f18357a;
    public final MessagesController f18358b;
    public final TLObject f18359c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public fd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f18357a = i10;
        this.f18358b = messagesController;
        this.f18359c = tLObject;
        this.d = g6Var;
        this.e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f18357a) {
            case 0:
                this.f18358b.lambda$didReceivedNotification$47(this.f18359c, this.d, this.e);
                return;
            default:
                this.f18358b.lambda$didReceivedNotification$45(this.f18359c, this.d, this.e);
                return;
        }
    }
}
