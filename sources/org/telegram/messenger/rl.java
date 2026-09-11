package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f18931a;
    public final UnconfirmedAuthController.UnconfirmedAuth f18932b;
    public final TLObject f18933c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f18934e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18931a = 1;
        this.f18932b = unconfirmedAuth;
        this.f18933c = tLObject;
        this.d = callback;
        this.f18934e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f18931a) {
            case 0:
                this.f18932b.lambda$confirm$1(this.d, this.f18933c, this.f18934e);
                return;
            case 1:
                this.f18932b.lambda$deny$3(this.f18933c, this.d, this.f18934e);
                return;
            default:
                this.f18932b.lambda$deny$5(this.d, this.f18933c, this.f18934e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f18931a = i10;
        this.f18932b = unconfirmedAuth;
        this.d = callback;
        this.f18933c = tLObject;
        this.f18934e = tL_error;
    }
}
