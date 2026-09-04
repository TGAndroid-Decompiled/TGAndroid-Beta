package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tl implements RequestDelegate {
    public final int f19103a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19104b;
    public final Utilities.Callback f19105c;

    public tl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19103a = i10;
        this.f19104b = unconfirmedAuth;
        this.f19105c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19103a) {
            case 0:
                this.f19104b.lambda$deny$4(this.f19105c, tLObject, tL_error);
                return;
            case 1:
                this.f19104b.lambda$deny$6(this.f19105c, tLObject, tL_error);
                return;
            default:
                this.f19104b.lambda$confirm$2(this.f19105c, tLObject, tL_error);
                return;
        }
    }
}
