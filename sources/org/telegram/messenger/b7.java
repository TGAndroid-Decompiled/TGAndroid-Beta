package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b7 implements Runnable {
    public final int f17937a;
    public final MediaDataController f17938b;
    public final TLRPC.TL_messages_stickerSet f17939c;

    public b7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f17937a = i10;
        this.f17938b = mediaDataController;
        this.f17939c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17937a) {
            case 0:
                this.f17938b.lambda$saveStickerSetIntoCache$40(this.f17939c);
                return;
            case 1:
                this.f17938b.lambda$loadGroupStickerSet$45(this.f17939c);
                return;
            case 2:
                this.f17938b.lambda$loadGroupStickerSet$43(this.f17939c);
                return;
            case 3:
                this.f17938b.lambda$putSetToCache$47(this.f17939c);
                return;
            default:
                this.f17938b.lambda$replaceStickerSet$28(this.f17939c);
                return;
        }
    }
}
