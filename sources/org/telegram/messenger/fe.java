package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe implements RequestDelegate {
    public final int f18418a;
    public final long f18419b;
    public final int f18420c;
    public final Object d;

    public fe(BaseController baseController, long j10, int i10, int i11) {
        this.f18418a = i11;
        this.d = baseController;
        this.f18419b = j10;
        this.f18420c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18418a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f18419b, this.f18420c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f18419b, this.f18420c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.yb((org.telegram.ui.k4) this.d, tLObject, this.f18420c, this.f18419b, 13));
                return;
        }
    }

    public fe(org.telegram.ui.k4 k4Var, int i10, long j10) {
        this.f18418a = 2;
        this.d = k4Var;
        this.f18420c = i10;
        this.f18419b = j10;
    }
}
