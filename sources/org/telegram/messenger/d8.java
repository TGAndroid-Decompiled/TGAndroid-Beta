package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d8 implements RequestDelegate {
    public final int f16172a;
    public final boolean f16173b;
    public final long f16174c;
    public final BaseController d;

    public d8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f16172a = i10;
        this.d = baseController;
        this.f16173b = z10;
        this.f16174c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16172a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f16173b, this.f16174c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f16173b, this.f16174c, tLObject, tL_error);
                return;
        }
    }
}
