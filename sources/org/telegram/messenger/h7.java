package org.telegram.messenger;
public final class h7 implements Runnable {
    public final int f16533a;
    public final MediaDataController f16534b;
    public final long f16535c;
    public final long d;
    public final int[] e;

    public h7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f16533a = i10;
        this.f16534b = mediaDataController;
        this.f16535c = j3;
        this.d = j10;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16533a) {
            case 0:
                this.f16534b.lambda$getMediaCounts$128(this.f16535c, this.d, this.e);
                return;
            case 1:
                this.f16534b.lambda$getMediaCounts$127(this.f16535c, this.d, this.e);
                return;
            default:
                this.f16534b.lambda$getMediaCounts$130(this.f16535c, this.d, this.e);
                return;
        }
    }
}
