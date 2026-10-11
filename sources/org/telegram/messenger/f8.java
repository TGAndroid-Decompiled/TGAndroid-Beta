package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f17854a;
    public final MediaDataController f17855b;
    public final String f17856c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17854a = i10;
        this.f17855b = mediaDataController;
        this.f17856c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17854a) {
            case 0:
                this.f17855b.lambda$processLoadedDiceStickers$87(this.f17856c, this.d);
                return;
            default:
                this.f17855b.lambda$loadStickersByEmojiOrName$83(this.f17856c, this.d);
                return;
        }
    }
}
