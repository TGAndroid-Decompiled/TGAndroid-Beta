package org.telegram.messenger;
public final class l8 implements Runnable {
    public final int f19246a;
    public final MediaDataController f19247b;
    public final String f19248c;
    public final boolean d;

    public l8(MediaDataController mediaDataController, String str, boolean z4, int i10) {
        this.f19246a = i10;
        this.f19247b = mediaDataController;
        this.f19248c = str;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f19246a) {
            case 0:
                this.f19247b.lambda$processLoadedDiceStickers$87(this.f19248c, this.d);
                return;
            default:
                this.f19247b.lambda$loadStickersByEmojiOrName$83(this.f19248c, this.d);
                return;
        }
    }
}
