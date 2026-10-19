package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f18354a;
    public final MediaDataController f18355b;
    public final String f18356c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18354a = i10;
        this.f18355b = mediaDataController;
        this.f18356c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18354a) {
            case 0:
                this.f18355b.lambda$processLoadedDiceStickers$87(this.f18356c, this.d);
                return;
            default:
                this.f18355b.lambda$loadStickersByEmojiOrName$83(this.f18356c, this.d);
                return;
        }
    }
}
