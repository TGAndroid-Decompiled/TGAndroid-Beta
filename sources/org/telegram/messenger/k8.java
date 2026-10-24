package org.telegram.messenger;
public final class k8 implements Runnable {
    public final int f18824a;
    public final MediaDataController f18825b;
    public final String f18826c;
    public final boolean d;

    public k8(MediaDataController mediaDataController, String str, boolean z10, int i10) {
        this.f18824a = i10;
        this.f18825b = mediaDataController;
        this.f18826c = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18824a) {
            case 0:
                this.f18825b.lambda$processLoadedDiceStickers$87(this.f18826c, this.d);
                return;
            default:
                this.f18825b.lambda$loadStickersByEmojiOrName$83(this.f18826c, this.d);
                return;
        }
    }
}
