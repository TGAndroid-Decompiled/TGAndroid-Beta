package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements Runnable {
    public final int f17339a;
    public final UnconfirmedAuthController.UnconfirmedAuth f17340b;
    public final TLObject f17341c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17339a = 1;
        this.f17340b = unconfirmedAuth;
        this.f17341c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17339a) {
            case 0:
                this.f17340b.lambda$confirm$1(this.d, this.f17341c, this.e);
                return;
            case 1:
                this.f17340b.lambda$deny$3(this.f17341c, this.d, this.e);
                return;
            default:
                this.f17340b.lambda$deny$5(this.d, this.f17341c, this.e);
                return;
        }
    }

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f17339a = i10;
        this.f17340b = unconfirmedAuth;
        this.d = callback;
        this.f17341c = tLObject;
        this.e = tL_error;
    }
}
