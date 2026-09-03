package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class g7 implements Runnable {
    public final int f17267a;
    public final MediaDataController f17268b;
    public final TLRPC.TL_messages_stickerSet f17269c;

    public g7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f17267a = i10;
        this.f17268b = mediaDataController;
        this.f17269c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17267a) {
            case 0:
                this.f17268b.lambda$saveStickerSetIntoCache$40(this.f17269c);
                return;
            case 1:
                this.f17268b.lambda$loadGroupStickerSet$45(this.f17269c);
                return;
            case 2:
                this.f17268b.lambda$loadGroupStickerSet$43(this.f17269c);
                return;
            case 3:
                this.f17268b.lambda$putSetToCache$47(this.f17269c);
                return;
            default:
                this.f17268b.lambda$replaceStickerSet$28(this.f17269c);
                return;
        }
    }
}
