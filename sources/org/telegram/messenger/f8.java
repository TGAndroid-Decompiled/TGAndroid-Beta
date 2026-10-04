package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f17827a;
    public final MediaDataController f17828b;
    public final String f17829c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17827a = i10;
        this.f17828b = mediaDataController;
        this.f17829c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17827a) {
            case 0:
                this.f17828b.lambda$processLoadedDiceStickers$87(this.f17829c, this.d);
                return;
            default:
                this.f17828b.lambda$loadStickersByEmojiOrName$83(this.f17829c, this.d);
                return;
        }
    }
}
