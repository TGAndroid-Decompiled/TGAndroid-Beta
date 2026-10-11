package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements RequestDelegate {
    public final int f19194a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19195b;
    public final Utilities.Callback f19196c;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19194a = i10;
        this.f19195b = unconfirmedAuth;
        this.f19196c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19194a) {
            case 0:
                this.f19195b.lambda$deny$4(this.f19196c, tLObject, tL_error);
                return;
            case 1:
                this.f19195b.lambda$deny$6(this.f19196c, tLObject, tL_error);
                return;
            default:
                this.f19195b.lambda$confirm$2(this.f19196c, tLObject, tL_error);
                return;
        }
    }
}
