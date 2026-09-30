package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f18192a;
    public final MediaDataController f18193b;
    public final TLRPC.TL_messages_stickerSet f18194c;

    public y6(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f18192a = i10;
        this.f18193b = mediaDataController;
        this.f18194c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18192a) {
            case 0:
                this.f18193b.lambda$saveStickerSetIntoCache$40(this.f18194c);
                return;
            case 1:
                this.f18193b.lambda$loadGroupStickerSet$45(this.f18194c);
                return;
            case 2:
                this.f18193b.lambda$loadGroupStickerSet$43(this.f18194c);
                return;
            case 3:
                this.f18193b.lambda$putSetToCache$47(this.f18194c);
                return;
            default:
                this.f18193b.lambda$replaceStickerSet$28(this.f18194c);
                return;
        }
    }
}
