package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q8 implements Runnable {
    public final int f19273a;
    public final MediaDataController f19274b;
    public final TLRPC.TL_messages_stickerSet f19275c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f19276f;
    public final TLRPC.InputStickerSet h;

    public q8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f19273a = i10;
        this.f19274b = mediaDataController;
        this.f19275c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f19276f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f19273a) {
            case 0:
                this.f19274b.lambda$getStickerSet$33(this.f19275c, this.d, this.e, this.f19276f, this.h);
                return;
            default:
                this.f19274b.lambda$getStickerSet$36(this.f19275c, this.d, this.e, this.f19276f, this.h);
                return;
        }
    }
}
