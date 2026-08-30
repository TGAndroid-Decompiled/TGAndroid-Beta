package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vl implements RequestDelegate {
    public final int f18743a;
    public final UnconfirmedAuthController.UnconfirmedAuth f18744b;
    public final Utilities.Callback f18745c;

    public vl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f18743a = i10;
        this.f18744b = unconfirmedAuth;
        this.f18745c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18743a) {
            case 0:
                this.f18744b.lambda$deny$4(this.f18745c, tLObject, tL_error);
                return;
            case 1:
                this.f18744b.lambda$deny$6(this.f18745c, tLObject, tL_error);
                return;
            default:
                this.f18744b.lambda$confirm$2(this.f18745c, tLObject, tL_error);
                return;
        }
    }
}
