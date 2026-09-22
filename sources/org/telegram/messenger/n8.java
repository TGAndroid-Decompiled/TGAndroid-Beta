package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f17066a;
    public final MediaDataController f17067b;
    public final int f17068c;

    public n8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17066a = i11;
        this.f17067b = mediaDataController;
        this.f17068c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17066a) {
            case 0:
                this.f17067b.lambda$processLoadedStickers$103(this.f17068c);
                return;
            default:
                this.f17067b.lambda$fetchEmojiStatuses$231(this.f17068c);
                return;
        }
    }
}
