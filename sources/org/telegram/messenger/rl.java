package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f17494a;
    public final UnconfirmedAuthController.UnconfirmedAuth f17495b;
    public final TLObject f17496c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17494a = 1;
        this.f17495b = unconfirmedAuth;
        this.f17496c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f17494a) {
            case 0:
                this.f17495b.lambda$confirm$1(this.d, this.f17496c, this.e);
                return;
            case 1:
                this.f17495b.lambda$deny$3(this.f17496c, this.d, this.e);
                return;
            default:
                this.f17495b.lambda$deny$5(this.d, this.f17496c, this.e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f17494a = i10;
        this.f17495b = unconfirmedAuth;
        this.d = callback;
        this.f17496c = tLObject;
        this.e = tL_error;
    }
}
