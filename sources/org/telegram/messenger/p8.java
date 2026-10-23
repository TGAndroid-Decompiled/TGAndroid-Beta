package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p8 implements Runnable {
    public final int f19265a;
    public final MediaDataController f19266b;
    public final TLRPC.TL_messages_stickerSet f19267c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f19268f;
    public final TLRPC.InputStickerSet h;

    public p8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f19265a = i10;
        this.f19266b = mediaDataController;
        this.f19267c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f19268f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f19265a) {
            case 0:
                this.f19266b.lambda$getStickerSet$33(this.f19267c, this.d, this.e, this.f19268f, this.h);
                return;
            default:
                this.f19266b.lambda$getStickerSet$36(this.f19267c, this.d, this.e, this.f19268f, this.h);
                return;
        }
    }
}
