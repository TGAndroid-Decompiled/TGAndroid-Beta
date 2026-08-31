package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class he implements RequestDelegate {
    public final int f18865a;
    public final long f18866b;
    public final int f18867c;
    public final Object d;

    public he(BaseController baseController, long j10, int i10, int i11) {
        this.f18865a = i11;
        this.d = baseController;
        this.f18866b = j10;
        this.f18867c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18865a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f18866b, this.f18867c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f18866b, this.f18867c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new mh.y8((org.telegram.ui.l4) this.d, tLObject, this.f18867c, this.f18866b, 12));
                return;
        }
    }

    public he(org.telegram.ui.l4 l4Var, int i10, long j10) {
        this.f18865a = 2;
        this.d = l4Var;
        this.f18867c = i10;
        this.f18866b = j10;
    }
}
