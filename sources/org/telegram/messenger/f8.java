package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f20266a;
    public final MediaDataController f20267b;
    public final String f20268c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i9) {
        this.f20266a = i9;
        this.f20267b = mediaDataController;
        this.f20268c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20266a) {
            case 0:
                this.f20267b.lambda$processLoadedDiceStickers$87(this.f20268c, this.d);
                return;
            default:
                this.f20267b.lambda$loadStickersByEmojiOrName$83(this.f20268c, this.d);
                return;
        }
    }
}
