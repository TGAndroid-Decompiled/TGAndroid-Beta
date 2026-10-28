package org.telegram.messenger;
public final class q7 implements Runnable {
    public final int f21023a;
    public final MediaDataController f21024b;
    public final long f21025c;
    public final long d;
    public final int[] e;

    public q7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f21023a = i10;
        this.f21024b = mediaDataController;
        this.f21025c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f21023a) {
            case 0:
                this.f21024b.lambda$getMediaCounts$128(this.f21025c, this.d, this.e);
                return;
            case 1:
                this.f21024b.lambda$getMediaCounts$127(this.f21025c, this.d, this.e);
                return;
            default:
                this.f21024b.lambda$getMediaCounts$130(this.f21025c, this.d, this.e);
                return;
        }
    }
}
