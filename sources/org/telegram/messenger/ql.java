package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ql implements Runnable {
    public final int f19406a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19407b;
    public final TLObject f19408c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public ql(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19406a = 1;
        this.f19407b = unconfirmedAuth;
        this.f19408c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19406a) {
            case 0:
                this.f19407b.lambda$confirm$1(this.d, this.f19408c, this.e);
                return;
            case 1:
                this.f19407b.lambda$deny$3(this.f19408c, this.d, this.e);
                return;
            default:
                this.f19407b.lambda$deny$5(this.d, this.f19408c, this.e);
                return;
        }
    }

    public ql(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19406a = i10;
        this.f19407b = unconfirmedAuth;
        this.d = callback;
        this.f19408c = tLObject;
        this.e = tL_error;
    }
}
