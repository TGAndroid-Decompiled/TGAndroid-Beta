package org.telegram.messenger;
public final class p7 implements Runnable {
    public final int f20934a;
    public final MediaDataController f20935b;
    public final long f20936c;
    public final long d;
    public final int[] e;

    public p7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f20934a = i10;
        this.f20935b = mediaDataController;
        this.f20936c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20934a) {
            case 0:
                this.f20935b.lambda$getMediaCounts$128(this.f20936c, this.d, this.e);
                return;
            case 1:
                this.f20935b.lambda$getMediaCounts$127(this.f20936c, this.d, this.e);
                return;
            default:
                this.f20935b.lambda$getMediaCounts$130(this.f20936c, this.d, this.e);
                return;
        }
    }
}
