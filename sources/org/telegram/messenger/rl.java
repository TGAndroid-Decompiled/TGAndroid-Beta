package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19090a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19091b;
    public final TLObject f19092c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19093e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19090a = 1;
        this.f19091b = unconfirmedAuth;
        this.f19092c = tLObject;
        this.d = callback;
        this.f19093e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19090a) {
            case 0:
                this.f19091b.lambda$confirm$1(this.d, this.f19092c, this.f19093e);
                return;
            case 1:
                this.f19091b.lambda$deny$3(this.f19092c, this.d, this.f19093e);
                return;
            default:
                this.f19091b.lambda$deny$5(this.d, this.f19092c, this.f19093e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19090a = i10;
        this.f19091b = unconfirmedAuth;
        this.d = callback;
        this.f19092c = tLObject;
        this.f19093e = tL_error;
    }
}
