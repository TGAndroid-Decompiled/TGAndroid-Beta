package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f18958a;
    public final UnconfirmedAuthController.UnconfirmedAuth f18959b;
    public final TLObject f18960c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f18961e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18958a = 1;
        this.f18959b = unconfirmedAuth;
        this.f18960c = tLObject;
        this.d = callback;
        this.f18961e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18958a) {
            case 0:
                this.f18959b.lambda$confirm$1(this.d, this.f18960c, this.f18961e);
                return;
            case 1:
                this.f18959b.lambda$deny$3(this.f18960c, this.d, this.f18961e);
                return;
            default:
                this.f18959b.lambda$deny$5(this.d, this.f18960c, this.f18961e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f18958a = i10;
        this.f18959b = unconfirmedAuth;
        this.d = callback;
        this.f18960c = tLObject;
        this.f18961e = tL_error;
    }
}
