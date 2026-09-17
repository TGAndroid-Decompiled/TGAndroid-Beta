package org.telegram.messenger;
public final class l7 implements Runnable {
    public final int f18291a;
    public final MediaDataController f18292b;
    public final long f18293c;
    public final long d;
    public final int[] f18294e;

    public l7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18291a = i10;
        this.f18292b = mediaDataController;
        this.f18293c = j3;
        this.d = j10;
        this.f18294e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18291a) {
            case 0:
                this.f18292b.lambda$getMediaCounts$128(this.f18293c, this.d, this.f18294e);
                return;
            case 1:
                this.f18292b.lambda$getMediaCounts$127(this.f18293c, this.d, this.f18294e);
                return;
            default:
                this.f18292b.lambda$getMediaCounts$130(this.f18293c, this.d, this.f18294e);
                return;
        }
    }
}
