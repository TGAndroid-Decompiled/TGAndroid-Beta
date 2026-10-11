package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19092a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19093b;
    public final TLObject f19094c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19095e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19092a = 1;
        this.f19093b = unconfirmedAuth;
        this.f19094c = tLObject;
        this.d = callback;
        this.f19095e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19092a) {
            case 0:
                this.f19093b.lambda$confirm$1(this.d, this.f19094c, this.f19095e);
                return;
            case 1:
                this.f19093b.lambda$deny$3(this.f19094c, this.d, this.f19095e);
                return;
            default:
                this.f19093b.lambda$deny$5(this.d, this.f19094c, this.f19095e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19092a = i10;
        this.f19093b = unconfirmedAuth;
        this.d = callback;
        this.f19094c = tLObject;
        this.f19095e = tL_error;
    }
}
