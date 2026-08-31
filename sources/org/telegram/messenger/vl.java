package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vl implements RequestDelegate {
    public final int f20368a;
    public final UnconfirmedAuthController.UnconfirmedAuth f20369b;
    public final Utilities.Callback f20370c;

    public vl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f20368a = i10;
        this.f20369b = unconfirmedAuth;
        this.f20370c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20368a) {
            case 0:
                this.f20369b.lambda$deny$4(this.f20370c, tLObject, tL_error);
                return;
            case 1:
                this.f20369b.lambda$deny$6(this.f20370c, tLObject, tL_error);
                return;
            default:
                this.f20369b.lambda$confirm$2(this.f20370c, tLObject, tL_error);
                return;
        }
    }
}
