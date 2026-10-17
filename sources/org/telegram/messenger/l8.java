package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18851a;
    public final MediaDataController f18852b;
    public final TLRPC.TL_messages_stickerSet f18853c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f18854f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18851a = i10;
        this.f18852b = mediaDataController;
        this.f18853c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f18854f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18851a) {
            case 0:
                this.f18852b.lambda$getStickerSet$33(this.f18853c, this.d, this.e, this.f18854f, this.h);
                return;
            default:
                this.f18852b.lambda$getStickerSet$36(this.f18853c, this.d, this.e, this.f18854f, this.h);
                return;
        }
    }
}
