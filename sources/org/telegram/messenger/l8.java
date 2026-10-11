package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18452a;
    public final MediaDataController f18453b;
    public final TLRPC.TL_messages_stickerSet f18454c;
    public final String d;
    public final Utilities.Callback f18455e;
    public final boolean f18456f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18452a = i10;
        this.f18453b = mediaDataController;
        this.f18454c = tL_messages_stickerSet;
        this.d = str;
        this.f18455e = callback;
        this.f18456f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18452a) {
            case 0:
                this.f18453b.lambda$getStickerSet$33(this.f18454c, this.d, this.f18455e, this.f18456f, this.h);
                return;
            default:
                this.f18453b.lambda$getStickerSet$36(this.f18454c, this.d, this.f18455e, this.f18456f, this.h);
                return;
        }
    }
}
