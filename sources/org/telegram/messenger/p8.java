package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f18690a;
    public final MediaDataController f18691b;
    public final TLRPC.TL_messages_stickerSet f18692c;
    public final String d;
    public final Utilities.Callback f18693e;
    public final boolean f18694f;
    public final TLRPC.InputStickerSet h;

    public p8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18690a = i10;
        this.f18691b = mediaDataController;
        this.f18692c = tL_messages_stickerSet;
        this.d = str;
        this.f18693e = callback;
        this.f18694f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18690a) {
            case 0:
                this.f18691b.lambda$getStickerSet$33(this.f18692c, this.d, this.f18693e, this.f18694f, this.h);
                return;
            default:
                this.f18691b.lambda$getStickerSet$36(this.f18692c, this.d, this.f18693e, this.f18694f, this.h);
                return;
        }
    }
}
