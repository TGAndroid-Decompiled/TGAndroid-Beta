package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f16828a;
    public final MediaDataController f16829b;
    public final int f16830c;

    public n8(MediaDataController mediaDataController, int i10, int i11) {
        this.f16828a = i11;
        this.f16829b = mediaDataController;
        this.f16830c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16828a) {
            case 0:
                this.f16829b.lambda$processLoadedStickers$103(this.f16830c);
                return;
            default:
                this.f16829b.lambda$fetchEmojiStatuses$231(this.f16830c);
                return;
        }
    }
}
