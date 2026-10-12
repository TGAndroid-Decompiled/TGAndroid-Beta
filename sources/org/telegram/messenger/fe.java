package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe implements RequestDelegate {
    public final int f17247a;
    public final long f17248b;
    public final int f17249c;
    public final Object d;

    public fe(BaseController baseController, long j10, int i10, int i11) {
        this.f17247a = i11;
        this.d = baseController;
        this.f17248b = j10;
        this.f17249c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17247a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f17248b, this.f17249c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17248b, this.f17249c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new k7((org.telegram.ui.k4) this.d, tLObject, this.f17249c, this.f17248b, 12));
                return;
        }
    }

    public fe(org.telegram.ui.k4 k4Var, int i10, long j10) {
        this.f17247a = 2;
        this.d = k4Var;
        this.f17249c = i10;
        this.f17248b = j10;
    }
}
