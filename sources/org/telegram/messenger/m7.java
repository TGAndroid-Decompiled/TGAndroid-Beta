package org.telegram.messenger;
public final class m7 implements Runnable {
    public final int f16961a;
    public final MediaDataController f16962b;
    public final long f16963c;
    public final long d;
    public final int[] e;

    public m7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f16961a = i10;
        this.f16962b = mediaDataController;
        this.f16963c = j3;
        this.d = j10;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16961a) {
            case 0:
                this.f16962b.lambda$getMediaCounts$128(this.f16963c, this.d, this.e);
                return;
            case 1:
                this.f16962b.lambda$getMediaCounts$127(this.f16963c, this.d, this.e);
                return;
            default:
                this.f16962b.lambda$getMediaCounts$130(this.f16963c, this.d, this.e);
                return;
        }
    }
}
