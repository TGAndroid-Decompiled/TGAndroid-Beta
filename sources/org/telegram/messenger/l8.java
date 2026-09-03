package org.telegram.messenger;
public final class l8 implements Runnable {
    public final int f19248a;
    public final MediaDataController f19249b;
    public final String f19250c;
    public final boolean d;

    public l8(MediaDataController mediaDataController, String str, boolean z4, int i10) {
        this.f19248a = i10;
        this.f19249b = mediaDataController;
        this.f19250c = str;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f19248a) {
            case 0:
                this.f19249b.lambda$processLoadedDiceStickers$87(this.f19250c, this.d);
                return;
            default:
                this.f19249b.lambda$loadStickersByEmojiOrName$83(this.f19250c, this.d);
                return;
        }
    }
}
