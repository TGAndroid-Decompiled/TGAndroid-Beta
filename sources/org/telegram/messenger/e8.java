package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e8 implements RequestDelegate {
    public final int f17146a;
    public final boolean f17147b;
    public final long f17148c;
    public final BaseController d;

    public e8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f17146a = i10;
        this.d = baseController;
        this.f17147b = z10;
        this.f17148c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17146a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f17147b, this.f17148c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.f17147b, this.f17148c, tLObject, tL_error);
                return;
        }
    }
}
