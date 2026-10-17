package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b7 implements Runnable {
    public final int f17921a;
    public final MediaDataController f17922b;
    public final TLRPC.TL_messages_stickerSet f17923c;

    public b7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f17921a = i10;
        this.f17922b = mediaDataController;
        this.f17923c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17921a) {
            case 0:
                this.f17922b.lambda$saveStickerSetIntoCache$40(this.f17923c);
                return;
            case 1:
                this.f17922b.lambda$loadGroupStickerSet$45(this.f17923c);
                return;
            case 2:
                this.f17922b.lambda$loadGroupStickerSet$43(this.f17923c);
                return;
            case 3:
                this.f17922b.lambda$putSetToCache$47(this.f17923c);
                return;
            default:
                this.f17922b.lambda$replaceStickerSet$28(this.f17923c);
                return;
        }
    }
}
