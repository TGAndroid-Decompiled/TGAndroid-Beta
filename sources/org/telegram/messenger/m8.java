package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m8 implements Runnable {
    public final int f18930a;
    public final MediaDataController f18931b;
    public final TLRPC.TL_messages_stickerSet f18932c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f18933f;
    public final TLRPC.InputStickerSet h;

    public m8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18930a = i10;
        this.f18931b = mediaDataController;
        this.f18932c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f18933f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18930a) {
            case 0:
                this.f18931b.lambda$getStickerSet$33(this.f18932c, this.d, this.e, this.f18933f, this.h);
                return;
            default:
                this.f18931b.lambda$getStickerSet$36(this.f18932c, this.d, this.e, this.f18933f, this.h);
                return;
        }
    }
}
