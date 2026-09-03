package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g8 implements RequestDelegate {
    public final int f18744a;
    public final boolean f18745b;
    public final long f18746c;
    public final BaseController d;

    public g8(BaseController baseController, boolean z4, long j10, int i10) {
        this.f18744a = i10;
        this.d = baseController;
        this.f18745b = z4;
        this.f18746c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18744a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f18745b, this.f18746c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f18745b, this.f18746c, tLObject, tL_error);
                return;
        }
    }
}
