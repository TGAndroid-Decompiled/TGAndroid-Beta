package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19956a;
    public final MediaDataController f19957b;
    public final TLRPC.TL_messages_stickerSet f19958c;
    public final String d;
    public final Utilities.Callback f19959e;
    public final boolean f19960f;
    public final TLRPC.InputStickerSet h;

    public s8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z4, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f19956a = i10;
        this.f19957b = mediaDataController;
        this.f19958c = tL_messages_stickerSet;
        this.d = str;
        this.f19959e = callback;
        this.f19960f = z4;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f19956a) {
            case 0:
                this.f19957b.lambda$getStickerSet$33(this.f19958c, this.d, this.f19959e, this.f19960f, this.h);
                return;
            default:
                this.f19957b.lambda$getStickerSet$36(this.f19958c, this.d, this.f19959e, this.f19960f, this.h);
                return;
        }
    }
}
