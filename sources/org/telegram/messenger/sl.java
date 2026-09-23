package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements RequestDelegate {
    public final int f17310a;
    public final UnconfirmedAuthController.UnconfirmedAuth f17311b;
    public final Utilities.Callback f17312c;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f17310a = i10;
        this.f17311b = unconfirmedAuth;
        this.f17312c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17310a) {
            case 0:
                this.f17311b.lambda$deny$4(this.f17312c, tLObject, tL_error);
                return;
            case 1:
                this.f17311b.lambda$deny$6(this.f17312c, tLObject, tL_error);
                return;
            default:
                this.f17311b.lambda$confirm$2(this.f17312c, tLObject, tL_error);
                return;
        }
    }
}
