package org.telegram.messenger;
public final class l8 implements Runnable {
    public final int f17741a;
    public final MediaDataController f17742b;
    public final String f17743c;
    public final boolean d;

    public l8(MediaDataController mediaDataController, String str, boolean z4, int i10) {
        this.f17741a = i10;
        this.f17742b = mediaDataController;
        this.f17743c = str;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f17741a) {
            case 0:
                this.f17742b.lambda$processLoadedDiceStickers$87(this.f17743c, this.d);
                return;
            default:
                this.f17742b.lambda$loadStickersByEmojiOrName$83(this.f17743c, this.d);
                return;
        }
    }
}
