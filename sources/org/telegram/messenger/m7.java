package org.telegram.messenger;
public final class m7 implements Runnable {
    public final int f18368a;
    public final MediaDataController f18369b;
    public final long f18370c;
    public final long d;
    public final int[] f18371e;

    public m7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18368a = i10;
        this.f18369b = mediaDataController;
        this.f18370c = j3;
        this.d = j10;
        this.f18371e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18368a) {
            case 0:
                this.f18369b.lambda$getMediaCounts$128(this.f18370c, this.d, this.f18371e);
                return;
            case 1:
                this.f18369b.lambda$getMediaCounts$127(this.f18370c, this.d, this.f18371e);
                return;
            default:
                this.f18369b.lambda$getMediaCounts$130(this.f18370c, this.d, this.f18371e);
                return;
        }
    }
}
