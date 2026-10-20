package org.telegram.messenger;
public final class d8 implements Runnable {
    public final int f18163a;
    public final MediaDataController f18164b;
    public final int f18165c;

    public d8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18163a = i11;
        this.f18164b = mediaDataController;
        this.f18165c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18163a) {
            case 0:
                this.f18164b.lambda$fetchEmojiStatuses$232(this.f18165c);
                return;
            default:
                this.f18164b.lambda$processLoadedStickers$103(this.f18165c);
                return;
        }
    }
}
