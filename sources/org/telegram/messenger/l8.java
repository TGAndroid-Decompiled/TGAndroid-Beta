package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f16904a;
    public final MediaDataController f16905b;
    public final TLRPC.TL_messages_stickerSet f16906c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f16907f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f16904a = i10;
        this.f16905b = mediaDataController;
        this.f16906c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f16907f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f16904a) {
            case 0:
                this.f16905b.lambda$getStickerSet$33(this.f16906c, this.d, this.e, this.f16907f, this.h);
                return;
            default:
                this.f16905b.lambda$getStickerSet$36(this.f16906c, this.d, this.e, this.f16907f, this.h);
                return;
        }
    }
}
