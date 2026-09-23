package org.telegram.messenger;
public final class o8 implements Runnable {
    public final int f16924a;
    public final MediaDataController f16925b;
    public final int f16926c;

    public o8(MediaDataController mediaDataController, int i10, int i11) {
        this.f16924a = i11;
        this.f16925b = mediaDataController;
        this.f16926c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16924a) {
            case 0:
                this.f16925b.lambda$processLoadedStickers$103(this.f16926c);
                return;
            default:
                this.f16925b.lambda$fetchEmojiStatuses$231(this.f16926c);
                return;
        }
    }
}
