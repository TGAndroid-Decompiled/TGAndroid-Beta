package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f16824a;
    public final MediaDataController f16825b;
    public final int f16826c;

    public n8(MediaDataController mediaDataController, int i10, int i11) {
        this.f16824a = i11;
        this.f16825b = mediaDataController;
        this.f16826c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16824a) {
            case 0:
                this.f16825b.lambda$processLoadedStickers$103(this.f16826c);
                return;
            default:
                this.f16825b.lambda$fetchEmojiStatuses$231(this.f16826c);
                return;
        }
    }
}
