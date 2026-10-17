package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class dd implements Runnable {
    public final int f18180a;
    public final MessagesController f18181b;
    public final TLObject f18182c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public dd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f18180a = i10;
        this.f18181b = messagesController;
        this.f18182c = tLObject;
        this.d = g6Var;
        this.e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f18180a) {
            case 0:
                this.f18181b.lambda$didReceivedNotification$47(this.f18182c, this.d, this.e);
                return;
            default:
                this.f18181b.lambda$didReceivedNotification$45(this.f18182c, this.d, this.e);
                return;
        }
    }
}
