package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f16575a;
    public final MediaDataController f16576b;
    public final String f16577c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16575a = i10;
        this.f16576b = mediaDataController;
        this.f16577c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16575a) {
            case 0:
                this.f16576b.lambda$processLoadedDiceStickers$87(this.f16577c, this.d);
                return;
            default:
                this.f16576b.lambda$loadStickersByEmojiOrName$83(this.f16577c, this.d);
                return;
        }
    }
}
