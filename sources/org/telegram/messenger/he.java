package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class he implements RequestDelegate {
    public final int f17401a;
    public final long f17402b;
    public final int f17403c;
    public final Object d;

    public he(BaseController baseController, long j10, int i10, int i11) {
        this.f17401a = i11;
        this.d = baseController;
        this.f17402b = j10;
        this.f17403c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17401a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f17402b, this.f17403c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17402b, this.f17403c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new lh.y8((org.telegram.ui.l4) this.d, tLObject, this.f17403c, this.f17402b, 12));
                return;
        }
    }

    public he(org.telegram.ui.l4 l4Var, int i10, long j10) {
        this.f17401a = 2;
        this.d = l4Var;
        this.f17403c = i10;
        this.f17402b = j10;
    }
}
