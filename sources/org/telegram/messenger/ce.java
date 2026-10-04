package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements RequestDelegate {
    public final int f17578a;
    public final long f17579b;
    public final int f17580c;
    public final Object d;

    public ce(BaseController baseController, long j3, int i10, int i11) {
        this.f17578a = i11;
        this.d = baseController;
        this.f17579b = j3;
        this.f17580c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17578a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f17579b, this.f17580c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17579b, this.f17580c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new g7((org.telegram.ui.i4) this.d, tLObject, this.f17580c, this.f17579b, 12));
                return;
        }
    }

    public ce(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.f17578a = 2;
        this.d = i4Var;
        this.f17580c = i10;
        this.f17579b = j3;
    }
}
