package org.telegram.messenger;
public final class j7 implements Runnable {
    public final int f18686a;
    public final MediaDataController f18687b;
    public final long f18688c;
    public final long d;
    public final int[] e;

    public j7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f18686a = i10;
        this.f18687b = mediaDataController;
        this.f18688c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18686a) {
            case 0:
                this.f18687b.lambda$getMediaCounts$128(this.f18688c, this.d, this.e);
                return;
            case 1:
                this.f18687b.lambda$getMediaCounts$127(this.f18688c, this.d, this.e);
                return;
            default:
                this.f18687b.lambda$getMediaCounts$130(this.f18688c, this.d, this.e);
                return;
        }
    }
}
