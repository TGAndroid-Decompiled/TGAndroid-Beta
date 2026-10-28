package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f21189a;
    public final MediaDataController f21190b;
    public final TLRPC.TL_messages_stickerSet f21191c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f21192f;
    public final TLRPC.InputStickerSet h;

    public s8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f21189a = i10;
        this.f21190b = mediaDataController;
        this.f21191c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f21192f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f21189a) {
            case 0:
                this.f21190b.lambda$getStickerSet$33(this.f21191c, this.d, this.e, this.f21192f, this.h);
                return;
            default:
                this.f21190b.lambda$getStickerSet$36(this.f21191c, this.d, this.e, this.f21192f, this.h);
                return;
        }
    }
}
