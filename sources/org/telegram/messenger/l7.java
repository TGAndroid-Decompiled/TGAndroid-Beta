package org.telegram.messenger;
public final class l7 implements Runnable {
    public final int f17753a;
    public final MediaDataController f17754b;
    public final long f17755c;
    public final long d;
    public final int[] e;

    public l7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f17753a = i10;
        this.f17754b = mediaDataController;
        this.f17755c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17753a) {
            case 0:
                this.f17754b.lambda$getMediaCounts$128(this.f17755c, this.d, this.e);
                return;
            case 1:
                this.f17754b.lambda$getMediaCounts$127(this.f17755c, this.d, this.e);
                return;
            default:
                this.f17754b.lambda$getMediaCounts$130(this.f17755c, this.d, this.e);
                return;
        }
    }
}
