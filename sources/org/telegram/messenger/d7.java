package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f15956a;
    public final MediaDataController f15957b;
    public final TLRPC.TL_messages_stickerSet f15958c;

    public d7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f15956a = i10;
        this.f15957b = mediaDataController;
        this.f15958c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f15956a) {
            case 0:
                this.f15957b.lambda$saveStickerSetIntoCache$40(this.f15958c);
                return;
            case 1:
                this.f15957b.lambda$loadGroupStickerSet$45(this.f15958c);
                return;
            case 2:
                this.f15957b.lambda$loadGroupStickerSet$43(this.f15958c);
                return;
            case 3:
                this.f15957b.lambda$putSetToCache$47(this.f15958c);
                return;
            default:
                this.f15957b.lambda$replaceStickerSet$28(this.f15958c);
                return;
        }
    }
}
