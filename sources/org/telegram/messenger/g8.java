package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g8 implements RequestDelegate {
    public final int f17270a;
    public final boolean f17271b;
    public final long f17272c;
    public final BaseController d;

    public g8(BaseController baseController, boolean z4, long j10, int i10) {
        this.f17270a = i10;
        this.d = baseController;
        this.f17271b = z4;
        this.f17272c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17270a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f17271b, this.f17272c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f17271b, this.f17272c, tLObject, tL_error);
                return;
        }
    }
}
