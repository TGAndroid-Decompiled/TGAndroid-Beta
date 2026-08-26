package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final UnconfirmedAuthController.UnconfirmedAuth f$0;
    public final Utilities.Callback f$1;

    public UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda1(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = unconfirmedAuth;
        this.f$1 = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deny$4(this.f$1, tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$deny$6(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$confirm$2(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
