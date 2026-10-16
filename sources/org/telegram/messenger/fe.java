package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe implements RequestDelegate {
    public final int f16946a;
    public final long f16947b;
    public final int f16948c;
    public final Object d;

    public fe(BaseController baseController, long j10, int i10, int i11) {
        this.f16946a = i11;
        this.d = baseController;
        this.f16947b = j10;
        this.f16948c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16946a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f16947b, this.f16948c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f16947b, this.f16948c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new k7((org.telegram.ui.k4) this.d, tLObject, this.f16948c, this.f16947b, 12));
                return;
        }
    }

    public fe(org.telegram.ui.k4 k4Var, int i10, long j10) {
        this.f16946a = 2;
        this.d = k4Var;
        this.f16948c = i10;
        this.f16947b = j10;
    }
}
