package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f17702a;
    public final MediaDataController f17703b;
    public final TLRPC.TL_messages_stickerSet f17704c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f17705f;
    public final TLRPC.InputStickerSet h;

    public o8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f17702a = i10;
        this.f17703b = mediaDataController;
        this.f17704c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f17705f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17702a) {
            case 0:
                this.f17703b.lambda$getStickerSet$33(this.f17704c, this.d, this.e, this.f17705f, this.h);
                return;
            default:
                this.f17703b.lambda$getStickerSet$36(this.f17704c, this.d, this.e, this.f17705f, this.h);
                return;
        }
    }
}
