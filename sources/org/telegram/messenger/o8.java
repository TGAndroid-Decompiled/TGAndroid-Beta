package org.telegram.messenger;
public final class o8 implements Runnable {
    public final int f17169a;
    public final MediaDataController f17170b;
    public final int f17171c;

    public o8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17169a = i11;
        this.f17170b = mediaDataController;
        this.f17171c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17169a) {
            case 0:
                this.f17170b.lambda$processLoadedStickers$103(this.f17171c);
                return;
            default:
                this.f17170b.lambda$fetchEmojiStatuses$231(this.f17171c);
                return;
        }
    }
}
