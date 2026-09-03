package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class he implements RequestDelegate {
    public final int f17381a;
    public final long f17382b;
    public final int f17383c;
    public final Object d;

    public he(BaseController baseController, long j10, int i10, int i11) {
        this.f17381a = i11;
        this.d = baseController;
        this.f17382b = j10;
        this.f17383c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17381a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f17382b, this.f17383c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17382b, this.f17383c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new lh.y8((org.telegram.ui.n4) this.d, tLObject, this.f17383c, this.f17382b, 12));
                return;
        }
    }

    public he(org.telegram.ui.n4 n4Var, int i10, long j10) {
        this.f17381a = 2;
        this.d = n4Var;
        this.f17383c = i10;
        this.f17382b = j10;
    }
}
