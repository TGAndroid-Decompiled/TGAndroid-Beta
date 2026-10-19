package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class b7 implements Runnable {
    public final int f17934a;
    public final MediaDataController f17935b;
    public final TLRPC.TL_messages_stickerSet f17936c;

    public b7(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f17934a = i10;
        this.f17935b = mediaDataController;
        this.f17936c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17934a) {
            case 0:
                this.f17935b.lambda$saveStickerSetIntoCache$40(this.f17936c);
                return;
            case 1:
                this.f17935b.lambda$loadGroupStickerSet$45(this.f17936c);
                return;
            case 2:
                this.f17935b.lambda$loadGroupStickerSet$43(this.f17936c);
                return;
            case 3:
                this.f17935b.lambda$putSetToCache$47(this.f17936c);
                return;
            default:
                this.f17935b.lambda$replaceStickerSet$28(this.f17936c);
                return;
        }
    }
}
