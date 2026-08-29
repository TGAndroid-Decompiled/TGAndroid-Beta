package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements RequestDelegate {
    public final int f21477a;
    public final UnconfirmedAuthController.UnconfirmedAuth f21478b;
    public final Utilities.Callback f21479c;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i10) {
        this.f21477a = i10;
        this.f21478b = unconfirmedAuth;
        this.f21479c = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21477a) {
            case 0:
                this.f21478b.lambda$deny$4(this.f21479c, tLObject, tL_error);
                return;
            case 1:
                this.f21478b.lambda$deny$6(this.f21479c, tLObject, tL_error);
                return;
            default:
                this.f21478b.lambda$confirm$2(this.f21479c, tLObject, tL_error);
                return;
        }
    }
}
