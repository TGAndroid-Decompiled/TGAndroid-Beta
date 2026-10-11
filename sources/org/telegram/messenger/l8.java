package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18416a;
    public final MediaDataController f18417b;
    public final TLRPC.TL_messages_stickerSet f18418c;
    public final String d;
    public final Utilities.Callback f18419e;
    public final boolean f18420f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18416a = i10;
        this.f18417b = mediaDataController;
        this.f18418c = tL_messages_stickerSet;
        this.d = str;
        this.f18419e = callback;
        this.f18420f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18416a) {
            case 0:
                this.f18417b.lambda$getStickerSet$33(this.f18418c, this.d, this.f18419e, this.f18420f, this.h);
                return;
            default:
                this.f18417b.lambda$getStickerSet$36(this.f18418c, this.d, this.f18419e, this.f18420f, this.h);
                return;
        }
    }
}
