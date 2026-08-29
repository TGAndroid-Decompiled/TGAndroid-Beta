package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class f7 implements Runnable {
    public final int f20212a;
    public final MediaDataController f20213b;
    public final TLRPC.TL_messages_stickerSet f20214c;

    public f7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f20212a = i10;
        this.f20213b = mediaDataController;
        this.f20214c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f20212a) {
            case 0:
                this.f20213b.lambda$saveStickerSetIntoCache$40(this.f20214c);
                return;
            case 1:
                this.f20213b.lambda$loadGroupStickerSet$45(this.f20214c);
                return;
            case 2:
                this.f20213b.lambda$loadGroupStickerSet$43(this.f20214c);
                return;
            case 3:
                this.f20213b.lambda$putSetToCache$47(this.f20214c);
                return;
            default:
                this.f20213b.lambda$replaceStickerSet$28(this.f20214c);
                return;
        }
    }
}
