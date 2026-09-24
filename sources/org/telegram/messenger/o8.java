package org.telegram.messenger;
public final class o8 implements Runnable {
    public final int f17160a;
    public final MediaDataController f17161b;
    public final int f17162c;

    public o8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17160a = i11;
        this.f17161b = mediaDataController;
        this.f17162c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17160a) {
            case 0:
                this.f17161b.lambda$processLoadedStickers$103(this.f17162c);
                return;
            default:
                this.f17161b.lambda$fetchEmojiStatuses$231(this.f17162c);
                return;
        }
    }
}
