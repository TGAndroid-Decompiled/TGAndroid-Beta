package org.telegram.messenger;
public final class n8 implements Runnable {
    public final int f18445a;
    public final MediaDataController f18446b;
    public final int f18447c;

    public n8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18445a = i11;
        this.f18446b = mediaDataController;
        this.f18447c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18445a) {
            case 0:
                this.f18446b.lambda$processLoadedStickers$103(this.f18447c);
                return;
            default:
                this.f18446b.lambda$fetchEmojiStatuses$231(this.f18447c);
                return;
        }
    }
}
