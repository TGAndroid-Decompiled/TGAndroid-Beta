package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class be implements RequestDelegate {
    public final int f17950a;
    public final long f17951b;
    public final int f17952c;
    public final Object d;

    public be(BaseController baseController, long j10, int i10, int i11) {
        this.f17950a = i11;
        this.d = baseController;
        this.f17951b = j10;
        this.f17952c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17950a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f17951b, this.f17952c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17951b, this.f17952c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.xb((org.telegram.ui.l4) this.d, tLObject, this.f17952c, this.f17951b, 13));
                return;
        }
    }

    public be(org.telegram.ui.l4 l4Var, int i10, long j10) {
        this.f17950a = 2;
        this.d = l4Var;
        this.f17952c = i10;
        this.f17951b = j10;
    }
}
