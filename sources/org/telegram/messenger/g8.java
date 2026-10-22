package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f18414a;
    public final MediaDataController f18415b;
    public final int f18416c;

    public g8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18414a = i11;
        this.f18415b = mediaDataController;
        this.f18416c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18414a) {
            case 0:
                this.f18415b.lambda$fetchEmojiStatuses$232(this.f18416c);
                return;
            default:
                this.f18415b.lambda$processLoadedStickers$103(this.f18416c);
                return;
        }
    }
}
