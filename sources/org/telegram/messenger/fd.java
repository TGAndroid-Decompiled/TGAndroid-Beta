package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class fd implements Runnable {
    public final int f17875a;
    public final MessagesController f17876b;
    public final TLObject f17877c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 f17878e;

    public fd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f17875a = i10;
        this.f17876b = messagesController;
        this.f17877c = tLObject;
        this.d = g6Var;
        this.f17878e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f17875a) {
            case 0:
                this.f17876b.lambda$didReceivedNotification$47(this.f17877c, this.d, this.f17878e);
                return;
            default:
                this.f17876b.lambda$didReceivedNotification$45(this.f17877c, this.d, this.f17878e);
                return;
        }
    }
}
