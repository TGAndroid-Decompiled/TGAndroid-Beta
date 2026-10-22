package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h8 implements RequestDelegate {
    public final int f18503a;
    public final boolean f18504b;
    public final long f18505c;
    public final BaseController d;

    public h8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f18503a = i10;
        this.d = baseController;
        this.f18504b = z10;
        this.f18505c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18503a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f18504b, this.f18505c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.f18504b, this.f18505c, tLObject, tL_error);
                return;
        }
    }
}
