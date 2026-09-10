package org.telegram.messenger;
public final class p8 implements Runnable {
    public final int f16038a;
    public final MediaDataController f16039b;
    public final String f16040c;
    public final boolean d;

    public p8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16038a = i10;
        this.f16039b = mediaDataController;
        this.f16040c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16038a) {
            case 0:
                this.f16039b.lambda$processLoadedDiceStickers$87(this.f16040c, this.d);
                return;
            default:
                this.f16039b.lambda$loadStickersByEmojiOrName$83(this.f16040c, this.d);
                return;
        }
    }
}
