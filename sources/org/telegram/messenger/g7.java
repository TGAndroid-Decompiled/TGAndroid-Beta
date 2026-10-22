package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g7 implements Runnable {
    public final int f18411a;
    public final MediaDataController f18412b;
    public final TLRPC.TL_messages_stickerSet f18413c;

    public g7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f18411a = i10;
        this.f18412b = mediaDataController;
        this.f18413c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18411a) {
            case 0:
                this.f18412b.lambda$saveStickerSetIntoCache$40(this.f18413c);
                return;
            case 1:
                this.f18412b.lambda$loadGroupStickerSet$45(this.f18413c);
                return;
            case 2:
                this.f18412b.lambda$loadGroupStickerSet$43(this.f18413c);
                return;
            case 3:
                this.f18412b.lambda$putSetToCache$47(this.f18413c);
                return;
            default:
                this.f18412b.lambda$replaceStickerSet$28(this.f18413c);
                return;
        }
    }
}
