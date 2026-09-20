package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d8 implements RequestDelegate {
    public final int f16175a;
    public final boolean f16176b;
    public final long f16177c;
    public final BaseController d;

    public d8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f16175a = i10;
        this.d = baseController;
        this.f16176b = z10;
        this.f16177c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16175a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f16176b, this.f16177c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f16176b, this.f16177c, tLObject, tL_error);
                return;
        }
    }
}
