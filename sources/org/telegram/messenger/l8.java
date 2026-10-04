package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18447a;
    public final MediaDataController f18448b;
    public final TLRPC.TL_messages_stickerSet f18449c;
    public final String d;
    public final Utilities.Callback f18450e;
    public final boolean f18451f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18447a = i10;
        this.f18448b = mediaDataController;
        this.f18449c = tL_messages_stickerSet;
        this.d = str;
        this.f18450e = callback;
        this.f18451f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18447a) {
            case 0:
                this.f18448b.lambda$getStickerSet$33(this.f18449c, this.d, this.f18450e, this.f18451f, this.h);
                return;
            default:
                this.f18448b.lambda$getStickerSet$36(this.f18449c, this.d, this.f18450e, this.f18451f, this.h);
                return;
        }
    }
}
