package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b8 implements RequestDelegate {
    public final int f17410a;
    public final boolean f17411b;
    public final long f17412c;
    public final BaseController d;

    public b8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f17410a = i10;
        this.d = baseController;
        this.f17411b = z10;
        this.f17412c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17410a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f17411b, this.f17412c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f17411b, this.f17412c, tLObject, tL_error);
                return;
        }
    }
}
