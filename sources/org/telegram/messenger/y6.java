package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f18191a;
    public final MediaDataController f18192b;
    public final TLRPC.TL_messages_stickerSet f18193c;

    public y6(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f18191a = i10;
        this.f18192b = mediaDataController;
        this.f18193c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18191a) {
            case 0:
                this.f18192b.lambda$saveStickerSetIntoCache$40(this.f18193c);
                return;
            case 1:
                this.f18192b.lambda$loadGroupStickerSet$45(this.f18193c);
                return;
            case 2:
                this.f18192b.lambda$loadGroupStickerSet$43(this.f18193c);
                return;
            case 3:
                this.f18192b.lambda$putSetToCache$47(this.f18193c);
                return;
            default:
                this.f18192b.lambda$replaceStickerSet$28(this.f18193c);
                return;
        }
    }
}
