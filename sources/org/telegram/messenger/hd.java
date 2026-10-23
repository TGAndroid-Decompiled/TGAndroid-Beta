package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class hd implements Runnable {
    public final int f18605a;
    public final MessagesController f18606b;
    public final TLObject f18607c;
    public final org.telegram.ui.ActionBar.j6 d;
    public final org.telegram.ui.ActionBar.i6 e;

    public hd(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.f18605a = i10;
        this.f18606b = messagesController;
        this.f18607c = tLObject;
        this.d = j6Var;
        this.e = i6Var;
    }

    @Override
    public final void run() {
        switch (this.f18605a) {
            case 0:
                this.f18606b.lambda$didReceivedNotification$47(this.f18607c, this.d, this.e);
                return;
            default:
                this.f18606b.lambda$didReceivedNotification$45(this.f18607c, this.d, this.e);
                return;
        }
    }
}
