package org.telegram.messenger;
public final class d8 implements Runnable {
    public final int f17059a;
    public final MediaDataController f17060b;
    public final int f17061c;

    public d8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17059a = i11;
        this.f17060b = mediaDataController;
        this.f17061c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17059a) {
            case 0:
                this.f17060b.lambda$fetchEmojiStatuses$232(this.f17061c);
                return;
            default:
                this.f17060b.lambda$processLoadedStickers$103(this.f17061c);
                return;
        }
    }
}
