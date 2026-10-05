package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19116a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19117b;
    public final TLObject f19118c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19119e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19116a = 1;
        this.f19117b = unconfirmedAuth;
        this.f19118c = tLObject;
        this.d = callback;
        this.f19119e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19116a) {
            case 0:
                this.f19117b.lambda$confirm$1(this.d, this.f19118c, this.f19119e);
                return;
            case 1:
                this.f19117b.lambda$deny$3(this.f19118c, this.d, this.f19119e);
                return;
            default:
                this.f19117b.lambda$deny$5(this.d, this.f19118c, this.f19119e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19116a = i10;
        this.f19117b = unconfirmedAuth;
        this.d = callback;
        this.f19118c = tLObject;
        this.f19119e = tL_error;
    }
}
