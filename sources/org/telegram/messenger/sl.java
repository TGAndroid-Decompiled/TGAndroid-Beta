package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements Runnable {
    public final int f19037a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19038b;
    public final TLObject f19039c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19040e;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19037a = 1;
        this.f19038b = unconfirmedAuth;
        this.f19039c = tLObject;
        this.d = callback;
        this.f19040e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19037a) {
            case 0:
                this.f19038b.lambda$confirm$1(this.d, this.f19039c, this.f19040e);
                return;
            case 1:
                this.f19038b.lambda$deny$3(this.f19039c, this.d, this.f19040e);
                return;
            default:
                this.f19038b.lambda$deny$5(this.d, this.f19039c, this.f19040e);
                return;
        }
    }

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19037a = i10;
        this.f19038b = unconfirmedAuth;
        this.d = callback;
        this.f19039c = tLObject;
        this.f19040e = tL_error;
    }
}
