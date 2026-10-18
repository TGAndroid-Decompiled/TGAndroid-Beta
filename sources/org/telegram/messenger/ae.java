package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ae implements RequestDelegate {
    public final int f17870a;
    public final long f17871b;
    public final int f17872c;
    public final Object d;

    public ae(BaseController baseController, long j10, int i10, int i11) {
        this.f17870a = i11;
        this.d = baseController;
        this.f17871b = j10;
        this.f17872c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17870a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f17871b, this.f17872c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17871b, this.f17872c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.xb((org.telegram.ui.l4) this.d, tLObject, this.f17872c, this.f17871b, 13));
                return;
        }
    }

    public ae(org.telegram.ui.l4 l4Var, int i10, long j10) {
        this.f17870a = 2;
        this.d = l4Var;
        this.f17872c = i10;
        this.f17871b = j10;
    }
}
