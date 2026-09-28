package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements RequestDelegate {
    public final int f17566a;
    public final UnconfirmedAuthController.UnconfirmedAuth f17567b;
    public final Utilities.Callback f17568c;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f17566a = i10;
        this.f17567b = unconfirmedAuth;
        this.f17568c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17566a) {
            case 0:
                this.f17567b.lambda$deny$4(this.f17568c, tLObject, tL_error);
                return;
            case 1:
                this.f17567b.lambda$deny$6(this.f17568c, tLObject, tL_error);
                return;
            default:
                this.f17567b.lambda$confirm$2(this.f17568c, tLObject, tL_error);
                return;
        }
    }
}
