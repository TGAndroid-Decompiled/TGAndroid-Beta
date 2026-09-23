package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f15923a;
    public final MediaDataController f15924b;
    public final TLRPC.TL_messages_stickerSet f15925c;

    public d7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f15923a = i10;
        this.f15924b = mediaDataController;
        this.f15925c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f15923a) {
            case 0:
                this.f15924b.lambda$saveStickerSetIntoCache$40(this.f15925c);
                return;
            case 1:
                this.f15924b.lambda$loadGroupStickerSet$45(this.f15925c);
                return;
            case 2:
                this.f15924b.lambda$loadGroupStickerSet$43(this.f15925c);
                return;
            case 3:
                this.f15924b.lambda$putSetToCache$47(this.f15925c);
                return;
            default:
                this.f15924b.lambda$replaceStickerSet$28(this.f15925c);
                return;
        }
    }
}
