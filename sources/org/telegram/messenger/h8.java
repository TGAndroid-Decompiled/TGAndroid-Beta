package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h8 implements RequestDelegate {
    public final int f18568a;
    public final boolean f18569b;
    public final long f18570c;
    public final BaseController d;

    public h8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f18568a = i10;
        this.d = baseController;
        this.f18569b = z10;
        this.f18570c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18568a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f18569b, this.f18570c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.f18569b, this.f18570c, tLObject, tL_error);
                return;
        }
    }
}
