package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j7 implements Runnable {
    public final int f15509a;
    public final MediaDataController f15510b;
    public final TLRPC.TL_messages_stickerSet f15511c;

    public j7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f15509a = i10;
        this.f15510b = mediaDataController;
        this.f15511c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f15509a) {
            case 0:
                this.f15510b.lambda$saveStickerSetIntoCache$40(this.f15511c);
                return;
            case 1:
                this.f15510b.lambda$loadGroupStickerSet$45(this.f15511c);
                return;
            case 2:
                this.f15510b.lambda$loadGroupStickerSet$43(this.f15511c);
                return;
            case 3:
                this.f15510b.lambda$putSetToCache$47(this.f15511c);
                return;
            default:
                this.f15510b.lambda$replaceStickerSet$28(this.f15511c);
                return;
        }
    }
}
