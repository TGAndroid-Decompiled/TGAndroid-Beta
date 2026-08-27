package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class p8 implements Runnable {

    public final int f21232a;

    public final MediaDataController f21233b;

    public final TLRPC.TL_messages_stickerSet f21234c;
    public final String d;

    public final Utilities.Callback f21235e;

    public final boolean f21236f;
    public final TLRPC.InputStickerSet h;

    public p8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f21232a = i10;
        this.f21233b = mediaDataController;
        this.f21234c = tL_messages_stickerSet;
        this.d = str;
        this.f21235e = callback;
        this.f21236f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f21232a) {
            case 0:
                this.f21233b.lambda$getStickerSet$33(this.f21234c, this.d, this.f21235e, this.f21236f, this.h);
                break;
            default:
                this.f21233b.lambda$getStickerSet$36(this.f21234c, this.d, this.f21235e, this.f21236f, this.h);
                break;
        }
    }
}
