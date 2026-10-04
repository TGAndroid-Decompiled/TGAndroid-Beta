package org.telegram.messenger;
public final class h7 implements Runnable {
    public final int f18028a;
    public final MediaDataController f18029b;
    public final long f18030c;
    public final long d;
    public final int[] f18031e;

    public h7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18028a = i10;
        this.f18029b = mediaDataController;
        this.f18030c = j3;
        this.d = j10;
        this.f18031e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18028a) {
            case 0:
                this.f18029b.lambda$getMediaCounts$128(this.f18030c, this.d, this.f18031e);
                return;
            case 1:
                this.f18029b.lambda$getMediaCounts$127(this.f18030c, this.d, this.f18031e);
                return;
            default:
                this.f18029b.lambda$getMediaCounts$130(this.f18030c, this.d, this.f18031e);
                return;
        }
    }
}
