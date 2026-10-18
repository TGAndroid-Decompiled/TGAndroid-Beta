package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f18430a;
    public final MediaDataController f18431b;
    public final String f18432c;
    public final boolean d;

    public g8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18430a = i10;
        this.f18431b = mediaDataController;
        this.f18432c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18430a) {
            case 0:
                this.f18431b.lambda$processLoadedDiceStickers$87(this.f18432c, this.d);
                return;
            default:
                this.f18431b.lambda$loadStickersByEmojiOrName$83(this.f18432c, this.d);
                return;
        }
    }
}
