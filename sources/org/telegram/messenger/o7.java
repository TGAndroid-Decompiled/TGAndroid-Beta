package org.telegram.messenger;
public final class o7 implements Runnable {
    public final int f21123a;
    public final MediaDataController f21124b;
    public final long f21125c;
    public final long d;
    public final int[] f21126e;

    public o7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f21123a = i10;
        this.f21124b = mediaDataController;
        this.f21125c = j10;
        this.d = j11;
        this.f21126e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f21123a) {
            case 0:
                this.f21124b.lambda$getMediaCounts$128(this.f21125c, this.d, this.f21126e);
                return;
            case 1:
                this.f21124b.lambda$getMediaCounts$127(this.f21125c, this.d, this.f21126e);
                return;
            default:
                this.f21124b.lambda$getMediaCounts$130(this.f21125c, this.d, this.f21126e);
                return;
        }
    }
}
