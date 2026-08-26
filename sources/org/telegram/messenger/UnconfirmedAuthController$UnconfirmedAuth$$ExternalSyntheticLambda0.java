package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final UnconfirmedAuthController.UnconfirmedAuth f$0;
    public final Utilities.Callback f$1;
    public final TLObject f$2;
    public final TLRPC.TL_error f$3;

    public UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda0(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.$r8$classId = 1;
        this.f$0 = unconfirmedAuth;
        this.f$2 = tLObject;
        this.f$1 = callback;
        this.f$3 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$confirm$1(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$deny$3(this.f$2, this.f$1, this.f$3);
                break;
            default:
                this.f$0.lambda$deny$5(this.f$1, this.f$2, this.f$3);
                break;
        }
    }

    public UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda0(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = unconfirmedAuth;
        this.f$1 = callback;
        this.f$2 = tLObject;
        this.f$3 = tL_error;
    }
}
