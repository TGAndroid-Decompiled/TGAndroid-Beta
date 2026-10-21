package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n8 implements Runnable {
    public final int f19020a;
    public final MediaDataController f19021b;
    public final TLRPC.TL_messages_stickerSet f19022c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f19023f;
    public final TLRPC.InputStickerSet h;

    public n8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f19020a = i10;
        this.f19021b = mediaDataController;
        this.f19022c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f19023f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f19020a) {
            case 0:
                this.f19021b.lambda$getStickerSet$33(this.f19022c, this.d, this.e, this.f19023f, this.h);
                return;
            default:
                this.f19021b.lambda$getStickerSet$36(this.f19022c, this.d, this.e, this.f19023f, this.h);
                return;
        }
    }
}
