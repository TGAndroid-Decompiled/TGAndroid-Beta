package org.telegram.messenger;
public final class h8 implements Runnable {
    public final int f20235a;
    public final MediaDataController f20236b;
    public final int f20237c;

    public h8(MediaDataController mediaDataController, int i10, int i11) {
        this.f20235a = i11;
        this.f20236b = mediaDataController;
        this.f20237c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20235a) {
            case 0:
                this.f20236b.lambda$fetchEmojiStatuses$232(this.f20237c);
                return;
            default:
                this.f20236b.lambda$processLoadedStickers$103(this.f20237c);
                return;
        }
    }
}
