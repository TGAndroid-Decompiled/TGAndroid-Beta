package org.telegram.messenger;
public final class p8 implements Runnable {
    public final int f21237a;
    public final MediaDataController f21238b;
    public final int f21239c;

    public p8(MediaDataController mediaDataController, int i10, int i11) {
        this.f21237a = i11;
        this.f21238b = mediaDataController;
        this.f21239c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21237a) {
            case 0:
                this.f21238b.lambda$processLoadedStickers$103(this.f21239c);
                return;
            default:
                this.f21238b.lambda$fetchEmojiStatuses$231(this.f21239c);
                return;
        }
    }
}
