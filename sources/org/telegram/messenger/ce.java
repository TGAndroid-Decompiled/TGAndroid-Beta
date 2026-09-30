package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements RequestDelegate {
    public final int f16145a;
    public final long f16146b;
    public final int f16147c;
    public final Object d;

    public ce(BaseController baseController, long j3, int i10, int i11) {
        this.f16145a = i11;
        this.d = baseController;
        this.f16146b = j3;
        this.f16147c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16145a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f16146b, this.f16147c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f16146b, this.f16147c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new g7((org.telegram.ui.i4) this.d, tLObject, this.f16147c, this.f16146b, 12));
                return;
        }
    }

    public ce(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.f16145a = 2;
        this.d = i4Var;
        this.f16147c = i10;
        this.f16146b = j3;
    }
}
