package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class de implements RequestDelegate {
    public final int f16194a;
    public final long f16195b;
    public final int f16196c;
    public final Object d;

    public de(BaseController baseController, long j3, int i10, int i11) {
        this.f16194a = i11;
        this.d = baseController;
        this.f16195b = j3;
        this.f16196c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16194a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f16195b, this.f16196c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f16195b, this.f16196c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new j7((org.telegram.ui.h4) this.d, tLObject, this.f16196c, this.f16195b, 11));
                return;
        }
    }

    public de(org.telegram.ui.h4 h4Var, int i10, long j3) {
        this.f16194a = 2;
        this.d = h4Var;
        this.f16196c = i10;
        this.f16195b = j3;
    }
}
