package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19111a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19112b;
    public final TLObject f19113c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19114e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19111a = 1;
        this.f19112b = unconfirmedAuth;
        this.f19113c = tLObject;
        this.d = callback;
        this.f19114e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19111a) {
            case 0:
                this.f19112b.lambda$confirm$1(this.d, this.f19113c, this.f19114e);
                return;
            case 1:
                this.f19112b.lambda$deny$3(this.f19113c, this.d, this.f19114e);
                return;
            default:
                this.f19112b.lambda$deny$5(this.d, this.f19113c, this.f19114e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19111a = i10;
        this.f19112b = unconfirmedAuth;
        this.d = callback;
        this.f19113c = tLObject;
        this.f19114e = tL_error;
    }
}
