package org.telegram.messenger;
public final class m7 implements Runnable {
    public final int f16735a;
    public final MediaDataController f16736b;
    public final long f16737c;
    public final long d;
    public final int[] e;

    public m7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f16735a = i10;
        this.f16736b = mediaDataController;
        this.f16737c = j3;
        this.d = j10;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16735a) {
            case 0:
                this.f16736b.lambda$getMediaCounts$128(this.f16737c, this.d, this.e);
                return;
            case 1:
                this.f16736b.lambda$getMediaCounts$127(this.f16737c, this.d, this.e);
                return;
            default:
                this.f16736b.lambda$getMediaCounts$130(this.f16737c, this.d, this.e);
                return;
        }
    }
}
