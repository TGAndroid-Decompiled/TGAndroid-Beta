package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f17978a;
    public final MediaDataController f17979b;
    public final String f17980c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17978a = i10;
        this.f17979b = mediaDataController;
        this.f17980c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17978a) {
            case 0:
                this.f17979b.lambda$processLoadedDiceStickers$87(this.f17980c, this.d);
                return;
            default:
                this.f17979b.lambda$loadStickersByEmojiOrName$83(this.f17980c, this.d);
                return;
        }
    }
}
