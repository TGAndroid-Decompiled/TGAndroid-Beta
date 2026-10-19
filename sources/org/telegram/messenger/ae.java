package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ae implements RequestDelegate {
    public final int f17867a;
    public final long f17868b;
    public final int f17869c;
    public final Object d;

    public ae(BaseController baseController, long j10, int i10, int i11) {
        this.f17867a = i11;
        this.d = baseController;
        this.f17868b = j10;
        this.f17869c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17867a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f17868b, this.f17869c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17868b, this.f17869c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.xb((org.telegram.ui.l4) this.d, tLObject, this.f17869c, this.f17868b, 13));
                return;
        }
    }

    public ae(org.telegram.ui.l4 l4Var, int i10, long j10) {
        this.f17867a = 2;
        this.d = l4Var;
        this.f17869c = i10;
        this.f17868b = j10;
    }
}
