package org.telegram.messenger;
public final class m7 implements Runnable {
    public final int f16916a;
    public final MediaDataController f16917b;
    public final long f16918c;
    public final long d;
    public final int[] e;

    public m7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f16916a = i10;
        this.f16917b = mediaDataController;
        this.f16918c = j3;
        this.d = j10;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16916a) {
            case 0:
                this.f16917b.lambda$getMediaCounts$128(this.f16918c, this.d, this.e);
                return;
            case 1:
                this.f16917b.lambda$getMediaCounts$127(this.f16918c, this.d, this.e);
                return;
            default:
                this.f16917b.lambda$getMediaCounts$130(this.f16918c, this.d, this.e);
                return;
        }
    }
}
