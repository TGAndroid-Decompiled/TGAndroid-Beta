package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class d8 implements RequestDelegate {

    public final int f20028a;

    public final boolean f20029b;

    public final long f20030c;
    public final BaseController d;

    public d8(BaseController baseController, boolean z10, long j10, int i10) {
        this.f20028a = i10;
        this.d = baseController;
        this.f20029b = z10;
        this.f20030c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20028a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.f20029b, this.f20030c, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$482(this.f20029b, this.f20030c, tLObject, tL_error);
                break;
        }
    }
}
