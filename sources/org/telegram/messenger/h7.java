package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class h7 implements Runnable {
    public final int f20232a;
    public final MediaDataController f20233b;
    public final TLRPC.TL_messages_stickerSet f20234c;

    public h7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f20232a = i10;
        this.f20233b = mediaDataController;
        this.f20234c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f20232a) {
            case 0:
                this.f20233b.lambda$saveStickerSetIntoCache$40(this.f20234c);
                return;
            case 1:
                this.f20233b.lambda$loadGroupStickerSet$45(this.f20234c);
                return;
            case 2:
                this.f20233b.lambda$loadGroupStickerSet$43(this.f20234c);
                return;
            case 3:
                this.f20233b.lambda$putSetToCache$47(this.f20234c);
                return;
            default:
                this.f20233b.lambda$replaceStickerSet$28(this.f20234c);
                return;
        }
    }
}
