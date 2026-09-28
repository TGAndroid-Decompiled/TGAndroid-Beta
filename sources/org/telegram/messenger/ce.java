package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements RequestDelegate {
    public final int f16129a;
    public final long f16130b;
    public final int f16131c;
    public final Object d;

    public ce(BaseController baseController, long j3, int i10, int i11) {
        this.f16129a = i11;
        this.d = baseController;
        this.f16130b = j3;
        this.f16131c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16129a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f16130b, this.f16131c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f16130b, this.f16131c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new g7((org.telegram.ui.i4) this.d, tLObject, this.f16131c, this.f16130b, 12));
                return;
        }
    }

    public ce(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.f16129a = 2;
        this.d = i4Var;
        this.f16131c = i10;
        this.f16130b = j3;
    }
}
