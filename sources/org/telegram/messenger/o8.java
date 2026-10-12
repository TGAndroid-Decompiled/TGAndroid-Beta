package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f18005a;
    public final MediaDataController f18006b;
    public final TLRPC.TL_messages_stickerSet f18007c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f18008f;
    public final TLRPC.InputStickerSet h;

    public o8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18005a = i10;
        this.f18006b = mediaDataController;
        this.f18007c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f18008f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18005a) {
            case 0:
                this.f18006b.lambda$getStickerSet$33(this.f18007c, this.d, this.e, this.f18008f, this.h);
                return;
            default:
                this.f18006b.lambda$getStickerSet$36(this.f18007c, this.d, this.e, this.f18008f, this.h);
                return;
        }
    }
}
