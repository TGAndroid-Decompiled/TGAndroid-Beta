package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f18455a;
    public final MediaDataController f18456b;
    public final TLRPC.TL_messages_stickerSet f18457c;
    public final String d;
    public final Utilities.Callback f18458e;
    public final boolean f18459f;
    public final TLRPC.InputStickerSet h;

    public o8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18455a = i10;
        this.f18456b = mediaDataController;
        this.f18457c = tL_messages_stickerSet;
        this.d = str;
        this.f18458e = callback;
        this.f18459f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18455a) {
            case 0:
                this.f18456b.lambda$getStickerSet$33(this.f18457c, this.d, this.f18458e, this.f18459f, this.h);
                return;
            default:
                this.f18456b.lambda$getStickerSet$36(this.f18457c, this.d, this.f18458e, this.f18459f, this.h);
                return;
        }
    }
}
