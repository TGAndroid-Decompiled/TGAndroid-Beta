package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
public final class id implements Runnable {
    public final int f18678a;
    public final MessagesController f18679b;
    public final TLObject f18680c;
    public final org.telegram.ui.ActionBar.j6 d;
    public final org.telegram.ui.ActionBar.i6 e;

    public id(MessagesController messagesController, TLObject tLObject, org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        this.f18678a = i10;
        this.f18679b = messagesController;
        this.f18680c = tLObject;
        this.d = j6Var;
        this.e = i6Var;
    }

    @Override
    public final void run() {
        switch (this.f18678a) {
            case 0:
                this.f18679b.lambda$didReceivedNotification$47(this.f18680c, this.d, this.e);
                return;
            default:
                this.f18679b.lambda$didReceivedNotification$45(this.f18680c, this.d, this.e);
                return;
        }
    }
}
