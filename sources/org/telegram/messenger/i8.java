package org.telegram.messenger;

public final class i8 implements Runnable {

    public final int f20554a;

    public final MediaDataController f20555b;

    public final String f20556c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f20554a = i10;
        this.f20555b = mediaDataController;
        this.f20556c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20554a) {
            case 0:
                this.f20555b.lambda$processLoadedDiceStickers$87(this.f20556c, this.d);
                break;
            default:
                this.f20555b.lambda$loadStickersByEmojiOrName$83(this.f20556c, this.d);
                break;
        }
    }
}
