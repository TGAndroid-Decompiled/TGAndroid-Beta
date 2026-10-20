package org.telegram.messenger;
public final class h8 implements Runnable {
    public final int f18520a;
    public final MediaDataController f18521b;
    public final String f18522c;
    public final boolean d;

    public h8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18520a = i10;
        this.f18521b = mediaDataController;
        this.f18522c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18520a) {
            case 0:
                this.f18521b.lambda$processLoadedDiceStickers$87(this.f18522c, this.d);
                return;
            default:
                this.f18521b.lambda$loadStickersByEmojiOrName$83(this.f18522c, this.d);
                return;
        }
    }
}
