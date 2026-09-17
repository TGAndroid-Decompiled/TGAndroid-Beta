package org.telegram.messenger;
public final class h8 implements Runnable {
    public final int f17898a;
    public final MediaDataController f17899b;
    public final String f17900c;
    public final boolean d;

    public h8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17898a = i10;
        this.f17899b = mediaDataController;
        this.f17900c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17898a) {
            case 0:
                this.f17899b.lambda$processLoadedDiceStickers$87(this.f17900c, this.d);
                return;
            default:
                this.f17899b.lambda$loadStickersByEmojiOrName$83(this.f17900c, this.d);
                return;
        }
    }
}
