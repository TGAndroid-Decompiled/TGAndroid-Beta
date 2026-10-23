package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f18682a;
    public final MediaDataController f18683b;
    public final String f18684c;
    public final boolean d;

    public j8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18682a = i10;
        this.f18683b = mediaDataController;
        this.f18684c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18682a) {
            case 0:
                this.f18683b.lambda$processLoadedDiceStickers$87(this.f18684c, this.d);
                return;
            default:
                this.f18683b.lambda$loadStickersByEmojiOrName$83(this.f18684c, this.d);
                return;
        }
    }
}
