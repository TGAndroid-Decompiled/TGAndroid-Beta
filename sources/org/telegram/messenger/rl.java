package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl implements Runnable {
    public final int f19086a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19087b;
    public final TLObject f19088c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error f19089e;

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19086a = 1;
        this.f19087b = unconfirmedAuth;
        this.f19088c = tLObject;
        this.d = callback;
        this.f19089e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19086a) {
            case 0:
                this.f19087b.lambda$confirm$1(this.d, this.f19088c, this.f19089e);
                return;
            case 1:
                this.f19087b.lambda$deny$3(this.f19088c, this.d, this.f19089e);
                return;
            default:
                this.f19087b.lambda$deny$5(this.d, this.f19088c, this.f19089e);
                return;
        }
    }

    public rl(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19086a = i10;
        this.f19087b = unconfirmedAuth;
        this.d = callback;
        this.f19088c = tLObject;
        this.f19089e = tL_error;
    }
}
