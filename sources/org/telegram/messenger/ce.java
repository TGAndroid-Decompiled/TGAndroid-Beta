package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements RequestDelegate {
    public final int f17568a;
    public final long f17569b;
    public final int f17570c;
    public final Object d;

    public ce(BaseController baseController, long j3, int i10, int i11) {
        this.f17568a = i11;
        this.d = baseController;
        this.f17569b = j3;
        this.f17570c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17568a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f17569b, this.f17570c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17569b, this.f17570c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new h7((org.telegram.ui.h4) this.d, tLObject, this.f17570c, this.f17569b, 12));
                return;
        }
    }

    public ce(org.telegram.ui.h4 h4Var, int i10, long j3) {
        this.f17568a = 2;
        this.d = h4Var;
        this.f17570c = i10;
        this.f17569b = j3;
    }
}
