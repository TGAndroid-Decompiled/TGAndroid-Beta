package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ql implements Runnable {
    public final int f19360a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19361b;
    public final TLObject f19362c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public ql(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19360a = 1;
        this.f19361b = unconfirmedAuth;
        this.f19362c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19360a) {
            case 0:
                this.f19361b.lambda$confirm$1(this.d, this.f19362c, this.e);
                return;
            case 1:
                this.f19361b.lambda$deny$3(this.f19362c, this.d, this.e);
                return;
            default:
                this.f19361b.lambda$deny$5(this.d, this.f19362c, this.e);
                return;
        }
    }

    public ql(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19360a = i10;
        this.f19361b = unconfirmedAuth;
        this.d = callback;
        this.f19362c = tLObject;
        this.e = tL_error;
    }
}
