package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g8 implements RequestDelegate {
    public final int f18492a;
    public final boolean f18493b;
    public final long f18494c;
    public final BaseController d;

    public g8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f18492a = i10;
        this.d = baseController;
        this.f18493b = z10;
        this.f18494c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18492a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f18493b, this.f18494c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.f18493b, this.f18494c, tLObject, tL_error);
                return;
        }
    }
}
