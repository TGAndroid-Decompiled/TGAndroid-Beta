package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements RequestDelegate {
    public final int f16128a;
    public final long f16129b;
    public final int f16130c;
    public final Object d;

    public ce(BaseController baseController, long j3, int i10, int i11) {
        this.f16128a = i11;
        this.d = baseController;
        this.f16129b = j3;
        this.f16130c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16128a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f16129b, this.f16130c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f16129b, this.f16130c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new g7((org.telegram.ui.i4) this.d, tLObject, this.f16130c, this.f16129b, 12));
                return;
        }
    }

    public ce(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.f16128a = 2;
        this.d = i4Var;
        this.f16130c = i10;
        this.f16129b = j3;
    }
}
