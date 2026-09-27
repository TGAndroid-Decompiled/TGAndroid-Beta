package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f16634a;
    public final MediaDataController f16635b;
    public final String f16636c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f16634a = i10;
        this.f16635b = mediaDataController;
        this.f16636c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16634a) {
            case 0:
                this.f16635b.lambda$processLoadedDiceStickers$87(this.f16636c, this.d);
                return;
            default:
                this.f16635b.lambda$loadStickersByEmojiOrName$83(this.f16636c, this.d);
                return;
        }
    }
}
