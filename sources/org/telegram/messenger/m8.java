package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18369a;
    public final MediaDataController f18370b;
    public final int f18371c;

    public m8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18369a = i11;
        this.f18370b = mediaDataController;
        this.f18371c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18369a) {
            case 0:
                this.f18370b.lambda$processLoadedStickers$103(this.f18371c);
                return;
            default:
                this.f18370b.lambda$fetchEmojiStatuses$231(this.f18371c);
                return;
        }
    }
}
