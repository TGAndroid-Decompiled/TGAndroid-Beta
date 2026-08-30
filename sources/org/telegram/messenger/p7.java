package org.telegram.messenger;
public final class p7 implements Runnable {
    public final int f18085a;
    public final MediaDataController f18086b;
    public final long f18087c;
    public final long d;
    public final int[] e;

    public p7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f18085a = i10;
        this.f18086b = mediaDataController;
        this.f18087c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18085a) {
            case 0:
                this.f18086b.lambda$getMediaCounts$128(this.f18087c, this.d, this.e);
                return;
            case 1:
                this.f18086b.lambda$getMediaCounts$127(this.f18087c, this.d, this.e);
                return;
            default:
                this.f18086b.lambda$getMediaCounts$130(this.f18087c, this.d, this.e);
                return;
        }
    }
}
