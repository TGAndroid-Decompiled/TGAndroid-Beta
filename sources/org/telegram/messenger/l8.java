package org.telegram.messenger;
public final class l8 implements Runnable {
    public final int f20571a;
    public final MediaDataController f20572b;
    public final String f20573c;
    public final boolean d;

    public l8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f20571a = i10;
        this.f20572b = mediaDataController;
        this.f20573c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20571a) {
            case 0:
                this.f20572b.lambda$processLoadedDiceStickers$87(this.f20573c, this.d);
                return;
            default:
                this.f20572b.lambda$loadStickersByEmojiOrName$83(this.f20573c, this.d);
                return;
        }
    }
}
