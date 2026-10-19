package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f18433a;
    public final MediaDataController f18434b;
    public final String f18435c;
    public final boolean d;

    public g8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18433a = i10;
        this.f18434b = mediaDataController;
        this.f18435c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18433a) {
            case 0:
                this.f18434b.lambda$processLoadedDiceStickers$87(this.f18435c, this.d);
                return;
            default:
                this.f18434b.lambda$loadStickersByEmojiOrName$83(this.f18435c, this.d);
                return;
        }
    }
}
