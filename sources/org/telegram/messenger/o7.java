package org.telegram.messenger;
public final class o7 implements Runnable {
    public final int f19111a;
    public final MediaDataController f19112b;
    public final long f19113c;
    public final long d;
    public final int[] e;

    public o7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f19111a = i10;
        this.f19112b = mediaDataController;
        this.f19113c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19111a) {
            case 0:
                this.f19112b.lambda$getMediaCounts$128(this.f19113c, this.d, this.e);
                return;
            case 1:
                this.f19112b.lambda$getMediaCounts$127(this.f19113c, this.d, this.e);
                return;
            default:
                this.f19112b.lambda$getMediaCounts$130(this.f19113c, this.d, this.e);
                return;
        }
    }
}
