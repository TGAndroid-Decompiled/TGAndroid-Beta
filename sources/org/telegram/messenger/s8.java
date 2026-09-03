package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f18351a;
    public final MediaDataController f18352b;
    public final TLRPC.TL_messages_stickerSet f18353c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f18354f;
    public final TLRPC.InputStickerSet h;

    public s8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z4, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f18351a = i10;
        this.f18352b = mediaDataController;
        this.f18353c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f18354f = z4;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f18351a) {
            case 0:
                this.f18352b.lambda$getStickerSet$33(this.f18353c, this.d, this.e, this.f18354f, this.h);
                return;
            default:
                this.f18352b.lambda$getStickerSet$36(this.f18353c, this.d, this.e, this.f18354f, this.h);
                return;
        }
    }
}
