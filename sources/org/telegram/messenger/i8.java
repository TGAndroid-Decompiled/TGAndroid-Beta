package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f17951a;
    public final MediaDataController f17952b;
    public final String f17953c;
    public final boolean d;

    public i8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f17951a = i10;
        this.f17952b = mediaDataController;
        this.f17953c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17951a) {
            case 0:
                this.f17952b.lambda$processLoadedDiceStickers$87(this.f17953c, this.d);
                return;
            default:
                this.f17952b.lambda$loadStickersByEmojiOrName$83(this.f17953c, this.d);
                return;
        }
    }
}
