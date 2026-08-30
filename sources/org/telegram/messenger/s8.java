package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f18371a;
    public final MediaDataController f18372b;
    public final TLRPC.TL_messages_stickerSet f18373c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f18374f;
    public final TLRPC.InputStickerSet h;

    public s8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z4, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18371a = i10;
        this.f18372b = mediaDataController;
        this.f18373c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f18374f = z4;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18371a) {
            case 0:
                this.f18372b.lambda$getStickerSet$33(this.f18373c, this.d, this.e, this.f18374f, this.h);
                return;
            default:
                this.f18372b.lambda$getStickerSet$36(this.f18373c, this.d, this.e, this.f18374f, this.h);
                return;
        }
    }
}
