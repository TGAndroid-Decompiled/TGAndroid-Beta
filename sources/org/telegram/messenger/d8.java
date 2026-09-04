package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d8 implements RequestDelegate {
    public final int f17458a;
    public final boolean f17459b;
    public final long f17460c;
    public final BaseController d;

    public d8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f17458a = i10;
        this.d = baseController;
        this.f17459b = z10;
        this.f17460c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17458a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f17459b, this.f17460c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f17459b, this.f17460c, tLObject, tL_error);
                return;
        }
    }
}
