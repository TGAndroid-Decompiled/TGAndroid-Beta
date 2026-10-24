package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f18480a;
    public final MediaDataController f18481b;
    public final int f18482c;

    public g8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18480a = i11;
        this.f18481b = mediaDataController;
        this.f18482c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18480a) {
            case 0:
                this.f18481b.lambda$fetchEmojiStatuses$232(this.f18482c);
                return;
            default:
                this.f18481b.lambda$processLoadedStickers$103(this.f18482c);
                return;
        }
    }
}
