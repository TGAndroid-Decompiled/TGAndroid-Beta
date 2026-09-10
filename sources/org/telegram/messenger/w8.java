package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Runnable {
    public final int f16849a;
    public final MediaDataController f16850b;
    public final TLRPC.TL_messages_stickerSet f16851c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f16852f;
    public final TLRPC.InputStickerSet h;

    public w8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f16849a = i10;
        this.f16850b = mediaDataController;
        this.f16851c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f16852f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f16849a) {
            case 0:
                this.f16850b.lambda$getStickerSet$33(this.f16851c, this.d, this.e, this.f16852f, this.h);
                return;
            default:
                this.f16850b.lambda$getStickerSet$36(this.f16851c, this.d, this.e, this.f16852f, this.h);
                return;
        }
    }
}
