package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class i7 implements Runnable {
    public final int f20312a;
    public final MediaDataController f20313b;
    public final TLRPC.TL_messages_stickerSet f20314c;

    public i7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f20312a = i10;
        this.f20313b = mediaDataController;
        this.f20314c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f20312a) {
            case 0:
                this.f20313b.lambda$saveStickerSetIntoCache$40(this.f20314c);
                return;
            case 1:
                this.f20313b.lambda$loadGroupStickerSet$45(this.f20314c);
                return;
            case 2:
                this.f20313b.lambda$loadGroupStickerSet$43(this.f20314c);
                return;
            case 3:
                this.f20313b.lambda$putSetToCache$47(this.f20314c);
                return;
            default:
                this.f20313b.lambda$replaceStickerSet$28(this.f20314c);
                return;
        }
    }
}
