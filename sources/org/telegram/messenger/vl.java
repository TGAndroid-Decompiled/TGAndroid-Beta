package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vl implements RequestDelegate {
    public final int f18725a;
    public final UnconfirmedAuthController.UnconfirmedAuth f18726b;
    public final Utilities.Callback f18727c;

    public vl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f18725a = i10;
        this.f18726b = unconfirmedAuth;
        this.f18727c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18725a) {
            case 0:
                this.f18726b.lambda$deny$4(this.f18727c, tLObject, tL_error);
                return;
            case 1:
                this.f18726b.lambda$deny$6(this.f18727c, tLObject, tL_error);
                return;
            default:
                this.f18726b.lambda$confirm$2(this.f18727c, tLObject, tL_error);
                return;
        }
    }
}
