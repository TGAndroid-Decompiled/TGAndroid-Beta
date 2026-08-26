package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda466 implements RequestDelegate {
    public final int $r8$classId;
    public final BaseController f$0;
    public final boolean f$1;
    public final long f$2;

    public MessagesController$$ExternalSyntheticLambda466(BaseController baseController, boolean z, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = z;
        this.f$2 = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$getChannelRecommendations$482(this.f$1, this.f$2, tLObject, tL_error);
                break;
            default:
                ((MediaDataController) this.f$0).lambda$loadFeaturedStickers$58(this.f$1, this.f$2, tLObject, tL_error);
                break;
        }
    }
}
