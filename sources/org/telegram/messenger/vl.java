package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f18459a;
    public final UnconfirmedAuthController.UnconfirmedAuth f18460b;
    public final TLObject f18461c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public vl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18459a = 1;
        this.f18460b = unconfirmedAuth;
        this.f18461c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18459a) {
            case 0:
                this.f18460b.lambda$confirm$1(this.d, this.f18461c, this.e);
                return;
            case 1:
                this.f18460b.lambda$deny$3(this.f18461c, this.d, this.e);
                return;
            default:
                this.f18460b.lambda$deny$5(this.d, this.f18461c, this.e);
                return;
        }
    }

    public vl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f18459a = i10;
        this.f18460b = unconfirmedAuth;
        this.d = callback;
        this.f18461c = tLObject;
        this.e = tL_error;
    }
}
