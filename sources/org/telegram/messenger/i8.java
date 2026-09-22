package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f16638a;
    public final MediaDataController f16639b;
    public final String f16640c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16638a = i10;
        this.f16639b = mediaDataController;
        this.f16640c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16638a) {
            case 0:
                this.f16639b.lambda$processLoadedDiceStickers$87(this.f16640c, this.d);
                return;
            default:
                this.f16639b.lambda$loadStickersByEmojiOrName$83(this.f16640c, this.d);
                return;
        }
    }
}
