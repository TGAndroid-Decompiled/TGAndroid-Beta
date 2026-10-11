package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f17818a;
    public final MediaDataController f17819b;
    public final String f17820c;
    public final boolean d;

    public f8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17818a = i10;
        this.f17819b = mediaDataController;
        this.f17820c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                this.f17819b.lambda$processLoadedDiceStickers$87(this.f17820c, this.d);
                return;
            default:
                this.f17819b.lambda$loadStickersByEmojiOrName$83(this.f17820c, this.d);
                return;
        }
    }
}
