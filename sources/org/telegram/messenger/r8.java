package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r8 implements Runnable {
    public final int f21414a;
    public final MediaDataController f21415b;
    public final TLRPC.TL_messages_stickerSet f21416c;
    public final String d;
    public final Utilities.Callback f21417e;
    public final boolean f21418f;
    public final TLRPC.InputStickerSet h;

    public r8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f21414a = i10;
        this.f21415b = mediaDataController;
        this.f21416c = tL_messages_stickerSet;
        this.d = str;
        this.f21417e = callback;
        this.f21418f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f21414a) {
            case 0:
                this.f21415b.lambda$getStickerSet$33(this.f21416c, this.d, this.f21417e, this.f21418f, this.h);
                return;
            default:
                this.f21415b.lambda$getStickerSet$36(this.f21416c, this.d, this.f21417e, this.f21418f, this.h);
                return;
        }
    }
}
