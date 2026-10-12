package org.telegram.messenger;
public final class d8 implements Runnable {
    public final int f17388a;
    public final MediaDataController f17389b;
    public final int f17390c;

    public d8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17388a = i11;
        this.f17389b = mediaDataController;
        this.f17390c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17388a) {
            case 0:
                this.f17389b.lambda$fetchEmojiStatuses$232(this.f17390c);
                return;
            default:
                this.f17389b.lambda$processLoadedStickers$103(this.f17390c);
                return;
        }
    }
}
