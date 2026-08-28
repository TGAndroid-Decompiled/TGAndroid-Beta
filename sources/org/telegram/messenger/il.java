package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class il implements Runnable {
    public final int f20628a;
    public final UnconfirmedAuthController.UnconfirmedAuth f20629b;
    public final TLObject f20630c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f20631e;

    public il(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f20628a = 1;
        this.f20629b = unconfirmedAuth;
        this.f20630c = tLObject;
        this.d = callback;
        this.f20631e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f20628a) {
            case 0:
                this.f20629b.lambda$confirm$1(this.d, this.f20630c, this.f20631e);
                return;
            case 1:
                this.f20629b.lambda$deny$3(this.f20630c, this.d, this.f20631e);
                return;
            default:
                this.f20629b.lambda$deny$5(this.d, this.f20630c, this.f20631e);
                return;
        }
    }

    public il(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i9) {
        this.f20628a = i9;
        this.f20629b = unconfirmedAuth;
        this.d = callback;
        this.f20630c = tLObject;
        this.f20631e = tL_error;
    }
}
