package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements RequestDelegate {
    public final int f17581a;
    public final long f17582b;
    public final int f17583c;
    public final Object d;

    public ce(BaseController baseController, long j3, int i10, int i11) {
        this.f17581a = i11;
        this.d = baseController;
        this.f17582b = j3;
        this.f17583c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17581a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f17582b, this.f17583c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17582b, this.f17583c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new g7((org.telegram.ui.i4) this.d, tLObject, this.f17583c, this.f17582b, 12));
                return;
        }
    }

    public ce(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.f17581a = 2;
        this.d = i4Var;
        this.f17583c = i10;
        this.f17582b = j3;
    }
}
