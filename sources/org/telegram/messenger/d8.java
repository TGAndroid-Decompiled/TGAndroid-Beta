package org.telegram.messenger;
public final class d8 implements Runnable {
    public final int f16756a;
    public final MediaDataController f16757b;
    public final int f16758c;

    public d8(MediaDataController mediaDataController, int i10, int i11) {
        this.f16756a = i11;
        this.f16757b = mediaDataController;
        this.f16758c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16756a) {
            case 0:
                this.f16757b.lambda$fetchEmojiStatuses$232(this.f16758c);
                return;
            default:
                this.f16757b.lambda$processLoadedStickers$103(this.f16758c);
                return;
        }
    }
}
