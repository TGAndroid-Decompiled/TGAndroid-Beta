package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f17034a;
    public final MediaDataController f17035b;
    public final TLRPC.TL_messages_stickerSet f17036c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f17037f;
    public final TLRPC.InputStickerSet h;

    public p8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f17034a = i10;
        this.f17035b = mediaDataController;
        this.f17036c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f17037f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17034a) {
            case 0:
                this.f17035b.lambda$getStickerSet$33(this.f17036c, this.d, this.e, this.f17037f, this.h);
                return;
            default:
                this.f17035b.lambda$getStickerSet$36(this.f17036c, this.d, this.e, this.f17037f, this.h);
                return;
        }
    }
}
