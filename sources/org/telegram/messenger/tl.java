package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tl implements RequestDelegate {
    public final int f19130a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19131b;
    public final Utilities.Callback f19132c;

    public tl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19130a = i10;
        this.f19131b = unconfirmedAuth;
        this.f19132c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19130a) {
            case 0:
                this.f19131b.lambda$deny$4(this.f19132c, tLObject, tL_error);
                return;
            case 1:
                this.f19131b.lambda$deny$6(this.f19132c, tLObject, tL_error);
                return;
            default:
                this.f19131b.lambda$confirm$2(this.f19132c, tLObject, tL_error);
                return;
        }
    }
}
