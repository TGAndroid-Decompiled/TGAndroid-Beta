package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f16376a;
    public final MediaDataController f16377b;
    public final String f16378c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16376a = i10;
        this.f16377b = mediaDataController;
        this.f16378c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16376a) {
            case 0:
                this.f16377b.lambda$processLoadedDiceStickers$87(this.f16378c, this.d);
                return;
            default:
                this.f16377b.lambda$loadStickersByEmojiOrName$83(this.f16378c, this.d);
                return;
        }
    }
}
