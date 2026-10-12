package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e8 implements RequestDelegate {
    public final int f17489a;
    public final boolean f17490b;
    public final long f17491c;
    public final BaseController d;

    public e8(BaseController baseController, boolean z10, long j3, int i10) {
        this.f17489a = i10;
        this.d = baseController;
        this.f17490b = z10;
        this.f17491c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17489a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f17490b, this.f17491c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.f17490b, this.f17491c, tLObject, tL_error);
                return;
        }
    }
}
