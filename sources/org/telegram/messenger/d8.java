package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d8 implements RequestDelegate {
    public final int f15950a;
    public final boolean f15951b;
    public final long f15952c;
    public final BaseController d;

    public d8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f15950a = i10;
        this.d = baseController;
        this.f15951b = z10;
        this.f15952c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15950a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f15951b, this.f15952c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f15951b, this.f15952c, tLObject, tL_error);
                return;
        }
    }
}
