package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f16622a;
    public final MediaDataController f16623b;
    public final String f16624c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16622a = i10;
        this.f16623b = mediaDataController;
        this.f16624c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16622a) {
            case 0:
                this.f16623b.lambda$processLoadedDiceStickers$87(this.f16624c, this.d);
                return;
            default:
                this.f16623b.lambda$loadStickersByEmojiOrName$83(this.f16624c, this.d);
                return;
        }
    }
}
