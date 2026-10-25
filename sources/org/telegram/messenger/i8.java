package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i8 implements RequestDelegate {
    public final int f20322a;
    public final boolean f20323b;
    public final long f20324c;
    public final BaseController d;

    public i8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f20322a = i10;
        this.d = baseController;
        this.f20323b = z10;
        this.f20324c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20322a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f20323b, this.f20324c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$487(this.f20323b, this.f20324c, tLObject, tL_error);
                return;
        }
    }
}
