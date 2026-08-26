package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda39 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final TLRPC.Document f$1;

    public MediaDataController$$ExternalSyntheticLambda39(int i, MediaDataController mediaDataController, TLRPC.Document document) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = document;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$addRecentGif$26(this.f$1);
                break;
            default:
                this.f$0.lambda$removeRecentGif$25(this.f$1);
                break;
        }
    }
}
