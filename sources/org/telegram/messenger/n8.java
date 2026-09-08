package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f18472a;
    public final MediaDataController f18473b;
    public final int f18474c;

    public n8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18472a = i11;
        this.f18473b = mediaDataController;
        this.f18474c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18472a) {
            case 0:
                this.f18473b.lambda$processLoadedStickers$103(this.f18474c);
                return;
            default:
                this.f18473b.lambda$fetchEmojiStatuses$231(this.f18474c);
                return;
        }
    }
}
