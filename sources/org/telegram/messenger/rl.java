package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19432a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19433b;
    public final TLObject f19434c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19432a = 1;
        this.f19433b = unconfirmedAuth;
        this.f19434c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19432a) {
            case 0:
                this.f19433b.lambda$confirm$1(this.d, this.f19434c, this.e);
                return;
            case 1:
                this.f19433b.lambda$deny$3(this.f19434c, this.d, this.e);
                return;
            default:
                this.f19433b.lambda$deny$5(this.d, this.f19434c, this.e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19432a = i10;
        this.f19433b = unconfirmedAuth;
        this.d = callback;
        this.f19434c = tLObject;
        this.e = tL_error;
    }
}
