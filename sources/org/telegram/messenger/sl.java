package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements Runnable {
    public final int f19010a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19011b;
    public final TLObject f19012c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19013e;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19010a = 1;
        this.f19011b = unconfirmedAuth;
        this.f19012c = tLObject;
        this.d = callback;
        this.f19013e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19010a) {
            case 0:
                this.f19011b.lambda$confirm$1(this.d, this.f19012c, this.f19013e);
                return;
            case 1:
                this.f19011b.lambda$deny$3(this.f19012c, this.d, this.f19013e);
                return;
            default:
                this.f19011b.lambda$deny$5(this.d, this.f19012c, this.f19013e);
                return;
        }
    }

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19010a = i10;
        this.f19011b = unconfirmedAuth;
        this.d = callback;
        this.f19012c = tLObject;
        this.f19013e = tL_error;
    }
}
