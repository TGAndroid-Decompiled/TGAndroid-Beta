package org.telegram.messenger;

import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ol implements Runnable {
    public final int f19206a;
    public final UnconfirmedAuthController.UnconfirmedAuth f19207b;
    public final TLObject f19208c;
    public final Utilities.Callback d;
    public final TLRPC.TL_error e;

    public ol(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19206a = 1;
        this.f19207b = unconfirmedAuth;
        this.f19208c = tLObject;
        this.d = callback;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f19206a) {
            case 0:
                this.f19207b.lambda$confirm$1(this.d, this.f19208c, this.e);
                return;
            case 1:
                this.f19207b.lambda$deny$3(this.f19208c, this.d, this.e);
                return;
            default:
                this.f19207b.lambda$deny$5(this.d, this.f19208c, this.e);
                return;
        }
    }

    public ol(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19206a = i10;
        this.f19207b = unconfirmedAuth;
        this.d = callback;
        this.f19208c = tLObject;
        this.e = tL_error;
    }
}
