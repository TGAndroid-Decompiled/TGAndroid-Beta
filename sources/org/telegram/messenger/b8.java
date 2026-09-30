package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b8 implements RequestDelegate {
    public final int f15984a;
    public final boolean f15985b;
    public final long f15986c;
    public final BaseController d;

    public b8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f15984a = i10;
        this.d = baseController;
        this.f15985b = z10;
        this.f15986c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15984a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f15985b, this.f15986c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f15985b, this.f15986c, tLObject, tL_error);
                return;
        }
    }
}
