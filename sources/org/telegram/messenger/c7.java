package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f17247a;
    public final MediaDataController f17248b;
    public final TLRPC.TL_messages_stickerSet f17249c;

    public c7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f17247a = i10;
        this.f17248b = mediaDataController;
        this.f17249c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17247a) {
            case 0:
                this.f17248b.lambda$saveStickerSetIntoCache$40(this.f17249c);
                return;
            case 1:
                this.f17248b.lambda$loadGroupStickerSet$45(this.f17249c);
                return;
            case 2:
                this.f17248b.lambda$loadGroupStickerSet$43(this.f17249c);
                return;
            case 3:
                this.f17248b.lambda$putSetToCache$47(this.f17249c);
                return;
            default:
                this.f17248b.lambda$replaceStickerSet$28(this.f17249c);
                return;
        }
    }
}
