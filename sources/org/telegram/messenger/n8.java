package org.telegram.messenger;

public final class n8 implements Runnable {

    public final int f21046a;

    public final MediaDataController f21047b;

    public final int f21048c;

    public n8(MediaDataController mediaDataController, int i10, int i11) {
        this.f21046a = i11;
        this.f21047b = mediaDataController;
        this.f21048c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21046a) {
            case 0:
                this.f21047b.lambda$processLoadedStickers$103(this.f21048c);
                break;
            default:
                this.f21047b.lambda$fetchEmojiStatuses$231(this.f21048c);
                break;
        }
    }
}
