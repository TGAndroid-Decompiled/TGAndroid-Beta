package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18440a;
    public final MediaDataController f18441b;
    public final TLRPC.TL_messages_stickerSet f18442c;
    public final String d;
    public final Utilities.Callback f18443e;
    public final boolean f18444f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18440a = i10;
        this.f18441b = mediaDataController;
        this.f18442c = tL_messages_stickerSet;
        this.d = str;
        this.f18443e = callback;
        this.f18444f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18440a) {
            case 0:
                this.f18441b.lambda$getStickerSet$33(this.f18442c, this.d, this.f18443e, this.f18444f, this.h);
                return;
            default:
                this.f18441b.lambda$getStickerSet$36(this.f18442c, this.d, this.f18443e, this.f18444f, this.h);
                return;
        }
    }
}
