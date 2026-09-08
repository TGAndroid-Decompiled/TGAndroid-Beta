package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class de implements RequestDelegate {
    public final int f17505a;
    public final long f17506b;
    public final int f17507c;
    public final Object d;

    public de(BaseController baseController, long j3, int i10, int i11) {
        this.f17505a = i11;
        this.d = baseController;
        this.f17506b = j3;
        this.f17507c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17505a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f17506b, this.f17507c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17506b, this.f17507c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new j7((org.telegram.ui.i4) this.d, tLObject, this.f17507c, this.f17506b, 11));
                return;
        }
    }

    public de(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.f17505a = 2;
        this.d = i4Var;
        this.f17507c = i10;
        this.f17506b = j3;
    }
}
