package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class dd implements Runnable {
    public final int f18190a;
    public final MessagesController f18191b;
    public final TLObject f18192c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public dd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f18190a = i10;
        this.f18191b = messagesController;
        this.f18192c = tLObject;
        this.d = g6Var;
        this.e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f18190a) {
            case 0:
                this.f18191b.lambda$didReceivedNotification$47(this.f18192c, this.d, this.e);
                return;
            default:
                this.f18191b.lambda$didReceivedNotification$45(this.f18192c, this.d, this.e);
                return;
        }
    }
}
