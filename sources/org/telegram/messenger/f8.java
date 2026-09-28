package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f16359a;
    public final MediaDataController f16360b;
    public final String f16361c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16359a = i10;
        this.f16360b = mediaDataController;
        this.f16361c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16359a) {
            case 0:
                this.f16360b.lambda$processLoadedDiceStickers$87(this.f16361c, this.d);
                return;
            default:
                this.f16360b.lambda$loadStickersByEmojiOrName$83(this.f16361c, this.d);
                return;
        }
    }
}
