package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f16837a;
    public final MediaDataController f16838b;
    public final int f16839c;

    public n8(MediaDataController mediaDataController, int i10, int i11) {
        this.f16837a = i11;
        this.f16838b = mediaDataController;
        this.f16839c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16837a) {
            case 0:
                this.f16838b.lambda$processLoadedStickers$103(this.f16839c);
                return;
            default:
                this.f16838b.lambda$fetchEmojiStatuses$231(this.f16839c);
                return;
        }
    }
}
