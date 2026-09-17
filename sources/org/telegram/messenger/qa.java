package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class qa implements Runnable {
    public final int f18825a;
    public final MessagesController f18826b;
    public final TLObject f18827c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.ui.ActionBar.h6 f18828e;

    public qa(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f18825a = i10;
        this.f18826b = messagesController;
        this.f18827c = tLObject;
        this.d = i6Var;
        this.f18828e = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f18825a) {
            case 0:
                this.f18826b.lambda$didReceivedNotification$46(this.f18827c, this.d, this.f18828e);
                return;
            default:
                this.f18826b.lambda$didReceivedNotification$48(this.f18827c, this.d, this.f18828e);
                return;
        }
    }
}
