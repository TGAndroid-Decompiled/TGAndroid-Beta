package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18415a;
    public final MediaDataController f18416b;
    public final TLRPC.TL_messages_stickerSet f18417c;
    public final String d;
    public final Utilities.Callback f18418e;
    public final boolean f18419f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18415a = i10;
        this.f18416b = mediaDataController;
        this.f18417c = tL_messages_stickerSet;
        this.d = str;
        this.f18418e = callback;
        this.f18419f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18415a) {
            case 0:
                this.f18416b.lambda$getStickerSet$33(this.f18417c, this.d, this.f18418e, this.f18419f, this.h);
                return;
            default:
                this.f18416b.lambda$getStickerSet$36(this.f18417c, this.d, this.f18418e, this.f18419f, this.h);
                return;
        }
    }
}
