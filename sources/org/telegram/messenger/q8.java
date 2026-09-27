package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q8 implements Runnable {
    public final int f17363a;
    public final MediaDataController f17364b;
    public final TLRPC.TL_messages_stickerSet f17365c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f17366f;
    public final TLRPC.InputStickerSet h;

    public q8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f17363a = i10;
        this.f17364b = mediaDataController;
        this.f17365c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f17366f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17363a) {
            case 0:
                this.f17364b.lambda$getStickerSet$33(this.f17365c, this.d, this.e, this.f17366f, this.h);
                return;
            default:
                this.f17364b.lambda$getStickerSet$36(this.f17365c, this.d, this.e, this.f17366f, this.h);
                return;
        }
    }
}
