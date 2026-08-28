package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m8 implements Runnable {
    public final int f20947a;
    public final MediaDataController f20948b;
    public final TLRPC.TL_messages_stickerSet f20949c;
    public final String d;
    public final Utilities.Callback f20950e;
    public final boolean f20951f;
    public final TLRPC.InputStickerSet h;

    public m8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i9) {
        this.f20947a = i9;
        this.f20948b = mediaDataController;
        this.f20949c = tL_messages_stickerSet;
        this.d = str;
        this.f20950e = callback;
        this.f20951f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f20947a) {
            case 0:
                this.f20948b.lambda$getStickerSet$33(this.f20949c, this.d, this.f20950e, this.f20951f, this.h);
                return;
            default:
                this.f20948b.lambda$getStickerSet$36(this.f20949c, this.d, this.f20950e, this.f20951f, this.h);
                return;
        }
    }
}
