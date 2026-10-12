package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class id implements Runnable {
    public final int f17873a;
    public final MessagesController f17874b;
    public final TLObject f17875c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.e6 f17876e;

    public id(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f17873a = i10;
        this.f17874b = messagesController;
        this.f17875c = tLObject;
        this.d = g6Var;
        this.f17876e = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f17873a) {
            case 0:
                this.f17874b.lambda$didReceivedNotification$47(this.f17875c, this.d, this.f17876e);
                return;
            default:
                this.f17874b.lambda$didReceivedNotification$45(this.f17875c, this.d, this.f17876e);
                return;
        }
    }
}
