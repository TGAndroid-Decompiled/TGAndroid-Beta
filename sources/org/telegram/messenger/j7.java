package org.telegram.messenger;
public final class j7 implements Runnable {
    public final int f18680a;
    public final MediaDataController f18681b;
    public final long f18682c;
    public final long d;
    public final int[] e;

    public j7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f18680a = i10;
        this.f18681b = mediaDataController;
        this.f18682c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18680a) {
            case 0:
                this.f18681b.lambda$getMediaCounts$128(this.f18682c, this.d, this.e);
                return;
            case 1:
                this.f18681b.lambda$getMediaCounts$127(this.f18682c, this.d, this.e);
                return;
            default:
                this.f18681b.lambda$getMediaCounts$130(this.f18682c, this.d, this.e);
                return;
        }
    }
}
