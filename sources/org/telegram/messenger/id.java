package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class id implements Runnable {
    public final int f17872a;
    public final MessagesController f17873b;
    public final TLObject f17874c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.e6 f17875e;

    public id(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f17872a = i10;
        this.f17873b = messagesController;
        this.f17874c = tLObject;
        this.d = g6Var;
        this.f17875e = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f17872a) {
            case 0:
                this.f17873b.lambda$didReceivedNotification$47(this.f17874c, this.d, this.f17875e);
                return;
            default:
                this.f17873b.lambda$didReceivedNotification$45(this.f17874c, this.d, this.f17875e);
                return;
        }
    }
}
