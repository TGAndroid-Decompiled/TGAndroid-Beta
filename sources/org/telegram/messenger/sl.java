package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements Runnable {
    public final int f17568a;
    public final UnconfirmedAuthController.UnconfirmedAuth f17569b;
    public final TLObject f17570c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17568a = 1;
        this.f17569b = unconfirmedAuth;
        this.f17570c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17568a) {
            case 0:
                this.f17569b.lambda$confirm$1(this.d, this.f17570c, this.e);
                return;
            case 1:
                this.f17569b.lambda$deny$3(this.f17570c, this.d, this.e);
                return;
            default:
                this.f17569b.lambda$deny$5(this.d, this.f17570c, this.e);
                return;
        }
    }

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f17568a = i10;
        this.f17569b = unconfirmedAuth;
        this.d = callback;
        this.f17570c = tLObject;
        this.e = tL_error;
    }
}
