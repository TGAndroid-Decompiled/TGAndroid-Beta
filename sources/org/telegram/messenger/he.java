package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class he implements RequestDelegate {
    public final int f20256a;
    public final long f20257b;
    public final int f20258c;
    public final Object d;

    public he(BaseController baseController, long j10, int i10, int i11) {
        this.f20256a = i11;
        this.d = baseController;
        this.f20257b = j10;
        this.f20258c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20256a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$511(this.f20257b, this.f20258c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f20257b, this.f20258c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new bi.da((org.telegram.ui.j4) this.d, tLObject, this.f20258c, this.f20257b, 14));
                return;
        }
    }

    public he(org.telegram.ui.j4 j4Var, int i10, long j10) {
        this.f20256a = 2;
        this.d = j4Var;
        this.f20258c = i10;
        this.f20257b = j10;
    }
}
