package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f8 implements RequestDelegate {
    public final int f20215a;
    public final boolean f20216b;
    public final long f20217c;
    public final BaseController d;

    public f8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f20215a = i10;
        this.d = baseController;
        this.f20216b = z10;
        this.f20217c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20215a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f20216b, this.f20217c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f20216b, this.f20217c, tLObject, tL_error);
                return;
        }
    }
}
