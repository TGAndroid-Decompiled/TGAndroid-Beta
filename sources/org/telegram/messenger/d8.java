package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d8 implements RequestDelegate {
    public final int f18162a;
    public final boolean f18163b;
    public final long f18164c;
    public final BaseController d;

    public d8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f18162a = i10;
        this.d = baseController;
        this.f18163b = z10;
        this.f18164c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18162a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f18163b, this.f18164c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.f18163b, this.f18164c, tLObject, tL_error);
                return;
        }
    }
}
