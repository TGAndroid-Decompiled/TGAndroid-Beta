package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f17834a;
    public final MediaDataController f17835b;
    public final String f17836c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17834a = i10;
        this.f17835b = mediaDataController;
        this.f17836c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17834a) {
            case 0:
                this.f17835b.lambda$processLoadedDiceStickers$87(this.f17836c, this.d);
                return;
            default:
                this.f17835b.lambda$loadStickersByEmojiOrName$83(this.f17836c, this.d);
                return;
        }
    }
}
