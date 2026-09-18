package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tl implements RequestDelegate {
    public final int f17601a;
    public final UnconfirmedAuthController.UnconfirmedAuth f17602b;
    public final Utilities.Callback f17603c;

    public tl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f17601a = i10;
        this.f17602b = unconfirmedAuth;
        this.f17603c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17601a) {
            case 0:
                this.f17602b.lambda$deny$4(this.f17603c, tLObject, tL_error);
                return;
            case 1:
                this.f17602b.lambda$deny$6(this.f17603c, tLObject, tL_error);
                return;
            default:
                this.f17602b.lambda$confirm$2(this.f17603c, tLObject, tL_error);
                return;
        }
    }
}
