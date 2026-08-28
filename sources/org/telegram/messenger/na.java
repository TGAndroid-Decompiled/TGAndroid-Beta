package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class na implements Runnable {
    public final int f21042a;
    public final MessagesController f21043b;
    public final TLObject f21044c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.ui.ActionBar.d6 f21045e;

    public na(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d6 d6Var, int i9) {
        this.f21042a = i9;
        this.f21043b = messagesController;
        this.f21044c = tLObject;
        this.d = e6Var;
        this.f21045e = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f21042a) {
            case 0:
                this.f21043b.lambda$didReceivedNotification$46(this.f21044c, this.d, this.f21045e);
                return;
            default:
                this.f21043b.lambda$didReceivedNotification$48(this.f21044c, this.d, this.f21045e);
                return;
        }
    }
}
