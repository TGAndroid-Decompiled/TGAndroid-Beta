package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda22 implements RequestDelegate {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final int f$1;

    public MediaDataController$$ExternalSyntheticLambda22(MediaDataController mediaDataController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = mediaDataController;
        this.f$1 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fetchEmojiStatuses$233(this.f$1, tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$loadArchivedStickersCount$72(this.f$1, tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$loadRecents$50(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadRecents$51(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
