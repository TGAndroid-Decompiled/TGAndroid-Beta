package org.telegram.messenger;
public final class m8 implements Runnable {
    public final int f18396a;
    public final MediaDataController f18397b;
    public final int f18398c;

    public m8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18396a = i11;
        this.f18397b = mediaDataController;
        this.f18398c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18396a) {
            case 0:
                this.f18397b.lambda$processLoadedStickers$103(this.f18398c);
                return;
            default:
                this.f18397b.lambda$fetchEmojiStatuses$231(this.f18398c);
                return;
        }
    }
}
