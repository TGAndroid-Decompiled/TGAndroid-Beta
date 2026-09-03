package org.telegram.messenger;
public final class p7 implements Runnable {
    public final int f18063a;
    public final MediaDataController f18064b;
    public final long f18065c;
    public final long d;
    public final int[] e;

    public p7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f18063a = i10;
        this.f18064b = mediaDataController;
        this.f18065c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18063a) {
            case 0:
                this.f18064b.lambda$getMediaCounts$128(this.f18065c, this.d, this.e);
                return;
            case 1:
                this.f18064b.lambda$getMediaCounts$127(this.f18065c, this.d, this.e);
                return;
            default:
                this.f18064b.lambda$getMediaCounts$130(this.f18065c, this.d, this.e);
                return;
        }
    }
}
