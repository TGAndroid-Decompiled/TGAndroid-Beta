package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class fd implements Runnable {
    public final int f17840a;
    public final MessagesController f17841b;
    public final TLObject f17842c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.ActionBar.g6 f17843e;

    public fd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f17840a = i10;
        this.f17841b = messagesController;
        this.f17842c = tLObject;
        this.d = h6Var;
        this.f17843e = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f17840a) {
            case 0:
                this.f17841b.lambda$didReceivedNotification$47(this.f17842c, this.d, this.f17843e);
                return;
            default:
                this.f17841b.lambda$didReceivedNotification$45(this.f17842c, this.d, this.f17843e);
                return;
        }
    }
}
