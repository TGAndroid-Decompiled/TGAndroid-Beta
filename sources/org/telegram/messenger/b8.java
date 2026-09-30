package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b8 implements RequestDelegate {
    public final int f15968a;
    public final boolean f15969b;
    public final long f15970c;
    public final BaseController d;

    public b8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f15968a = i10;
        this.d = baseController;
        this.f15969b = z10;
        this.f15970c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15968a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f15969b, this.f15970c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f15969b, this.f15970c, tLObject, tL_error);
                return;
        }
    }
}
