package org.telegram.messenger;

import org.telegram.tgnet.TLObject;

public final class MediaDataController$$ExternalSyntheticLambda75 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final String f$1;
    public final TLObject f$2;

    public MediaDataController$$ExternalSyntheticLambda75(MediaDataController mediaDataController, String str, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = str;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fetchStickerSetInternal$41(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$verifyAnimatedStickerMessageInternal$69(this.f$1, this.f$2);
                break;
        }
    }
}
