package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class d7 implements Runnable {

    public final int f20025a;

    public final MediaDataController f20026b;

    public final TLRPC.TL_messages_stickerSet f20027c;

    public d7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f20025a = i10;
        this.f20026b = mediaDataController;
        this.f20027c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f20025a) {
            case 0:
                this.f20026b.lambda$saveStickerSetIntoCache$40(this.f20027c);
                break;
            case 1:
                this.f20026b.lambda$loadGroupStickerSet$45(this.f20027c);
                break;
            case 2:
                this.f20026b.lambda$loadGroupStickerSet$43(this.f20027c);
                break;
            case 3:
                this.f20026b.lambda$putSetToCache$47(this.f20027c);
                break;
            default:
                this.f20026b.lambda$replaceStickerSet$28(this.f20027c);
                break;
        }
    }
}
