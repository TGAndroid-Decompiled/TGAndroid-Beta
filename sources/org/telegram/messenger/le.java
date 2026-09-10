package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class le implements RequestDelegate {
    public final int f15711a;
    public final long f15712b;
    public final int f15713c;
    public final Object d;

    public le(BaseController baseController, long j3, int i10, int i11) {
        this.f15711a = i11;
        this.d = baseController;
        this.f15712b = j3;
        this.f15713c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15711a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f15712b, this.f15713c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f15712b, this.f15713c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new p7((org.telegram.ui.j4) this.d, tLObject, this.f15713c, this.f15712b, 11));
                return;
        }
    }

    public le(org.telegram.ui.j4 j4Var, int i10, long j3) {
        this.f15711a = 2;
        this.d = j4Var;
        this.f15713c = i10;
        this.f15712b = j3;
    }
}
