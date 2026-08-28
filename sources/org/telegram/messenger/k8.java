package org.telegram.messenger;
public final class k8 implements Runnable {
    public final int f20762a;
    public final MediaDataController f20763b;
    public final int f20764c;

    public k8(MediaDataController mediaDataController, int i9, int i10) {
        this.f20762a = i10;
        this.f20763b = mediaDataController;
        this.f20764c = i9;
    }

    @Override
    public final void run() {
        switch (this.f20762a) {
            case 0:
                this.f20763b.lambda$processLoadedStickers$103(this.f20764c);
                return;
            default:
                this.f20763b.lambda$fetchEmojiStatuses$231(this.f20764c);
                return;
        }
    }
}
