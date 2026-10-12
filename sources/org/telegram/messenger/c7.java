package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f16940a;
    public final MediaDataController f16941b;
    public final TLRPC.TL_messages_stickerSet f16942c;

    public c7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f16940a = i10;
        this.f16941b = mediaDataController;
        this.f16942c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f16940a) {
            case 0:
                this.f16941b.lambda$saveStickerSetIntoCache$40(this.f16942c);
                return;
            case 1:
                this.f16941b.lambda$loadGroupStickerSet$45(this.f16942c);
                return;
            case 2:
                this.f16941b.lambda$loadGroupStickerSet$43(this.f16942c);
                return;
            case 3:
                this.f16941b.lambda$putSetToCache$47(this.f16942c);
                return;
            default:
                this.f16941b.lambda$replaceStickerSet$28(this.f16942c);
                return;
        }
    }
}
