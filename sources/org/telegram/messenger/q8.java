package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q8 implements Runnable {
    public final int f17367a;
    public final MediaDataController f17368b;
    public final TLRPC.TL_messages_stickerSet f17369c;
    public final String d;
    public final Utilities.Callback e;
    public final boolean f17370f;
    public final TLRPC.InputStickerSet h;

    public q8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.f17367a = i10;
        this.f17368b = mediaDataController;
        this.f17369c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f17370f = z10;
        this.h = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.f17367a) {
            case 0:
                this.f17368b.lambda$getStickerSet$33(this.f17369c, this.d, this.e, this.f17370f, this.h);
                return;
            default:
                this.f17368b.lambda$getStickerSet$36(this.f17369c, this.d, this.e, this.f17370f, this.h);
                return;
        }
    }
}
