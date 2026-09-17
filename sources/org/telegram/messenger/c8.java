package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f17366a;
    public final boolean f17367b;
    public final long f17368c;
    public final BaseController d;

    public c8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f17366a = i10;
        this.d = baseController;
        this.f17367b = z10;
        this.f17368c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17366a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f17367b, this.f17368c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f17367b, this.f17368c, tLObject, tL_error);
                return;
        }
    }
}
