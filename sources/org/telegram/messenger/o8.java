package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f18579a;
    public final MediaDataController f18580b;
    public final TLRPC.TL_messages_stickerSet f18581c;
    public final String d;
    public final Utilities.Callback f18582e;
    public final boolean f18583f;
    public final TLRPC.InputStickerSet h;

    public o8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18579a = i10;
        this.f18580b = mediaDataController;
        this.f18581c = tL_messages_stickerSet;
        this.d = str;
        this.f18582e = callback;
        this.f18583f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18579a) {
            case 0:
                this.f18580b.lambda$getStickerSet$33(this.f18581c, this.d, this.f18582e, this.f18583f, this.h);
                return;
            default:
                this.f18580b.lambda$getStickerSet$36(this.f18581c, this.d, this.f18582e, this.f18583f, this.h);
                return;
        }
    }
}
