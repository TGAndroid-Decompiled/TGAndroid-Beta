package org.telegram.messenger;
public final class h7 implements Runnable {
    public final int f18027a;
    public final MediaDataController f18028b;
    public final long f18029c;
    public final long d;
    public final int[] f18030e;

    public h7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18027a = i10;
        this.f18028b = mediaDataController;
        this.f18029c = j3;
        this.d = j10;
        this.f18030e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18027a) {
            case 0:
                this.f18028b.lambda$getMediaCounts$128(this.f18029c, this.d, this.f18030e);
                return;
            case 1:
                this.f18028b.lambda$getMediaCounts$127(this.f18029c, this.d, this.f18030e);
                return;
            default:
                this.f18028b.lambda$getMediaCounts$130(this.f18029c, this.d, this.f18030e);
                return;
        }
    }
}
