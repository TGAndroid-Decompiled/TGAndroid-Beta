package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q8 implements Runnable {
    public final int f17114a;
    public final MediaDataController f17115b;
    public final TLRPC.TL_messages_stickerSet f17116c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f17117f;
    public final TLRPC.InputStickerSet h;

    public q8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f17114a = i10;
        this.f17115b = mediaDataController;
        this.f17116c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f17117f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17114a) {
            case 0:
                this.f17115b.lambda$getStickerSet$33(this.f17116c, this.d, this.e, this.f17117f, this.h);
                return;
            default:
                this.f17115b.lambda$getStickerSet$36(this.f17116c, this.d, this.e, this.f17117f, this.h);
                return;
        }
    }
}
