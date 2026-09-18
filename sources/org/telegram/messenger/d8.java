package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d8 implements RequestDelegate {
    public final int f16135a;
    public final boolean f16136b;
    public final long f16137c;
    public final BaseController d;

    public d8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f16135a = i10;
        this.d = baseController;
        this.f16136b = z10;
        this.f16137c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16135a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f16136b, this.f16137c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f16136b, this.f16137c, tLObject, tL_error);
                return;
        }
    }
}
