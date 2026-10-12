package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe implements RequestDelegate {
    public final int f17607a;
    public final long f17608b;
    public final int f17609c;
    public final Object d;

    public fe(BaseController baseController, long j3, int i10, int i11) {
        this.f17607a = i11;
        this.d = baseController;
        this.f17608b = j3;
        this.f17609c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17607a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f17608b, this.f17609c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17608b, this.f17609c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new k7((org.telegram.ui.i4) this.d, tLObject, this.f17609c, this.f17608b, 12));
                return;
        }
    }

    public fe(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.f17607a = 2;
        this.d = i4Var;
        this.f17609c = i10;
        this.f17608b = j3;
    }
}
