package org.telegram.messenger;
public final class q8 implements Runnable {
    public final int f19762a;
    public final MediaDataController f19763b;
    public final int f19764c;

    public q8(MediaDataController mediaDataController, int i10, int i11) {
        this.f19762a = i11;
        this.f19763b = mediaDataController;
        this.f19764c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19762a) {
            case 0:
                this.f19763b.lambda$processLoadedStickers$103(this.f19764c);
                return;
            default:
                this.f19763b.lambda$fetchEmojiStatuses$231(this.f19764c);
                return;
        }
    }
}
