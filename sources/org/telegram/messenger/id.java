package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class id implements Runnable {
    public final int f17490a;
    public final MessagesController f17491b;
    public final TLObject f17492c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.ActionBar.e6 e;

    public id(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f17490a = i10;
        this.f17491b = messagesController;
        this.f17492c = tLObject;
        this.d = f6Var;
        this.e = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f17490a) {
            case 0:
                this.f17491b.lambda$didReceivedNotification$47(this.f17492c, this.d, this.e);
                return;
            default:
                this.f17491b.lambda$didReceivedNotification$45(this.f17492c, this.d, this.e);
                return;
        }
    }
}
