package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ul implements Runnable {
    public final int f18618a;
    public final UnconfirmedAuthController.UnconfirmedAuth f18619b;
    public final TLObject f18620c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public ul(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18618a = 1;
        this.f18619b = unconfirmedAuth;
        this.f18620c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18618a) {
            case 0:
                this.f18619b.lambda$confirm$1(this.d, this.f18620c, this.e);
                return;
            case 1:
                this.f18619b.lambda$deny$3(this.f18620c, this.d, this.e);
                return;
            default:
                this.f18619b.lambda$deny$5(this.d, this.f18620c, this.e);
                return;
        }
    }

    public ul(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f18618a = i10;
        this.f18619b = unconfirmedAuth;
        this.d = callback;
        this.f18620c = tLObject;
        this.e = tL_error;
    }
}
