package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f18606a;
    public final MediaDataController f18607b;
    public final TLRPC.TL_messages_stickerSet f18608c;
    public final String d;
    public final Utilities.Callback f18609e;
    public final boolean f18610f;
    public final TLRPC.InputStickerSet h;

    public o8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18606a = i10;
        this.f18607b = mediaDataController;
        this.f18608c = tL_messages_stickerSet;
        this.d = str;
        this.f18609e = callback;
        this.f18610f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18606a) {
            case 0:
                this.f18607b.lambda$getStickerSet$33(this.f18608c, this.d, this.f18609e, this.f18610f, this.h);
                return;
            default:
                this.f18607b.lambda$getStickerSet$36(this.f18608c, this.d, this.f18609e, this.f18610f, this.h);
                return;
        }
    }
}
