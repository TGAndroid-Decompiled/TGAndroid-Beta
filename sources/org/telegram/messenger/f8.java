package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f18349a;
    public final MediaDataController f18350b;
    public final String f18351c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18349a = i10;
        this.f18350b = mediaDataController;
        this.f18351c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18349a) {
            case 0:
                this.f18350b.lambda$processLoadedDiceStickers$87(this.f18351c, this.d);
                return;
            default:
                this.f18350b.lambda$loadStickersByEmojiOrName$83(this.f18351c, this.d);
                return;
        }
    }
}
