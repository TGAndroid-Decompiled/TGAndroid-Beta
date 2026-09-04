package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f18663a;
    public final MediaDataController f18664b;
    public final TLRPC.TL_messages_stickerSet f18665c;
    public final String d;
    public final Utilities.Callback f18666e;
    public final boolean f18667f;
    public final TLRPC.InputStickerSet h;

    public p8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18663a = i10;
        this.f18664b = mediaDataController;
        this.f18665c = tL_messages_stickerSet;
        this.d = str;
        this.f18666e = callback;
        this.f18667f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18663a) {
            case 0:
                this.f18664b.lambda$getStickerSet$33(this.f18665c, this.d, this.f18666e, this.f18667f, this.h);
                return;
            default:
                this.f18664b.lambda$getStickerSet$36(this.f18665c, this.d, this.f18666e, this.f18667f, this.h);
                return;
        }
    }
}
