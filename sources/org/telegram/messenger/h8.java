package org.telegram.messenger;
public final class h8 implements Runnable {
    public final int f17871a;
    public final MediaDataController f17872b;
    public final String f17873c;
    public final boolean d;

    public h8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17871a = i10;
        this.f17872b = mediaDataController;
        this.f17873c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17871a) {
            case 0:
                this.f17872b.lambda$processLoadedDiceStickers$87(this.f17873c, this.d);
                return;
            default:
                this.f17872b.lambda$loadStickersByEmojiOrName$83(this.f17873c, this.d);
                return;
        }
    }
}
