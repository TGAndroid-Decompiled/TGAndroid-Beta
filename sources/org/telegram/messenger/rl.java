package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19128a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19129b;
    public final TLObject f19130c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19131e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19128a = 1;
        this.f19129b = unconfirmedAuth;
        this.f19130c = tLObject;
        this.d = callback;
        this.f19131e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19128a) {
            case 0:
                this.f19129b.lambda$confirm$1(this.d, this.f19130c, this.f19131e);
                return;
            case 1:
                this.f19129b.lambda$deny$3(this.f19130c, this.d, this.f19131e);
                return;
            default:
                this.f19129b.lambda$deny$5(this.d, this.f19130c, this.f19131e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19128a = i10;
        this.f19129b = unconfirmedAuth;
        this.d = callback;
        this.f19130c = tLObject;
        this.f19131e = tL_error;
    }
}
