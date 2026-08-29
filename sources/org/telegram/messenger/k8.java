package org.telegram.messenger;
public final class k8 implements Runnable {
    public final int f20744a;
    public final MediaDataController f20745b;
    public final String f20746c;
    public final boolean d;

    public k8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f20744a = i10;
        this.f20745b = mediaDataController;
        this.f20746c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20744a) {
            case 0:
                this.f20745b.lambda$processLoadedDiceStickers$87(this.f20746c, this.d);
                return;
            default:
                this.f20745b.lambda$loadStickersByEmojiOrName$83(this.f20746c, this.d);
                return;
        }
    }
}
