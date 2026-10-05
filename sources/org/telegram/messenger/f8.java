package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f17832a;
    public final MediaDataController f17833b;
    public final String f17834c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17832a = i10;
        this.f17833b = mediaDataController;
        this.f17834c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17832a) {
            case 0:
                this.f17833b.lambda$processLoadedDiceStickers$87(this.f17834c, this.d);
                return;
            default:
                this.f17833b.lambda$loadStickersByEmojiOrName$83(this.f17834c, this.d);
                return;
        }
    }
}
