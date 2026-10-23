package org.telegram.messenger;
public final class n7 implements Runnable {
    public final int f19036a;
    public final MediaDataController f19037b;
    public final long f19038c;
    public final long d;
    public final int[] e;

    public n7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f19036a = i10;
        this.f19037b = mediaDataController;
        this.f19038c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19036a) {
            case 0:
                this.f19037b.lambda$getMediaCounts$128(this.f19038c, this.d, this.e);
                return;
            case 1:
                this.f19037b.lambda$getMediaCounts$127(this.f19038c, this.d, this.e);
                return;
            default:
                this.f19037b.lambda$getMediaCounts$130(this.f19038c, this.d, this.e);
                return;
        }
    }
}
