package org.telegram.messenger;
public final class h7 implements Runnable {
    public final int f18021a;
    public final MediaDataController f18022b;
    public final long f18023c;
    public final long d;
    public final int[] f18024e;

    public h7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18021a = i10;
        this.f18022b = mediaDataController;
        this.f18023c = j3;
        this.d = j10;
        this.f18024e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18021a) {
            case 0:
                this.f18022b.lambda$getMediaCounts$128(this.f18023c, this.d, this.f18024e);
                return;
            case 1:
                this.f18022b.lambda$getMediaCounts$127(this.f18023c, this.d, this.f18024e);
                return;
            default:
                this.f18022b.lambda$getMediaCounts$130(this.f18023c, this.d, this.f18024e);
                return;
        }
    }
}
