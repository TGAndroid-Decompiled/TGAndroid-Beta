package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f17819a;
    public final MediaDataController f17820b;
    public final String f17821c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17819a = i10;
        this.f17820b = mediaDataController;
        this.f17821c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17819a) {
            case 0:
                this.f17820b.lambda$processLoadedDiceStickers$87(this.f17821c, this.d);
                return;
            default:
                this.f17820b.lambda$loadStickersByEmojiOrName$83(this.f17821c, this.d);
                return;
        }
    }
}
