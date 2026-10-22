package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class id implements Runnable {
    public final int f18611a;
    public final MessagesController f18612b;
    public final TLObject f18613c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.ui.ActionBar.f6 e;

    public id(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f18611a = i10;
        this.f18612b = messagesController;
        this.f18613c = tLObject;
        this.d = g6Var;
        this.e = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f18611a) {
            case 0:
                this.f18612b.lambda$didReceivedNotification$47(this.f18613c, this.d, this.e);
                return;
            default:
                this.f18612b.lambda$didReceivedNotification$45(this.f18613c, this.d, this.e);
                return;
        }
    }
}
