package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f17025a;
    public final MediaDataController f17026b;
    public final TLRPC.TL_messages_stickerSet f17027c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f17028f;
    public final TLRPC.InputStickerSet h;

    public p8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f17025a = i10;
        this.f17026b = mediaDataController;
        this.f17027c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f17028f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17025a) {
            case 0:
                this.f17026b.lambda$getStickerSet$33(this.f17027c, this.d, this.e, this.f17028f, this.h);
                return;
            default:
                this.f17026b.lambda$getStickerSet$36(this.f17027c, this.d, this.e, this.f17028f, this.h);
                return;
        }
    }
}
