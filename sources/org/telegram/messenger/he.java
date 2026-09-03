package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class he implements RequestDelegate {
    public final int f18867a;
    public final long f18868b;
    public final int f18869c;
    public final Object d;

    public he(BaseController baseController, long j10, int i10, int i11) {
        this.f18867a = i11;
        this.d = baseController;
        this.f18868b = j10;
        this.f18869c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18867a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f18868b, this.f18869c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f18868b, this.f18869c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new mh.y8((org.telegram.ui.l4) this.d, tLObject, this.f18869c, this.f18868b, 12));
                return;
        }
    }

    public he(org.telegram.ui.l4 l4Var, int i10, long j10) {
        this.f18867a = 2;
        this.d = l4Var;
        this.f18869c = i10;
        this.f18868b = j10;
    }
}
