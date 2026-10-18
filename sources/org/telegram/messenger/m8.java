package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m8 implements Runnable {
    public final int f18927a;
    public final MediaDataController f18928b;
    public final TLRPC.TL_messages_stickerSet f18929c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f18930f;
    public final TLRPC.InputStickerSet h;

    public m8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18927a = i10;
        this.f18928b = mediaDataController;
        this.f18929c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f18930f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18927a) {
            case 0:
                this.f18928b.lambda$getStickerSet$33(this.f18929c, this.d, this.e, this.f18930f, this.h);
                return;
            default:
                this.f18928b.lambda$getStickerSet$36(this.f18929c, this.d, this.e, this.f18930f, this.h);
                return;
        }
    }
}
