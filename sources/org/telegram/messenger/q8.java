package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q8 implements Runnable {
    public final int f19340a;
    public final MediaDataController f19341b;
    public final TLRPC.TL_messages_stickerSet f19342c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f19343f;
    public final TLRPC.InputStickerSet h;

    public q8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f19340a = i10;
        this.f19341b = mediaDataController;
        this.f19342c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f19343f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f19340a) {
            case 0:
                this.f19341b.lambda$getStickerSet$33(this.f19342c, this.d, this.e, this.f19343f, this.h);
                return;
            default:
                this.f19341b.lambda$getStickerSet$36(this.f19342c, this.d, this.e, this.f19343f, this.h);
                return;
        }
    }
}
