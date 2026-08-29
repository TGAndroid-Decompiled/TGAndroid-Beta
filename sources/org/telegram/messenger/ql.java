package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ql implements Runnable {
    public final int f21386a;
    public final UnconfirmedAuthController.UnconfirmedAuth f21387b;
    public final TLObject f21388c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f21389e;

    public ql(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21386a = 1;
        this.f21387b = unconfirmedAuth;
        this.f21388c = tLObject;
        this.d = callback;
        this.f21389e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f21386a) {
            case 0:
                this.f21387b.lambda$confirm$1(this.d, this.f21388c, this.f21389e);
                return;
            case 1:
                this.f21387b.lambda$deny$3(this.f21388c, this.d, this.f21389e);
                return;
            default:
                this.f21387b.lambda$deny$5(this.d, this.f21388c, this.f21389e);
                return;
        }
    }

    public ql(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f21386a = i10;
        this.f21387b = unconfirmedAuth;
        this.d = callback;
        this.f21388c = tLObject;
        this.f21389e = tL_error;
    }
}
