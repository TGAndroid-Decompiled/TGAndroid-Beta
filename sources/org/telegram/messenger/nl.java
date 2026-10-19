package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nl implements Runnable {
    public final int f19127a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19128b;
    public final TLObject f19129c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public nl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19127a = 1;
        this.f19128b = unconfirmedAuth;
        this.f19129c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19127a) {
            case 0:
                this.f19128b.lambda$confirm$1(this.d, this.f19129c, this.e);
                return;
            case 1:
                this.f19128b.lambda$deny$3(this.f19129c, this.d, this.e);
                return;
            default:
                this.f19128b.lambda$deny$5(this.d, this.f19129c, this.e);
                return;
        }
    }

    public nl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19127a = i10;
        this.f19128b = unconfirmedAuth;
        this.d = callback;
        this.f19129c = tLObject;
        this.e = tL_error;
    }
}
