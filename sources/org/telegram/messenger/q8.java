package org.telegram.messenger;
public final class q8 implements Runnable {
    public final int f18175a;
    public final MediaDataController f18176b;
    public final int f18177c;

    public q8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18175a = i11;
        this.f18176b = mediaDataController;
        this.f18177c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18175a) {
            case 0:
                this.f18176b.lambda$processLoadedStickers$103(this.f18177c);
                return;
            default:
                this.f18176b.lambda$fetchEmojiStatuses$231(this.f18177c);
                return;
        }
    }
}
