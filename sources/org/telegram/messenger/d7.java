package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f15944a;
    public final MediaDataController f15945b;
    public final TLRPC.TL_messages_stickerSet f15946c;

    public d7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f15944a = i10;
        this.f15945b = mediaDataController;
        this.f15946c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f15944a) {
            case 0:
                this.f15945b.lambda$saveStickerSetIntoCache$40(this.f15946c);
                return;
            case 1:
                this.f15945b.lambda$loadGroupStickerSet$45(this.f15946c);
                return;
            case 2:
                this.f15945b.lambda$loadGroupStickerSet$43(this.f15946c);
                return;
            case 3:
                this.f15945b.lambda$putSetToCache$47(this.f15946c);
                return;
            default:
                this.f15945b.lambda$replaceStickerSet$28(this.f15946c);
                return;
        }
    }
}
