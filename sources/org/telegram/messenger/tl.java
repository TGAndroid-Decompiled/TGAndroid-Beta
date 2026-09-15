package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tl implements RequestDelegate {
    public final int f17419a;
    public final UnconfirmedAuthController.UnconfirmedAuth f17420b;
    public final Utilities.Callback f17421c;

    public tl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f17419a = i10;
        this.f17420b = unconfirmedAuth;
        this.f17421c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17419a) {
            case 0:
                this.f17420b.lambda$deny$4(this.f17421c, tLObject, tL_error);
                return;
            case 1:
                this.f17420b.lambda$deny$6(this.f17421c, tLObject, tL_error);
                return;
            default:
                this.f17420b.lambda$confirm$2(this.f17421c, tLObject, tL_error);
                return;
        }
    }
}
