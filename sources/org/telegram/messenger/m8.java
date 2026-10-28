package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f20668a;
    public final MediaDataController f20669b;
    public final String f20670c;
    public final boolean d;

    public m8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f20668a = i10;
        this.f20669b = mediaDataController;
        this.f20670c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20668a) {
            case 0:
                this.f20669b.lambda$processLoadedDiceStickers$87(this.f20670c, this.d);
                return;
            default:
                this.f20669b.lambda$loadStickersByEmojiOrName$83(this.f20670c, this.d);
                return;
        }
    }
}
