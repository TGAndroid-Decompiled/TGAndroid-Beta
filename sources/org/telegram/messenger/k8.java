package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k8 implements RequestDelegate {
    public final int f15597a;
    public final boolean f15598b;
    public final long f15599c;
    public final BaseController d;

    public k8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f15597a = i10;
        this.d = baseController;
        this.f15598b = z10;
        this.f15599c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15597a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f15598b, this.f15599c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f15598b, this.f15599c, tLObject, tL_error);
                return;
        }
    }
}
