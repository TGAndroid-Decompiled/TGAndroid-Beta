package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f18357a;
    public final MediaDataController f18358b;
    public final String f18359c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18357a = i10;
        this.f18358b = mediaDataController;
        this.f18359c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18357a) {
            case 0:
                this.f18358b.lambda$processLoadedDiceStickers$87(this.f18359c, this.d);
                return;
            default:
                this.f18358b.lambda$loadStickersByEmojiOrName$83(this.f18359c, this.d);
                return;
        }
    }
}
