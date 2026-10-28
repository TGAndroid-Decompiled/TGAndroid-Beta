package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j8 implements RequestDelegate {
    public final int f20416a;
    public final boolean f20417b;
    public final long f20418c;
    public final BaseController d;

    public j8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f20416a = i10;
        this.d = baseController;
        this.f20417b = z10;
        this.f20418c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20416a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f20417b, this.f20418c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$488(this.f20417b, this.f20418c, tLObject, tL_error);
                return;
        }
    }
}
