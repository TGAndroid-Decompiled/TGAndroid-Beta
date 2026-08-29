package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe implements RequestDelegate {
    public final int f20237a;
    public final long f20238b;
    public final int f20239c;
    public final Object d;

    public fe(BaseController baseController, long j10, int i10, int i11) {
        this.f20237a = i11;
        this.d = baseController;
        this.f20238b = j10;
        this.f20239c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20237a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f20238b, this.f20239c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f20238b, this.f20239c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new jh.x8((org.telegram.ui.m4) this.d, tLObject, this.f20239c, this.f20238b, 12));
                return;
        }
    }

    public fe(org.telegram.ui.m4 m4Var, int i10, long j10) {
        this.f20237a = 2;
        this.d = m4Var;
        this.f20239c = i10;
        this.f20238b = j10;
    }
}
