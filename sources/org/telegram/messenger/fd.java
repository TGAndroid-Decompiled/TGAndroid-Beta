package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class fd implements Runnable {
    public final int f17839a;
    public final MessagesController f17840b;
    public final TLObject f17841c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 f17842e;

    public fd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f17839a = i10;
        this.f17840b = messagesController;
        this.f17841c = tLObject;
        this.d = g6Var;
        this.f17842e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f17839a) {
            case 0:
                this.f17840b.lambda$didReceivedNotification$47(this.f17841c, this.d, this.f17842e);
                return;
            default:
                this.f17840b.lambda$didReceivedNotification$45(this.f17841c, this.d, this.f17842e);
                return;
        }
    }
}
