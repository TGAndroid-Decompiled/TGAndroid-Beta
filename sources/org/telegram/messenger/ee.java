package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ee implements RequestDelegate {
    public final int f18285a;
    public final long f18286b;
    public final int f18287c;
    public final Object d;

    public ee(BaseController baseController, long j10, int i10, int i11) {
        this.f18285a = i11;
        this.d = baseController;
        this.f18286b = j10;
        this.f18287c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18285a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f18286b, this.f18287c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f18286b, this.f18287c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.xb((org.telegram.ui.l4) this.d, tLObject, this.f18287c, this.f18286b, 13));
                return;
        }
    }

    public ee(org.telegram.ui.l4 l4Var, int i10, long j10) {
        this.f18285a = 2;
        this.d = l4Var;
        this.f18287c = i10;
        this.f18286b = j10;
    }
}
