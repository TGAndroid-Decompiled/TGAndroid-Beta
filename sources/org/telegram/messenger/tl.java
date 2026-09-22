package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tl implements RequestDelegate {
    public final int f17653a;
    public final UnconfirmedAuthController.UnconfirmedAuth f17654b;
    public final Utilities.Callback f17655c;

    public tl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f17653a = i10;
        this.f17654b = unconfirmedAuth;
        this.f17655c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17653a) {
            case 0:
                this.f17654b.lambda$deny$4(this.f17655c, tLObject, tL_error);
                return;
            case 1:
                this.f17654b.lambda$deny$6(this.f17655c, tLObject, tL_error);
                return;
            default:
                this.f17654b.lambda$confirm$2(this.f17655c, tLObject, tL_error);
                return;
        }
    }
}
