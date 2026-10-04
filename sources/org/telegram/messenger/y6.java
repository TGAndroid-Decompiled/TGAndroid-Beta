package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f19874a;
    public final MediaDataController f19875b;
    public final TLRPC.TL_messages_stickerSet f19876c;

    public y6(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f19874a = i10;
        this.f19875b = mediaDataController;
        this.f19876c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f19874a) {
            case 0:
                this.f19875b.lambda$saveStickerSetIntoCache$40(this.f19876c);
                return;
            case 1:
                this.f19875b.lambda$loadGroupStickerSet$45(this.f19876c);
                return;
            case 2:
                this.f19875b.lambda$loadGroupStickerSet$43(this.f19876c);
                return;
            case 3:
                this.f19875b.lambda$putSetToCache$47(this.f19876c);
                return;
            default:
                this.f19875b.lambda$replaceStickerSet$28(this.f19876c);
                return;
        }
    }
}
