package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f17243a;
    public final UnconfirmedAuthController.UnconfirmedAuth f17244b;
    public final TLObject f17245c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17243a = 1;
        this.f17244b = unconfirmedAuth;
        this.f17245c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17243a) {
            case 0:
                this.f17244b.lambda$confirm$1(this.d, this.f17245c, this.e);
                return;
            case 1:
                this.f17244b.lambda$deny$3(this.f17245c, this.d, this.e);
                return;
            default:
                this.f17244b.lambda$deny$5(this.d, this.f17245c, this.e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f17243a = i10;
        this.f17244b = unconfirmedAuth;
        this.d = callback;
        this.f17245c = tLObject;
        this.e = tL_error;
    }
}
