package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d8 implements RequestDelegate {
    public final int f15926a;
    public final boolean f15927b;
    public final long f15928c;
    public final BaseController d;

    public d8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f15926a = i10;
        this.d = baseController;
        this.f15927b = z10;
        this.f15928c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15926a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f15927b, this.f15928c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f15927b, this.f15928c, tLObject, tL_error);
                return;
        }
    }
}
