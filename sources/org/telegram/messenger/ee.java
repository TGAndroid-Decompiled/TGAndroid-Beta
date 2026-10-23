package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ee implements RequestDelegate {
    public final int f18350a;
    public final long f18351b;
    public final int f18352c;
    public final Object d;

    public ee(BaseController baseController, long j10, int i10, int i11) {
        this.f18350a = i11;
        this.d = baseController;
        this.f18351b = j10;
        this.f18352c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18350a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f18351b, this.f18352c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f18351b, this.f18352c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.yb((org.telegram.ui.k4) this.d, tLObject, this.f18352c, this.f18351b, 13));
                return;
        }
    }

    public ee(org.telegram.ui.k4 k4Var, int i10, long j10) {
        this.f18350a = 2;
        this.d = k4Var;
        this.f18352c = i10;
        this.f18351b = j10;
    }
}
