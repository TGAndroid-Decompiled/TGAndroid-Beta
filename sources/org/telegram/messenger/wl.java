package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wl implements RequestDelegate {
    public final int f18659a;
    public final UnconfirmedAuthController.UnconfirmedAuth f18660b;
    public final Utilities.Callback f18661c;

    public wl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f18659a = i10;
        this.f18660b = unconfirmedAuth;
        this.f18661c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18659a) {
            case 0:
                this.f18660b.lambda$deny$4(this.f18661c, tLObject, tL_error);
                return;
            case 1:
                this.f18660b.lambda$deny$6(this.f18661c, tLObject, tL_error);
                return;
            default:
                this.f18660b.lambda$confirm$2(this.f18661c, tLObject, tL_error);
                return;
        }
    }
}
