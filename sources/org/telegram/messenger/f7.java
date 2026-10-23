package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class f7 implements Runnable {
    public final int f18342a;
    public final MediaDataController f18343b;
    public final TLRPC.TL_messages_stickerSet f18344c;

    public f7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f18342a = i10;
        this.f18343b = mediaDataController;
        this.f18344c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18342a) {
            case 0:
                this.f18343b.lambda$saveStickerSetIntoCache$40(this.f18344c);
                return;
            case 1:
                this.f18343b.lambda$loadGroupStickerSet$45(this.f18344c);
                return;
            case 2:
                this.f18343b.lambda$loadGroupStickerSet$43(this.f18344c);
                return;
            case 3:
                this.f18343b.lambda$putSetToCache$47(this.f18344c);
                return;
            default:
                this.f18343b.lambda$replaceStickerSet$28(this.f18344c);
                return;
        }
    }
}
