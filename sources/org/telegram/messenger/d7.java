package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class d7 implements Runnable {
    public final int f17455a;
    public final MediaDataController f17456b;
    public final TLRPC.TL_messages_stickerSet f17457c;

    public d7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f17455a = i10;
        this.f17456b = mediaDataController;
        this.f17457c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17455a) {
            case 0:
                this.f17456b.lambda$saveStickerSetIntoCache$40(this.f17457c);
                return;
            case 1:
                this.f17456b.lambda$loadGroupStickerSet$45(this.f17457c);
                return;
            case 2:
                this.f17456b.lambda$loadGroupStickerSet$43(this.f17457c);
                return;
            case 3:
                this.f17456b.lambda$putSetToCache$47(this.f17457c);
                return;
            default:
                this.f17456b.lambda$replaceStickerSet$28(this.f17457c);
                return;
        }
    }
}
