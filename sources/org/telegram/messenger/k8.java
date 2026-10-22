package org.telegram.messenger;
public final class k8 implements Runnable {
    public final int f18758a;
    public final MediaDataController f18759b;
    public final String f18760c;
    public final boolean d;

    public k8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18758a = i10;
        this.f18759b = mediaDataController;
        this.f18760c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18758a) {
            case 0:
                this.f18759b.lambda$processLoadedDiceStickers$87(this.f18760c, this.d);
                return;
            default:
                this.f18759b.lambda$loadStickersByEmojiOrName$83(this.f18760c, this.d);
                return;
        }
    }
}
