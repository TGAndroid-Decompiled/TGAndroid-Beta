package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda10 implements RequestDelegate {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final String f$1;

    public MediaDataController$$ExternalSyntheticLambda10(MediaDataController mediaDataController, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$verifyAnimatedStickerMessageInternal$70(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$fetchStickerSetInternal$42(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
