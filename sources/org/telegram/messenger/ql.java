package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ql implements RequestDelegate {
    public final int f19394a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19395b;
    public final Utilities.Callback f19396c;

    public ql(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19394a = i10;
        this.f19395b = unconfirmedAuth;
        this.f19396c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19394a) {
            case 0:
                this.f19395b.lambda$deny$4(this.f19396c, tLObject, tL_error);
                return;
            case 1:
                this.f19395b.lambda$deny$6(this.f19396c, tLObject, tL_error);
                return;
            default:
                this.f19395b.lambda$confirm$2(this.f19396c, tLObject, tL_error);
                return;
        }
    }
}
