package org.telegram.messenger;
public final class l8 implements Runnable {
    public final int f17720a;
    public final MediaDataController f17721b;
    public final String f17722c;
    public final boolean d;

    public l8(MediaDataController mediaDataController, String str, boolean z4, int i10) {
        this.f17720a = i10;
        this.f17721b = mediaDataController;
        this.f17722c = str;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f17720a) {
            case 0:
                this.f17721b.lambda$processLoadedDiceStickers$87(this.f17722c, this.d);
                return;
            default:
                this.f17721b.lambda$loadStickersByEmojiOrName$83(this.f17722c, this.d);
                return;
        }
    }
}
