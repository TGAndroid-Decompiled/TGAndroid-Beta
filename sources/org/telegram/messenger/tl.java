package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tl implements Runnable {
    public final int f21370a;
    public final UnconfirmedAuthController.UnconfirmedAuth f21371b;
    public final TLObject f21372c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public tl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21370a = 1;
        this.f21371b = unconfirmedAuth;
        this.f21372c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21370a) {
            case 0:
                this.f21371b.lambda$confirm$1(this.d, this.f21372c, this.e);
                return;
            case 1:
                this.f21371b.lambda$deny$3(this.f21372c, this.d, this.e);
                return;
            default:
                this.f21371b.lambda$deny$5(this.d, this.f21372c, this.e);
                return;
        }
    }

    public tl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f21370a = i10;
        this.f21371b = unconfirmedAuth;
        this.d = callback;
        this.f21372c = tLObject;
        this.e = tL_error;
    }
}
