package org.telegram.messenger;
public final class d8 implements Runnable {
    public final int f17387a;
    public final MediaDataController f17388b;
    public final int f17389c;

    public d8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17387a = i11;
        this.f17388b = mediaDataController;
        this.f17389c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17387a) {
            case 0:
                this.f17388b.lambda$fetchEmojiStatuses$232(this.f17389c);
                return;
            default:
                this.f17388b.lambda$processLoadedStickers$103(this.f17389c);
                return;
        }
    }
}
