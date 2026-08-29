package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ta implements Runnable {
    public final int f21633a;
    public final MessagesController f21634b;
    public final TLObject f21635c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.ActionBar.e6 f21636e;

    public ta(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f21633a = i10;
        this.f21634b = messagesController;
        this.f21635c = tLObject;
        this.d = f6Var;
        this.f21636e = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f21633a) {
            case 0:
                this.f21634b.lambda$didReceivedNotification$46(this.f21635c, this.d, this.f21636e);
                return;
            default:
                this.f21634b.lambda$didReceivedNotification$48(this.f21635c, this.d, this.f21636e);
                return;
        }
    }
}
