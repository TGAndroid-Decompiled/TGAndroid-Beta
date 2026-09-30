package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f18207a;
    public final MediaDataController f18208b;
    public final TLRPC.TL_messages_stickerSet f18209c;

    public y6(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f18207a = i10;
        this.f18208b = mediaDataController;
        this.f18209c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18207a) {
            case 0:
                this.f18208b.lambda$saveStickerSetIntoCache$40(this.f18209c);
                return;
            case 1:
                this.f18208b.lambda$loadGroupStickerSet$45(this.f18209c);
                return;
            case 2:
                this.f18208b.lambda$loadGroupStickerSet$43(this.f18209c);
                return;
            case 3:
                this.f18208b.lambda$putSetToCache$47(this.f18209c);
                return;
            default:
                this.f18208b.lambda$replaceStickerSet$28(this.f18209c);
                return;
        }
    }
}
