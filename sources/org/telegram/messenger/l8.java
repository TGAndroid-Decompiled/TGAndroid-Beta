package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f16903a;
    public final MediaDataController f16904b;
    public final TLRPC.TL_messages_stickerSet f16905c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f16906f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f16903a = i10;
        this.f16904b = mediaDataController;
        this.f16905c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f16906f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f16903a) {
            case 0:
                this.f16904b.lambda$getStickerSet$33(this.f16905c, this.d, this.e, this.f16906f, this.h);
                return;
            default:
                this.f16904b.lambda$getStickerSet$36(this.f16905c, this.d, this.e, this.f16906f, this.h);
                return;
        }
    }
}
