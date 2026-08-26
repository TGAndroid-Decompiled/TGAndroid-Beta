package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda114 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final TLRPC.TL_messages_stickerSet f$1;

    public MediaDataController$$ExternalSyntheticLambda114(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$saveStickerSetIntoCache$40(this.f$1);
                break;
            case 1:
                this.f$0.lambda$loadGroupStickerSet$45(this.f$1);
                break;
            case 2:
                this.f$0.lambda$loadGroupStickerSet$43(this.f$1);
                break;
            case 3:
                this.f$0.lambda$putSetToCache$47(this.f$1);
                break;
            default:
                this.f$0.lambda$replaceStickerSet$28(this.f$1);
                break;
        }
    }
}
