package org.telegram.messenger;
public final class h8 implements Runnable {
    public final int f18517a;
    public final MediaDataController f18518b;
    public final String f18519c;
    public final boolean d;

    public h8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18517a = i10;
        this.f18518b = mediaDataController;
        this.f18519c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18517a) {
            case 0:
                this.f18518b.lambda$processLoadedDiceStickers$87(this.f18519c, this.d);
                return;
            default:
                this.f18518b.lambda$loadStickersByEmojiOrName$83(this.f18519c, this.d);
                return;
        }
    }
}
