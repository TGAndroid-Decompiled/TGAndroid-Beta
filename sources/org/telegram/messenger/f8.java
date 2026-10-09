package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f17815a;
    public final MediaDataController f17816b;
    public final String f17817c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17815a = i10;
        this.f17816b = mediaDataController;
        this.f17817c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17815a) {
            case 0:
                this.f17816b.lambda$processLoadedDiceStickers$87(this.f17817c, this.d);
                return;
            default:
                this.f17816b.lambda$loadStickersByEmojiOrName$83(this.f17817c, this.d);
                return;
        }
    }
}
