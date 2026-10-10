package org.telegram.messenger;
public final class i7 implements Runnable {
    public final int f18125a;
    public final MediaDataController f18126b;
    public final long f18127c;
    public final long d;
    public final int[] f18128e;

    public i7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18125a = i10;
        this.f18126b = mediaDataController;
        this.f18127c = j3;
        this.d = j10;
        this.f18128e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18125a) {
            case 0:
                this.f18126b.lambda$getMediaCounts$128(this.f18127c, this.d, this.f18128e);
                return;
            case 1:
                this.f18126b.lambda$getMediaCounts$127(this.f18127c, this.d, this.f18128e);
                return;
            default:
                this.f18126b.lambda$getMediaCounts$130(this.f18127c, this.d, this.f18128e);
                return;
        }
    }
}
