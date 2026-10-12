package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f17852a;
    public final MediaDataController f17853b;
    public final String f17854c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17852a = i10;
        this.f17853b = mediaDataController;
        this.f17854c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17852a) {
            case 0:
                this.f17853b.lambda$processLoadedDiceStickers$87(this.f17854c, this.d);
                return;
            default:
                this.f17853b.lambda$loadStickersByEmojiOrName$83(this.f17854c, this.d);
                return;
        }
    }
}
