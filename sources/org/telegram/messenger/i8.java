package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f17168a;
    public final MediaDataController f17169b;
    public final String f17170c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17168a = i10;
        this.f17169b = mediaDataController;
        this.f17170c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17168a) {
            case 0:
                this.f17169b.lambda$processLoadedDiceStickers$87(this.f17170c, this.d);
                return;
            default:
                this.f17169b.lambda$loadStickersByEmojiOrName$83(this.f17170c, this.d);
                return;
        }
    }
}
