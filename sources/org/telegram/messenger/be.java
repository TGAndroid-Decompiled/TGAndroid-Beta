package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class be implements RequestDelegate {
    public final int f17953a;
    public final long f17954b;
    public final int f17955c;
    public final Object d;

    public be(BaseController baseController, long j10, int i10, int i11) {
        this.f17953a = i11;
        this.d = baseController;
        this.f17954b = j10;
        this.f17955c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17953a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$509(this.f17954b, this.f17955c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f17954b, this.f17955c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai.xb((org.telegram.ui.l4) this.d, tLObject, this.f17955c, this.f17954b, 13));
                return;
        }
    }

    public be(org.telegram.ui.l4 l4Var, int i10, long j10) {
        this.f17953a = 2;
        this.d = l4Var;
        this.f17955c = i10;
        this.f17954b = j10;
    }
}
