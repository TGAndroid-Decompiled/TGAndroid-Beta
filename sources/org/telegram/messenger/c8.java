package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c8 implements RequestDelegate {
    public final int f18036a;
    public final boolean f18037b;
    public final long f18038c;
    public final BaseController d;

    public c8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f18036a = i10;
        this.d = baseController;
        this.f18037b = z10;
        this.f18038c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18036a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f18037b, this.f18038c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.f18037b, this.f18038c, tLObject, tL_error);
                return;
        }
    }
}
