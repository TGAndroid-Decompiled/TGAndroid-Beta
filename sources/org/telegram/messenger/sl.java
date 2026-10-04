package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements RequestDelegate {
    public final int f19182a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19183b;
    public final Utilities.Callback f19184c;

    public sl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f19182a = i10;
        this.f19183b = unconfirmedAuth;
        this.f19184c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19182a) {
            case 0:
                this.f19183b.lambda$deny$4(this.f19184c, tLObject, tL_error);
                return;
            case 1:
                this.f19183b.lambda$deny$6(this.f19184c, tLObject, tL_error);
                return;
            default:
                this.f19183b.lambda$confirm$2(this.f19184c, tLObject, tL_error);
                return;
        }
    }
}
