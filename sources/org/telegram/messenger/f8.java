package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f17833a;
    public final MediaDataController f17834b;
    public final String f17835c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17833a = i10;
        this.f17834b = mediaDataController;
        this.f17835c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17833a) {
            case 0:
                this.f17834b.lambda$processLoadedDiceStickers$87(this.f17835c, this.d);
                return;
            default:
                this.f17834b.lambda$loadStickersByEmojiOrName$83(this.f17835c, this.d);
                return;
        }
    }
}
