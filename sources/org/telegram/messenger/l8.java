package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18411a;
    public final MediaDataController f18412b;
    public final TLRPC.TL_messages_stickerSet f18413c;
    public final String d;
    public final Utilities.Callback f18414e;
    public final boolean f18415f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18411a = i10;
        this.f18412b = mediaDataController;
        this.f18413c = tL_messages_stickerSet;
        this.d = str;
        this.f18414e = callback;
        this.f18415f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18411a) {
            case 0:
                this.f18412b.lambda$getStickerSet$33(this.f18413c, this.d, this.f18414e, this.f18415f, this.h);
                return;
            default:
                this.f18412b.lambda$getStickerSet$36(this.f18413c, this.d, this.f18414e, this.f18415f, this.h);
                return;
        }
    }
}
