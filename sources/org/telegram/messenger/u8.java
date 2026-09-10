package org.telegram.messenger;
public final class u8 implements Runnable {
    public final int f16469a;
    public final MediaDataController f16470b;
    public final int f16471c;

    public u8(MediaDataController mediaDataController, int i10, int i11) {
        this.f16469a = i11;
        this.f16470b = mediaDataController;
        this.f16471c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16469a) {
            case 0:
                this.f16470b.lambda$processLoadedStickers$103(this.f16471c);
                return;
            default:
                this.f16470b.lambda$fetchEmojiStatuses$231(this.f16471c);
                return;
        }
    }
}
