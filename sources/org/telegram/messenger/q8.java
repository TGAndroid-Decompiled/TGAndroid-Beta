package org.telegram.messenger;
public final class q8 implements Runnable {
    public final int f19760a;
    public final MediaDataController f19761b;
    public final int f19762c;

    public q8(MediaDataController mediaDataController, int i10, int i11) {
        this.f19760a = i11;
        this.f19761b = mediaDataController;
        this.f19762c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19760a) {
            case 0:
                this.f19761b.lambda$processLoadedStickers$103(this.f19762c);
                return;
            default:
                this.f19761b.lambda$fetchEmojiStatuses$231(this.f19762c);
                return;
        }
    }
}
