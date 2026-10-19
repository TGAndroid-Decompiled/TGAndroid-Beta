package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18849a;
    public final MediaDataController f18850b;
    public final TLRPC.TL_messages_stickerSet f18851c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f18852f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18849a = i10;
        this.f18850b = mediaDataController;
        this.f18851c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f18852f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18849a) {
            case 0:
                this.f18850b.lambda$getStickerSet$33(this.f18851c, this.d, this.e, this.f18852f, this.h);
                return;
            default:
                this.f18850b.lambda$getStickerSet$36(this.f18851c, this.d, this.e, this.f18852f, this.h);
                return;
        }
    }
}
