package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f18160a;
    public final MediaDataController f18161b;
    public final TLRPC.TL_messages_stickerSet f18162c;

    public d7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f18160a = i10;
        this.f18161b = mediaDataController;
        this.f18162c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18160a) {
            case 0:
                this.f18161b.lambda$saveStickerSetIntoCache$40(this.f18162c);
                return;
            case 1:
                this.f18161b.lambda$loadGroupStickerSet$45(this.f18162c);
                return;
            case 2:
                this.f18161b.lambda$loadGroupStickerSet$43(this.f18162c);
                return;
            case 3:
                this.f18161b.lambda$putSetToCache$47(this.f18162c);
                return;
            default:
                this.f18161b.lambda$replaceStickerSet$28(this.f18162c);
                return;
        }
    }
}
