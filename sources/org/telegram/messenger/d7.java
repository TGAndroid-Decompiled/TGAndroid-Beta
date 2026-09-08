package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f17482a;
    public final MediaDataController f17483b;
    public final TLRPC.TL_messages_stickerSet f17484c;

    public d7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f17482a = i10;
        this.f17483b = mediaDataController;
        this.f17484c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17482a) {
            case 0:
                this.f17483b.lambda$saveStickerSetIntoCache$40(this.f17484c);
                return;
            case 1:
                this.f17483b.lambda$loadGroupStickerSet$45(this.f17484c);
                return;
            case 2:
                this.f17483b.lambda$loadGroupStickerSet$43(this.f17484c);
                return;
            case 3:
                this.f17483b.lambda$putSetToCache$47(this.f17484c);
                return;
            default:
                this.f17483b.lambda$replaceStickerSet$28(this.f17484c);
                return;
        }
    }
}
