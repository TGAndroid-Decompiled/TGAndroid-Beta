package org.telegram.messenger;
public final class s7 implements Runnable {
    public final int f16287a;
    public final MediaDataController f16288b;
    public final long f16289c;
    public final long d;
    public final int[] e;

    public s7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f16287a = i10;
        this.f16288b = mediaDataController;
        this.f16289c = j3;
        this.d = j10;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16287a) {
            case 0:
                this.f16288b.lambda$getMediaCounts$128(this.f16289c, this.d, this.e);
                return;
            case 1:
                this.f16288b.lambda$getMediaCounts$127(this.f16289c, this.d, this.e);
                return;
            default:
                this.f16288b.lambda$getMediaCounts$130(this.f16289c, this.d, this.e);
                return;
        }
    }
}
