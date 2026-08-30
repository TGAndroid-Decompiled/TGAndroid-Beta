package org.telegram.messenger;
public final class q8 implements Runnable {
    public final int f18201a;
    public final MediaDataController f18202b;
    public final int f18203c;

    public q8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18201a = i11;
        this.f18202b = mediaDataController;
        this.f18203c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18201a) {
            case 0:
                this.f18202b.lambda$processLoadedStickers$103(this.f18203c);
                return;
            default:
                this.f18202b.lambda$fetchEmojiStatuses$231(this.f18203c);
                return;
        }
    }
}
