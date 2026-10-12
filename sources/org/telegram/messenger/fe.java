package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe implements RequestDelegate {
    public final int f17608a;
    public final long f17609b;
    public final int f17610c;
    public final Object d;

    public fe(BaseController baseController, long j3, int i10, int i11) {
        this.f17608a = i11;
        this.d = baseController;
        this.f17609b = j3;
        this.f17610c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17608a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f17609b, this.f17610c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17609b, this.f17610c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new k7((org.telegram.ui.i4) this.d, tLObject, this.f17610c, this.f17609b, 12));
                return;
        }
    }

    public fe(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.f17608a = 2;
        this.d = i4Var;
        this.f17610c = i10;
        this.f17609b = j3;
    }
}
