package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements RequestDelegate {
    public final int f17430a;
    public final long f17431b;
    public final int f17432c;
    public final Object d;

    public ce(BaseController baseController, long j3, int i10, int i11) {
        this.f17430a = i11;
        this.d = baseController;
        this.f17431b = j3;
        this.f17432c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17430a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f17431b, this.f17432c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17431b, this.f17432c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new i7((org.telegram.ui.i4) this.d, tLObject, this.f17432c, this.f17431b, 11));
                return;
        }
    }

    public ce(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.f17430a = 2;
        this.d = i4Var;
        this.f17432c = i10;
        this.f17431b = j3;
    }
}
