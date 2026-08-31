package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19954a;
    public final MediaDataController f19955b;
    public final TLRPC.TL_messages_stickerSet f19956c;
    public final String d;
    public final Utilities.Callback f19957e;
    public final boolean f19958f;
    public final TLRPC.InputStickerSet h;

    public s8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z4, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f19954a = i10;
        this.f19955b = mediaDataController;
        this.f19956c = tL_messages_stickerSet;
        this.d = str;
        this.f19957e = callback;
        this.f19958f = z4;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f19954a) {
            case 0:
                this.f19955b.lambda$getStickerSet$33(this.f19956c, this.d, this.f19957e, this.f19958f, this.h);
                return;
            default:
                this.f19955b.lambda$getStickerSet$36(this.f19956c, this.d, this.f19957e, this.f19958f, this.h);
                return;
        }
    }
}
