package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f16184a;
    public final MediaDataController f16185b;
    public final TLRPC.TL_messages_stickerSet f16186c;

    public d7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f16184a = i10;
        this.f16185b = mediaDataController;
        this.f16186c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f16184a) {
            case 0:
                this.f16185b.lambda$saveStickerSetIntoCache$40(this.f16186c);
                return;
            case 1:
                this.f16185b.lambda$loadGroupStickerSet$45(this.f16186c);
                return;
            case 2:
                this.f16185b.lambda$loadGroupStickerSet$43(this.f16186c);
                return;
            case 3:
                this.f16185b.lambda$putSetToCache$47(this.f16186c);
                return;
            default:
                this.f16185b.lambda$replaceStickerSet$28(this.f16186c);
                return;
        }
    }
}
