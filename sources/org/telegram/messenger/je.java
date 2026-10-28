package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class je implements RequestDelegate {
    public final int f20435a;
    public final long f20436b;
    public final int f20437c;
    public final Object d;

    public je(BaseController baseController, long j10, int i10, int i11) {
        this.f20435a = i11;
        this.d = baseController;
        this.f20436b = j10;
        this.f20437c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20435a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$512(this.f20436b, this.f20437c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f20436b, this.f20437c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new bi.da((org.telegram.ui.j4) this.d, tLObject, this.f20437c, this.f20436b, 14));
                return;
        }
    }

    public je(org.telegram.ui.j4 j4Var, int i10, long j10) {
        this.f20435a = 2;
        this.d = j4Var;
        this.f20437c = i10;
        this.f20436b = j10;
    }
}
