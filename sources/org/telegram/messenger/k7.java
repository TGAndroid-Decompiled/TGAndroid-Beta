package org.telegram.messenger;
public final class k7 implements Runnable {
    public final int f18774a;
    public final MediaDataController f18775b;
    public final long f18776c;
    public final long d;
    public final int[] e;

    public k7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f18774a = i10;
        this.f18775b = mediaDataController;
        this.f18776c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18774a) {
            case 0:
                this.f18775b.lambda$getMediaCounts$128(this.f18776c, this.d, this.e);
                return;
            case 1:
                this.f18775b.lambda$getMediaCounts$127(this.f18776c, this.d, this.e);
                return;
            default:
                this.f18775b.lambda$getMediaCounts$130(this.f18776c, this.d, this.e);
                return;
        }
    }
}
