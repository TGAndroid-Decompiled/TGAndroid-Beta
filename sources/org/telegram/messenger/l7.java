package org.telegram.messenger;
public final class l7 implements Runnable {
    public final int f18149a;
    public final MediaDataController f18150b;
    public final long f18151c;
    public final long d;
    public final int[] f18152e;

    public l7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18149a = i10;
        this.f18150b = mediaDataController;
        this.f18151c = j3;
        this.d = j10;
        this.f18152e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18149a) {
            case 0:
                this.f18150b.lambda$getMediaCounts$128(this.f18151c, this.d, this.f18152e);
                return;
            case 1:
                this.f18150b.lambda$getMediaCounts$127(this.f18151c, this.d, this.f18152e);
                return;
            default:
                this.f18150b.lambda$getMediaCounts$130(this.f18151c, this.d, this.f18152e);
                return;
        }
    }
}
