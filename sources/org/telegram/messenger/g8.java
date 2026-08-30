package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g8 implements RequestDelegate {
    public final int f17288a;
    public final boolean f17289b;
    public final long f17290c;
    public final BaseController d;

    public g8(BaseController baseController, boolean z4, long j10, int i10) {
        this.f17288a = i10;
        this.d = baseController;
        this.f17289b = z4;
        this.f17290c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17288a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f17289b, this.f17290c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f17289b, this.f17290c, tLObject, tL_error);
                return;
        }
    }
}
