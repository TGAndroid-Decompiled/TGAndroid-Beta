package org.telegram.messenger;
public final class k7 implements Runnable {
    public final int f18771a;
    public final MediaDataController f18772b;
    public final long f18773c;
    public final long d;
    public final int[] e;

    public k7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f18771a = i10;
        this.f18772b = mediaDataController;
        this.f18773c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18771a) {
            case 0:
                this.f18772b.lambda$getMediaCounts$128(this.f18773c, this.d, this.e);
                return;
            case 1:
                this.f18772b.lambda$getMediaCounts$127(this.f18773c, this.d, this.e);
                return;
            default:
                this.f18772b.lambda$getMediaCounts$130(this.f18773c, this.d, this.e);
                return;
        }
    }
}
