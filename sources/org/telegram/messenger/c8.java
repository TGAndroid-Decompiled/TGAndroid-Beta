package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f18039a;
    public final boolean f18040b;
    public final long f18041c;
    public final BaseController d;

    public c8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f18039a = i10;
        this.d = baseController;
        this.f18040b = z10;
        this.f18041c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18039a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f18040b, this.f18041c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.f18040b, this.f18041c, tLObject, tL_error);
                return;
        }
    }
}
