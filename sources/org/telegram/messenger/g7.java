package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g7 implements Runnable {
    public final int f18739a;
    public final MediaDataController f18740b;
    public final TLRPC.TL_messages_stickerSet f18741c;

    public g7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f18739a = i10;
        this.f18740b = mediaDataController;
        this.f18741c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18739a) {
            case 0:
                this.f18740b.lambda$saveStickerSetIntoCache$40(this.f18741c);
                return;
            case 1:
                this.f18740b.lambda$loadGroupStickerSet$45(this.f18741c);
                return;
            case 2:
                this.f18740b.lambda$loadGroupStickerSet$43(this.f18741c);
                return;
            case 3:
                this.f18740b.lambda$putSetToCache$47(this.f18741c);
                return;
            default:
                this.f18740b.lambda$replaceStickerSet$28(this.f18741c);
                return;
        }
    }
}
