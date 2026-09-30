package org.telegram.messenger;
public final class h7 implements Runnable {
    public final int f16549a;
    public final MediaDataController f16550b;
    public final long f16551c;
    public final long d;
    public final int[] e;

    public h7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f16549a = i10;
        this.f16550b = mediaDataController;
        this.f16551c = j3;
        this.d = j10;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16549a) {
            case 0:
                this.f16550b.lambda$getMediaCounts$128(this.f16551c, this.d, this.e);
                return;
            case 1:
                this.f16550b.lambda$getMediaCounts$127(this.f16551c, this.d, this.e);
                return;
            default:
                this.f16550b.lambda$getMediaCounts$130(this.f16551c, this.d, this.e);
                return;
        }
    }
}
