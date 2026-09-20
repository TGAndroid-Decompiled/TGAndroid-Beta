package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f16172a;
    public final MediaDataController f16173b;
    public final TLRPC.TL_messages_stickerSet f16174c;

    public d7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f16172a = i10;
        this.f16173b = mediaDataController;
        this.f16174c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f16172a) {
            case 0:
                this.f16173b.lambda$saveStickerSetIntoCache$40(this.f16174c);
                return;
            case 1:
                this.f16173b.lambda$loadGroupStickerSet$45(this.f16174c);
                return;
            case 2:
                this.f16173b.lambda$loadGroupStickerSet$43(this.f16174c);
                return;
            case 3:
                this.f16173b.lambda$putSetToCache$47(this.f16174c);
                return;
            default:
                this.f16173b.lambda$replaceStickerSet$28(this.f16174c);
                return;
        }
    }
}
