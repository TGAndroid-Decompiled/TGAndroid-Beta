package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f17363a;
    public final MediaDataController f17364b;
    public final TLRPC.TL_messages_stickerSet f17365c;

    public c7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f17363a = i10;
        this.f17364b = mediaDataController;
        this.f17365c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17363a) {
            case 0:
                this.f17364b.lambda$saveStickerSetIntoCache$40(this.f17365c);
                return;
            case 1:
                this.f17364b.lambda$loadGroupStickerSet$45(this.f17365c);
                return;
            case 2:
                this.f17364b.lambda$loadGroupStickerSet$43(this.f17365c);
                return;
            case 3:
                this.f17364b.lambda$putSetToCache$47(this.f17365c);
                return;
            default:
                this.f17364b.lambda$replaceStickerSet$28(this.f17365c);
                return;
        }
    }
}
