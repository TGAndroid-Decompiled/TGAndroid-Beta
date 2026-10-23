package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f18748a;
    public final MediaDataController f18749b;
    public final String f18750c;
    public final boolean d;

    public j8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18748a = i10;
        this.f18749b = mediaDataController;
        this.f18750c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18748a) {
            case 0:
                this.f18749b.lambda$processLoadedDiceStickers$87(this.f18750c, this.d);
                return;
            default:
                this.f18749b.lambda$loadStickersByEmojiOrName$83(this.f18750c, this.d);
                return;
        }
    }
}
