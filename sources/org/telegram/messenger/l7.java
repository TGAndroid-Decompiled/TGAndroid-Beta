package org.telegram.messenger;
public final class l7 implements Runnable {
    public final int f17456a;
    public final MediaDataController f17457b;
    public final long f17458c;
    public final long d;
    public final int[] e;

    public l7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f17456a = i10;
        this.f17457b = mediaDataController;
        this.f17458c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17456a) {
            case 0:
                this.f17457b.lambda$getMediaCounts$128(this.f17458c, this.d, this.e);
                return;
            case 1:
                this.f17457b.lambda$getMediaCounts$127(this.f17458c, this.d, this.e);
                return;
            default:
                this.f17457b.lambda$getMediaCounts$130(this.f17458c, this.d, this.e);
                return;
        }
    }
}
