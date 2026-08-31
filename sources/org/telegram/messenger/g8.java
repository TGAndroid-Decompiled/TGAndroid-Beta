package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g8 implements RequestDelegate {
    public final int f18742a;
    public final boolean f18743b;
    public final long f18744c;
    public final BaseController d;

    public g8(BaseController baseController, boolean z4, long j10, int i10) {
        this.f18742a = i10;
        this.d = baseController;
        this.f18743b = z4;
        this.f18744c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18742a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f18743b, this.f18744c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f18743b, this.f18744c, tLObject, tL_error);
                return;
        }
    }
}
