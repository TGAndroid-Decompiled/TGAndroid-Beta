package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f16920a;
    public final MediaDataController f16921b;
    public final TLRPC.TL_messages_stickerSet f16922c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f16923f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f16920a = i10;
        this.f16921b = mediaDataController;
        this.f16922c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f16923f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f16920a) {
            case 0:
                this.f16921b.lambda$getStickerSet$33(this.f16922c, this.d, this.e, this.f16923f, this.h);
                return;
            default:
                this.f16921b.lambda$getStickerSet$36(this.f16922c, this.d, this.e, this.f16923f, this.h);
                return;
        }
    }
}
