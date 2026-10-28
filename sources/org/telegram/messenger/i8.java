package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f20315a;
    public final MediaDataController f20316b;
    public final int f20317c;

    public i8(MediaDataController mediaDataController, int i10, int i11) {
        this.f20315a = i11;
        this.f20316b = mediaDataController;
        this.f20317c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20315a) {
            case 0:
                this.f20316b.lambda$fetchEmojiStatuses$232(this.f20317c);
                return;
            default:
                this.f20316b.lambda$processLoadedStickers$103(this.f20317c);
                return;
        }
    }
}
