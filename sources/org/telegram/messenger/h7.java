package org.telegram.messenger;
public final class h7 implements Runnable {
    public final int f18026a;
    public final MediaDataController f18027b;
    public final long f18028c;
    public final long d;
    public final int[] f18029e;

    public h7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18026a = i10;
        this.f18027b = mediaDataController;
        this.f18028c = j3;
        this.d = j10;
        this.f18029e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18026a) {
            case 0:
                this.f18027b.lambda$getMediaCounts$128(this.f18028c, this.d, this.f18029e);
                return;
            case 1:
                this.f18027b.lambda$getMediaCounts$127(this.f18028c, this.d, this.f18029e);
                return;
            default:
                this.f18027b.lambda$getMediaCounts$130(this.f18028c, this.d, this.f18029e);
                return;
        }
    }
}
