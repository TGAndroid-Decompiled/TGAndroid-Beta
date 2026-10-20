package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e8 implements RequestDelegate {
    public final int f18255a;
    public final boolean f18256b;
    public final long f18257c;
    public final BaseController d;

    public e8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f18255a = i10;
        this.d = baseController;
        this.f18256b = z10;
        this.f18257c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18255a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f18256b, this.f18257c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.f18256b, this.f18257c, tLObject, tL_error);
                return;
        }
    }
}
