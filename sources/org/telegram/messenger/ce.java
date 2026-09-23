package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements RequestDelegate {
    public final int f15876a;
    public final long f15877b;
    public final int f15878c;
    public final Object d;

    public ce(BaseController baseController, long j3, int i10, int i11) {
        this.f15876a = i11;
        this.d = baseController;
        this.f15877b = j3;
        this.f15878c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15876a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f15877b, this.f15878c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f15877b, this.f15878c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new j7((org.telegram.ui.i4) this.d, tLObject, this.f15878c, this.f15877b, 12));
                return;
        }
    }

    public ce(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.f15876a = 2;
        this.d = i4Var;
        this.f15878c = i10;
        this.f15877b = j3;
    }
}
