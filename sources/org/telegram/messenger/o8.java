package org.telegram.messenger;
public final class o8 implements Runnable {
    public final int f17175a;
    public final MediaDataController f17176b;
    public final int f17177c;

    public o8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17175a = i11;
        this.f17176b = mediaDataController;
        this.f17177c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17175a) {
            case 0:
                this.f17176b.lambda$processLoadedStickers$103(this.f17177c);
                return;
            default:
                this.f17176b.lambda$fetchEmojiStatuses$231(this.f17177c);
                return;
        }
    }
}
