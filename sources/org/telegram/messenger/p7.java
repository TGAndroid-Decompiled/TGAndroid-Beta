package org.telegram.messenger;
public final class p7 implements Runnable {
    public final int f19636a;
    public final MediaDataController f19637b;
    public final long f19638c;
    public final long d;
    public final int[] f19639e;

    public p7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f19636a = i10;
        this.f19637b = mediaDataController;
        this.f19638c = j10;
        this.d = j11;
        this.f19639e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19636a) {
            case 0:
                this.f19637b.lambda$getMediaCounts$128(this.f19638c, this.d, this.f19639e);
                return;
            case 1:
                this.f19637b.lambda$getMediaCounts$127(this.f19638c, this.d, this.f19639e);
                return;
            default:
                this.f19637b.lambda$getMediaCounts$130(this.f19638c, this.d, this.f19639e);
                return;
        }
    }
}
