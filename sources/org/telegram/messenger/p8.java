package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f17238a;
    public final MediaDataController f17239b;
    public final TLRPC.TL_messages_stickerSet f17240c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f17241f;
    public final TLRPC.InputStickerSet h;

    public p8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f17238a = i10;
        this.f17239b = mediaDataController;
        this.f17240c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f17241f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17238a) {
            case 0:
                this.f17239b.lambda$getStickerSet$33(this.f17240c, this.d, this.e, this.f17241f, this.h);
                return;
            default:
                this.f17239b.lambda$getStickerSet$36(this.f17240c, this.d, this.e, this.f17241f, this.h);
                return;
        }
    }
}
