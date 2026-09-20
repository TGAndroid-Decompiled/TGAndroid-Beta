package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f17051a;
    public final MediaDataController f17052b;
    public final int f17053c;

    public n8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17051a = i11;
        this.f17052b = mediaDataController;
        this.f17053c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17051a) {
            case 0:
                this.f17052b.lambda$processLoadedStickers$103(this.f17053c);
                return;
            default:
                this.f17052b.lambda$fetchEmojiStatuses$231(this.f17053c);
                return;
        }
    }
}
