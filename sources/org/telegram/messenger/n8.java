package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f17010a;
    public final MediaDataController f17011b;
    public final int f17012c;

    public n8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17010a = i11;
        this.f17011b = mediaDataController;
        this.f17012c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17010a) {
            case 0:
                this.f17011b.lambda$processLoadedStickers$103(this.f17012c);
                return;
            default:
                this.f17011b.lambda$fetchEmojiStatuses$231(this.f17012c);
                return;
        }
    }
}
