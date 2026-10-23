package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class f7 implements Runnable {
    public final int f18405a;
    public final MediaDataController f18406b;
    public final TLRPC.TL_messages_stickerSet f18407c;

    public f7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f18405a = i10;
        this.f18406b = mediaDataController;
        this.f18407c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18405a) {
            case 0:
                this.f18406b.lambda$saveStickerSetIntoCache$40(this.f18407c);
                return;
            case 1:
                this.f18406b.lambda$loadGroupStickerSet$45(this.f18407c);
                return;
            case 2:
                this.f18406b.lambda$loadGroupStickerSet$43(this.f18407c);
                return;
            case 3:
                this.f18406b.lambda$putSetToCache$47(this.f18407c);
                return;
            default:
                this.f18406b.lambda$replaceStickerSet$28(this.f18407c);
                return;
        }
    }
}
