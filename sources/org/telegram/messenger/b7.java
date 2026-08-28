package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b7 implements Runnable {
    public final int f19810a;
    public final MediaDataController f19811b;
    public final TLRPC.TL_messages_stickerSet f19812c;

    public b7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i9) {
        this.f19810a = i9;
        this.f19811b = mediaDataController;
        this.f19812c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f19810a) {
            case 0:
                this.f19811b.lambda$saveStickerSetIntoCache$40(this.f19812c);
                return;
            case 1:
                this.f19811b.lambda$loadGroupStickerSet$45(this.f19812c);
                return;
            case 2:
                this.f19811b.lambda$loadGroupStickerSet$43(this.f19812c);
                return;
            case 3:
                this.f19811b.lambda$putSetToCache$47(this.f19812c);
                return;
            default:
                this.f19811b.lambda$replaceStickerSet$28(this.f19812c);
                return;
        }
    }
}
