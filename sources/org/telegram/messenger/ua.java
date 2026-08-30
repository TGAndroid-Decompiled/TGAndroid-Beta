package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ua implements Runnable {
    public final int f18576a;
    public final MessagesController f18577b;
    public final TLObject f18578c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.ActionBar.h6 e;

    public ua(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f18576a = i10;
        this.f18577b = messagesController;
        this.f18578c = tLObject;
        this.d = i6Var;
        this.e = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f18576a) {
            case 0:
                this.f18577b.lambda$didReceivedNotification$46(this.f18578c, this.d, this.e);
                return;
            default:
                this.f18577b.lambda$didReceivedNotification$48(this.f18578c, this.d, this.e);
                return;
        }
    }
}
