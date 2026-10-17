package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ol implements RequestDelegate {
    public final int f19223a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19224b;
    public final Utilities.Callback f19225c;

    public ol(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19223a = i10;
        this.f19224b = unconfirmedAuth;
        this.f19225c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19223a) {
            case 0:
                this.f19224b.lambda$deny$4(this.f19225c, tLObject, tL_error);
                return;
            case 1:
                this.f19224b.lambda$deny$6(this.f19225c, tLObject, tL_error);
                return;
            default:
                this.f19224b.lambda$confirm$2(this.f19225c, tLObject, tL_error);
                return;
        }
    }
}
