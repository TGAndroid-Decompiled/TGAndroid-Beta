package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b8 implements RequestDelegate {
    public final int f17415a;
    public final boolean f17416b;
    public final long f17417c;
    public final BaseController d;

    public b8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f17415a = i10;
        this.d = baseController;
        this.f17416b = z10;
        this.f17417c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17415a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f17416b, this.f17417c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f17416b, this.f17417c, tLObject, tL_error);
                return;
        }
    }
}
