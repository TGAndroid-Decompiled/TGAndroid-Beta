package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f16623a;
    public final MediaDataController f16624b;
    public final String f16625c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16623a = i10;
        this.f16624b = mediaDataController;
        this.f16625c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16623a) {
            case 0:
                this.f16624b.lambda$processLoadedDiceStickers$87(this.f16625c, this.d);
                return;
            default:
                this.f16624b.lambda$loadStickersByEmojiOrName$83(this.f16625c, this.d);
                return;
        }
    }
}
