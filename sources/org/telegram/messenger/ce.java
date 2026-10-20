package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements RequestDelegate {
    public final int f18090a;
    public final long f18091b;
    public final int f18092c;
    public final Object d;

    public ce(BaseController baseController, long j10, int i10, int i11) {
        this.f18090a = i11;
        this.d = baseController;
        this.f18091b = j10;
        this.f18092c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18090a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f18091b, this.f18092c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f18091b, this.f18092c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.xb((org.telegram.ui.l4) this.d, tLObject, this.f18092c, this.f18091b, 13));
                return;
        }
    }

    public ce(org.telegram.ui.l4 l4Var, int i10, long j10) {
        this.f18090a = 2;
        this.d = l4Var;
        this.f18092c = i10;
        this.f18091b = j10;
    }
}
