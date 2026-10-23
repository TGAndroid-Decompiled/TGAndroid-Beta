package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class hd implements Runnable {
    public final int f18539a;
    public final MessagesController f18540b;
    public final TLObject f18541c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public hd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f18539a = i10;
        this.f18540b = messagesController;
        this.f18541c = tLObject;
        this.d = g6Var;
        this.e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f18539a) {
            case 0:
                this.f18540b.lambda$didReceivedNotification$47(this.f18541c, this.d, this.e);
                return;
            default:
                this.f18540b.lambda$didReceivedNotification$45(this.f18541c, this.d, this.e);
                return;
        }
    }
}
