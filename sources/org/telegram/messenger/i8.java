package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f16388a;
    public final MediaDataController f16389b;
    public final String f16390c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16388a = i10;
        this.f16389b = mediaDataController;
        this.f16390c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16388a) {
            case 0:
                this.f16389b.lambda$processLoadedDiceStickers$87(this.f16390c, this.d);
                return;
            default:
                this.f16389b.lambda$loadStickersByEmojiOrName$83(this.f16390c, this.d);
                return;
        }
    }
}
