package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f17336a;
    public final MediaDataController f17337b;
    public final TLRPC.TL_messages_stickerSet f17338c;

    public c7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f17336a = i10;
        this.f17337b = mediaDataController;
        this.f17338c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17336a) {
            case 0:
                this.f17337b.lambda$saveStickerSetIntoCache$40(this.f17338c);
                return;
            case 1:
                this.f17337b.lambda$loadGroupStickerSet$45(this.f17338c);
                return;
            case 2:
                this.f17337b.lambda$loadGroupStickerSet$43(this.f17338c);
                return;
            case 3:
                this.f17337b.lambda$putSetToCache$47(this.f17338c);
                return;
            default:
                this.f17337b.lambda$replaceStickerSet$28(this.f17338c);
                return;
        }
    }
}
