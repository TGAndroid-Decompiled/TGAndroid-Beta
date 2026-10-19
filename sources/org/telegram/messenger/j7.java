package org.telegram.messenger;
public final class j7 implements Runnable {
    public final int f18683a;
    public final MediaDataController f18684b;
    public final long f18685c;
    public final long d;
    public final int[] e;

    public j7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f18683a = i10;
        this.f18684b = mediaDataController;
        this.f18685c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18683a) {
            case 0:
                this.f18684b.lambda$getMediaCounts$128(this.f18685c, this.d, this.e);
                return;
            case 1:
                this.f18684b.lambda$getMediaCounts$127(this.f18685c, this.d, this.e);
                return;
            default:
                this.f18684b.lambda$getMediaCounts$130(this.f18685c, this.d, this.e);
                return;
        }
    }
}
