package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements RequestDelegate {
    public final int f19501a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19502b;
    public final Utilities.Callback f19503c;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19501a = i10;
        this.f19502b = unconfirmedAuth;
        this.f19503c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19501a) {
            case 0:
                this.f19502b.lambda$deny$4(this.f19503c, tLObject, tL_error);
                return;
            case 1:
                this.f19502b.lambda$deny$6(this.f19503c, tLObject, tL_error);
                return;
            default:
                this.f19502b.lambda$confirm$2(this.f19503c, tLObject, tL_error);
                return;
        }
    }
}
