package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f16360a;
    public final MediaDataController f16361b;
    public final String f16362c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16360a = i10;
        this.f16361b = mediaDataController;
        this.f16362c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16360a) {
            case 0:
                this.f16361b.lambda$processLoadedDiceStickers$87(this.f16362c, this.d);
                return;
            default:
                this.f16361b.lambda$loadStickersByEmojiOrName$83(this.f16362c, this.d);
                return;
        }
    }
}
