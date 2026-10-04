package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19104a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19105b;
    public final TLObject f19106c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19107e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19104a = 1;
        this.f19105b = unconfirmedAuth;
        this.f19106c = tLObject;
        this.d = callback;
        this.f19107e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19104a) {
            case 0:
                this.f19105b.lambda$confirm$1(this.d, this.f19106c, this.f19107e);
                return;
            case 1:
                this.f19105b.lambda$deny$3(this.f19106c, this.d, this.f19107e);
                return;
            default:
                this.f19105b.lambda$deny$5(this.d, this.f19106c, this.f19107e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19104a = i10;
        this.f19105b = unconfirmedAuth;
        this.d = callback;
        this.f19106c = tLObject;
        this.f19107e = tL_error;
    }
}
