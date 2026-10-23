package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f18345a;
    public final MediaDataController f18346b;
    public final int f18347c;

    public f8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18345a = i11;
        this.f18346b = mediaDataController;
        this.f18347c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18345a) {
            case 0:
                this.f18346b.lambda$fetchEmojiStatuses$232(this.f18347c);
                return;
            default:
                this.f18346b.lambda$processLoadedStickers$103(this.f18347c);
                return;
        }
    }
}
