package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f18020a;
    public final MediaDataController f18021b;
    public final TLRPC.TL_messages_stickerSet f18022c;

    public c7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f18020a = i10;
        this.f18021b = mediaDataController;
        this.f18022c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18020a) {
            case 0:
                this.f18021b.lambda$saveStickerSetIntoCache$40(this.f18022c);
                return;
            case 1:
                this.f18021b.lambda$loadGroupStickerSet$45(this.f18022c);
                return;
            case 2:
                this.f18021b.lambda$loadGroupStickerSet$43(this.f18022c);
                return;
            case 3:
                this.f18021b.lambda$putSetToCache$47(this.f18022c);
                return;
            default:
                this.f18021b.lambda$replaceStickerSet$28(this.f18022c);
                return;
        }
    }
}
