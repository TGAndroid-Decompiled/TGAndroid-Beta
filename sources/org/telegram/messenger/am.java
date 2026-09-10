package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class am implements Runnable {
    public final int f14738a;
    public final UnconfirmedAuthController.UnconfirmedAuth f14739b;
    public final TLObject f14740c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public am(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f14738a = 1;
        this.f14739b = unconfirmedAuth;
        this.f14740c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f14738a) {
            case 0:
                this.f14739b.lambda$confirm$1(this.d, this.f14740c, this.e);
                return;
            case 1:
                this.f14739b.lambda$deny$3(this.f14740c, this.d, this.e);
                return;
            default:
                this.f14739b.lambda$deny$5(this.d, this.f14740c, this.e);
                return;
        }
    }

    public am(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f14738a = i10;
        this.f14739b = unconfirmedAuth;
        this.d = callback;
        this.f14740c = tLObject;
        this.e = tL_error;
    }
}
