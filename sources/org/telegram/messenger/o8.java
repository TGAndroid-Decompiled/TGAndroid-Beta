package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f18454a;
    public final MediaDataController f18455b;
    public final TLRPC.TL_messages_stickerSet f18456c;
    public final String d;
    public final Utilities.Callback f18457e;
    public final boolean f18458f;
    public final TLRPC.InputStickerSet h;

    public o8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18454a = i10;
        this.f18455b = mediaDataController;
        this.f18456c = tL_messages_stickerSet;
        this.d = str;
        this.f18457e = callback;
        this.f18458f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18454a) {
            case 0:
                this.f18455b.lambda$getStickerSet$33(this.f18456c, this.d, this.f18457e, this.f18458f, this.h);
                return;
            default:
                this.f18455b.lambda$getStickerSet$36(this.f18456c, this.d, this.f18457e, this.f18458f, this.h);
                return;
        }
    }
}
