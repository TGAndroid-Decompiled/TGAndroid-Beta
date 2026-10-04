package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18448a;
    public final MediaDataController f18449b;
    public final TLRPC.TL_messages_stickerSet f18450c;
    public final String d;
    public final Utilities.Callback f18451e;
    public final boolean f18452f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18448a = i10;
        this.f18449b = mediaDataController;
        this.f18450c = tL_messages_stickerSet;
        this.d = str;
        this.f18451e = callback;
        this.f18452f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18448a) {
            case 0:
                this.f18449b.lambda$getStickerSet$33(this.f18450c, this.d, this.f18451e, this.f18452f, this.h);
                return;
            default:
                this.f18449b.lambda$getStickerSet$36(this.f18450c, this.d, this.f18451e, this.f18452f, this.h);
                return;
        }
    }
}
