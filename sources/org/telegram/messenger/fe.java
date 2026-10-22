package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe implements RequestDelegate {
    public final int f18353a;
    public final long f18354b;
    public final int f18355c;
    public final Object d;

    public fe(BaseController baseController, long j10, int i10, int i11) {
        this.f18353a = i11;
        this.d = baseController;
        this.f18354b = j10;
        this.f18355c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18353a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f18354b, this.f18355c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f18354b, this.f18355c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.xb((org.telegram.ui.l4) this.d, tLObject, this.f18355c, this.f18354b, 13));
                return;
        }
    }

    public fe(org.telegram.ui.l4 l4Var, int i10, long j10) {
        this.f18353a = 2;
        this.d = l4Var;
        this.f18355c = i10;
        this.f18354b = j10;
    }
}
