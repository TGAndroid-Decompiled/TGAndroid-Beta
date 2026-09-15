package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f16391a;
    public final MediaDataController f16392b;
    public final String f16393c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16391a = i10;
        this.f16392b = mediaDataController;
        this.f16393c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16391a) {
            case 0:
                this.f16392b.lambda$processLoadedDiceStickers$87(this.f16393c, this.d);
                return;
            default:
                this.f16392b.lambda$loadStickersByEmojiOrName$83(this.f16393c, this.d);
                return;
        }
    }
}
