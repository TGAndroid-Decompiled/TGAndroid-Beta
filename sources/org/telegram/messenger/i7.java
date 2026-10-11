package org.telegram.messenger;
public final class i7 implements Runnable {
    public final int f18126a;
    public final MediaDataController f18127b;
    public final long f18128c;
    public final long d;
    public final int[] f18129e;

    public i7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18126a = i10;
        this.f18127b = mediaDataController;
        this.f18128c = j3;
        this.d = j10;
        this.f18129e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18126a) {
            case 0:
                this.f18127b.lambda$getMediaCounts$128(this.f18128c, this.d, this.f18129e);
                return;
            case 1:
                this.f18127b.lambda$getMediaCounts$127(this.f18128c, this.d, this.f18129e);
                return;
            default:
                this.f18127b.lambda$getMediaCounts$130(this.f18128c, this.d, this.f18129e);
                return;
        }
    }
}
