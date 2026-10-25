package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r8 implements Runnable {
    public final int f21112a;
    public final MediaDataController f21113b;
    public final TLRPC.TL_messages_stickerSet f21114c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f21115f;
    public final TLRPC.InputStickerSet h;

    public r8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f21112a = i10;
        this.f21113b = mediaDataController;
        this.f21114c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f21115f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f21112a) {
            case 0:
                this.f21113b.lambda$getStickerSet$33(this.f21114c, this.d, this.e, this.f21115f, this.h);
                return;
            default:
                this.f21113b.lambda$getStickerSet$36(this.f21114c, this.d, this.e, this.f21115f, this.h);
                return;
        }
    }
}
