package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f18023a;
    public final MediaDataController f18024b;
    public final TLRPC.TL_messages_stickerSet f18025c;

    public c7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f18023a = i10;
        this.f18024b = mediaDataController;
        this.f18025c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18023a) {
            case 0:
                this.f18024b.lambda$saveStickerSetIntoCache$40(this.f18025c);
                return;
            case 1:
                this.f18024b.lambda$loadGroupStickerSet$45(this.f18025c);
                return;
            case 2:
                this.f18024b.lambda$loadGroupStickerSet$43(this.f18025c);
                return;
            case 3:
                this.f18024b.lambda$putSetToCache$47(this.f18025c);
                return;
            default:
                this.f18024b.lambda$replaceStickerSet$28(this.f18025c);
                return;
        }
    }
}
