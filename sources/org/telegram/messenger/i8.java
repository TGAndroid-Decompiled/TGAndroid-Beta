package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f17851a;
    public final MediaDataController f17852b;
    public final String f17853c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17851a = i10;
        this.f17852b = mediaDataController;
        this.f17853c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17851a) {
            case 0:
                this.f17852b.lambda$processLoadedDiceStickers$87(this.f17853c, this.d);
                return;
            default:
                this.f17852b.lambda$loadStickersByEmojiOrName$83(this.f17853c, this.d);
                return;
        }
    }
}
