package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f17248a;
    public final MediaDataController f17249b;
    public final TLRPC.TL_messages_stickerSet f17250c;

    public c7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f17248a = i10;
        this.f17249b = mediaDataController;
        this.f17250c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17248a) {
            case 0:
                this.f17249b.lambda$saveStickerSetIntoCache$40(this.f17250c);
                return;
            case 1:
                this.f17249b.lambda$loadGroupStickerSet$45(this.f17250c);
                return;
            case 2:
                this.f17249b.lambda$loadGroupStickerSet$43(this.f17250c);
                return;
            case 3:
                this.f17249b.lambda$putSetToCache$47(this.f17250c);
                return;
            default:
                this.f17249b.lambda$replaceStickerSet$28(this.f17250c);
                return;
        }
    }
}
