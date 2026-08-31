package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class ua implements Runnable {
    public final int f20182a;
    public final MessagesController f20183b;
    public final TLObject f20184c;
    public final org.telegram.ui.ActionBar.j6 d;
    public final org.telegram.ui.ActionBar.i6 f20185e;

    public ua(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.f20182a = i10;
        this.f20183b = messagesController;
        this.f20184c = tLObject;
        this.d = j6Var;
        this.f20185e = i6Var;
    }

    @Override
    public final void run() {
        switch (this.f20182a) {
            case 0:
                this.f20183b.lambda$didReceivedNotification$46(this.f20184c, this.d, this.f20185e);
                return;
            default:
                this.f20183b.lambda$didReceivedNotification$48(this.f20184c, this.d, this.f20185e);
                return;
        }
    }
}
