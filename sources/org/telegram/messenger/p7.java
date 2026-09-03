package org.telegram.messenger;
public final class p7 implements Runnable {
    public final int f19638a;
    public final MediaDataController f19639b;
    public final long f19640c;
    public final long d;
    public final int[] f19641e;

    public p7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f19638a = i10;
        this.f19639b = mediaDataController;
        this.f19640c = j10;
        this.d = j11;
        this.f19641e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19638a) {
            case 0:
                this.f19639b.lambda$getMediaCounts$128(this.f19640c, this.d, this.f19641e);
                return;
            case 1:
                this.f19639b.lambda$getMediaCounts$127(this.f19640c, this.d, this.f19641e);
                return;
            default:
                this.f19639b.lambda$getMediaCounts$130(this.f19640c, this.d, this.f19641e);
                return;
        }
    }
}
