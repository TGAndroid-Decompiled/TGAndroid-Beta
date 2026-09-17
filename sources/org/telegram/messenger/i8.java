package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f16400a;
    public final MediaDataController f16401b;
    public final String f16402c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16400a = i10;
        this.f16401b = mediaDataController;
        this.f16402c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16400a) {
            case 0:
                this.f16401b.lambda$processLoadedDiceStickers$87(this.f16402c, this.d);
                return;
            default:
                this.f16401b.lambda$loadStickersByEmojiOrName$83(this.f16402c, this.d);
                return;
        }
    }
}
