package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class hd implements Runnable {
    public final int f20245a;
    public final MessagesController f20246b;
    public final TLObject f20247c;
    public final org.telegram.ui.ActionBar.x6 d;
    public final org.telegram.ui.ActionBar.w6 e;

    public hd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.x6 x6Var, org.telegram.ui.ActionBar.w6 w6Var, int i10) {
        this.f20245a = i10;
        this.f20246b = messagesController;
        this.f20247c = tLObject;
        this.d = x6Var;
        this.e = w6Var;
    }

    @Override
    public final void run() {
        switch (this.f20245a) {
            case 0:
                this.f20246b.lambda$didReceivedNotification$47(this.f20247c, this.d, this.e);
                return;
            default:
                this.f20246b.lambda$didReceivedNotification$45(this.f20247c, this.d, this.e);
                return;
        }
    }
}
