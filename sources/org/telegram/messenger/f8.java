package org.telegram.messenger;
public final class f8 implements Runnable {
    public final int f18408a;
    public final MediaDataController f18409b;
    public final int f18410c;

    public f8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18408a = i11;
        this.f18409b = mediaDataController;
        this.f18410c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18408a) {
            case 0:
                this.f18409b.lambda$fetchEmojiStatuses$232(this.f18410c);
                return;
            default:
                this.f18409b.lambda$processLoadedStickers$103(this.f18410c);
                return;
        }
    }
}
