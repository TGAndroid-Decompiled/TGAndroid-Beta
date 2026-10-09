package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b8 implements RequestDelegate {
    public final int f17407a;
    public final boolean f17408b;
    public final long f17409c;
    public final BaseController d;

    public b8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f17407a = i10;
        this.d = baseController;
        this.f17408b = z10;
        this.f17409c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17407a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f17408b, this.f17409c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.f17408b, this.f17409c, tLObject, tL_error);
                return;
        }
    }
}
