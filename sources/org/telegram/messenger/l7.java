package org.telegram.messenger;
public final class l7 implements Runnable {
    public final int f18148a;
    public final MediaDataController f18149b;
    public final long f18150c;
    public final long d;
    public final int[] f18151e;

    public l7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18148a = i10;
        this.f18149b = mediaDataController;
        this.f18150c = j3;
        this.d = j10;
        this.f18151e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18148a) {
            case 0:
                this.f18149b.lambda$getMediaCounts$128(this.f18150c, this.d, this.f18151e);
                return;
            case 1:
                this.f18149b.lambda$getMediaCounts$127(this.f18150c, this.d, this.f18151e);
                return;
            default:
                this.f18149b.lambda$getMediaCounts$130(this.f18150c, this.d, this.f18151e);
                return;
        }
    }
}
