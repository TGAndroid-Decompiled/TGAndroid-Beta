package org.telegram.messenger;
public final class l7 implements Runnable {
    public final int f18868a;
    public final MediaDataController f18869b;
    public final long f18870c;
    public final long d;
    public final int[] e;

    public l7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f18868a = i10;
        this.f18869b = mediaDataController;
        this.f18870c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18868a) {
            case 0:
                this.f18869b.lambda$getMediaCounts$128(this.f18870c, this.d, this.e);
                return;
            case 1:
                this.f18869b.lambda$getMediaCounts$127(this.f18870c, this.d, this.e);
                return;
            default:
                this.f18869b.lambda$getMediaCounts$130(this.f18870c, this.d, this.e);
                return;
        }
    }
}
