package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l8 implements Runnable {
    public final int f18445a;
    public final MediaDataController f18446b;
    public final TLRPC.TL_messages_stickerSet f18447c;
    public final String d;
    public final Utilities.Callback f18448e;
    public final boolean f18449f;
    public final TLRPC.InputStickerSet h;

    public l8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18445a = i10;
        this.f18446b = mediaDataController;
        this.f18447c = tL_messages_stickerSet;
        this.d = str;
        this.f18448e = callback;
        this.f18449f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18445a) {
            case 0:
                this.f18446b.lambda$getStickerSet$33(this.f18447c, this.d, this.f18448e, this.f18449f, this.h);
                return;
            default:
                this.f18446b.lambda$getStickerSet$36(this.f18447c, this.d, this.f18448e, this.f18449f, this.h);
                return;
        }
    }
}
