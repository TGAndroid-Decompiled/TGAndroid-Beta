package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ol implements RequestDelegate {
    public final int f19225a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19226b;
    public final Utilities.Callback f19227c;

    public ol(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19225a = i10;
        this.f19226b = unconfirmedAuth;
        this.f19227c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19225a) {
            case 0:
                this.f19226b.lambda$deny$4(this.f19227c, tLObject, tL_error);
                return;
            case 1:
                this.f19226b.lambda$deny$6(this.f19227c, tLObject, tL_error);
                return;
            default:
                this.f19226b.lambda$confirm$2(this.f19227c, tLObject, tL_error);
                return;
        }
    }
}
