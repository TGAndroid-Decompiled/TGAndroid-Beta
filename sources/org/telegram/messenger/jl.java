package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f20734a;
    public final UnconfirmedAuthController.UnconfirmedAuth f20735b;
    public final Utilities.Callback f20736c;

    public jl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i9) {
        this.f20734a = i9;
        this.f20735b = unconfirmedAuth;
        this.f20736c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20734a) {
            case 0:
                this.f20735b.lambda$deny$4(this.f20736c, tLObject, tL_error);
                return;
            case 1:
                this.f20735b.lambda$deny$6(this.f20736c, tLObject, tL_error);
                return;
            default:
                this.f20735b.lambda$confirm$2(this.f20736c, tLObject, tL_error);
                return;
        }
    }
}
