package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f16637a;
    public final MediaDataController f16638b;
    public final String f16639c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16637a = i10;
        this.f16638b = mediaDataController;
        this.f16639c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16637a) {
            case 0:
                this.f16638b.lambda$processLoadedDiceStickers$87(this.f16639c, this.d);
                return;
            default:
                this.f16638b.lambda$loadStickersByEmojiOrName$83(this.f16639c, this.d);
                return;
        }
    }
}
