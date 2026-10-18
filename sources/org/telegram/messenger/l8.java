package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18852a;
    public final MediaDataController f18853b;
    public final TLRPC.TL_messages_stickerSet f18854c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f18855f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18852a = i10;
        this.f18853b = mediaDataController;
        this.f18854c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f18855f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18852a) {
            case 0:
                this.f18853b.lambda$getStickerSet$33(this.f18854c, this.d, this.e, this.f18855f, this.h);
                return;
            default:
                this.f18853b.lambda$getStickerSet$36(this.f18854c, this.d, this.e, this.f18855f, this.h);
                return;
        }
    }
}
