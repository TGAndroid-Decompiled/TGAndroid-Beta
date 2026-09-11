package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f17339a;
    public final boolean f17340b;
    public final long f17341c;
    public final BaseController d;

    public c8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f17339a = i10;
        this.d = baseController;
        this.f17340b = z10;
        this.f17341c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17339a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f17340b, this.f17341c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f17340b, this.f17341c, tLObject, tL_error);
                return;
        }
    }
}
