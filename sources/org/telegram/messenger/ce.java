package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ce implements RequestDelegate {

    public final int f19961a;

    public final long f19962b;

    public final int f19963c;
    public final Object d;

    public ce(BaseController baseController, long j10, int i10, int i11) {
        this.f19961a = i11;
        this.d = baseController;
        this.f19962b = j10;
        this.f19963c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19961a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f19962b, this.f19963c, tLObject, tL_error);
                break;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f19962b, this.f19963c, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new hh.b9((org.telegram.ui.m4) this.d, tLObject, this.f19963c, this.f19962b, 12));
                break;
        }
    }

    public ce(org.telegram.ui.m4 m4Var, int i10, long j10) {
        this.f19961a = 2;
        this.d = m4Var;
        this.f19963c = i10;
        this.f19962b = j10;
    }
}
