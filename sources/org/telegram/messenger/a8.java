package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a8 implements RequestDelegate {
    public final int f19704a;
    public final boolean f19705b;
    public final long f19706c;
    public final BaseController d;

    public a8(BaseController baseController, boolean z10, long j10, int i9) {
        this.f19704a = i9;
        this.d = baseController;
        this.f19705b = z10;
        this.f19706c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19704a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f19705b, this.f19706c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f19705b, this.f19706c, tLObject, tL_error);
                return;
        }
    }
}
