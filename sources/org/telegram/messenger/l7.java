package org.telegram.messenger;
public final class l7 implements Runnable {
    public final int f18865a;
    public final MediaDataController f18866b;
    public final long f18867c;
    public final long d;
    public final int[] e;

    public l7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f18865a = i10;
        this.f18866b = mediaDataController;
        this.f18867c = j10;
        this.d = j11;
        this.e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18865a) {
            case 0:
                this.f18866b.lambda$getMediaCounts$128(this.f18867c, this.d, this.e);
                return;
            case 1:
                this.f18866b.lambda$getMediaCounts$127(this.f18867c, this.d, this.e);
                return;
            default:
                this.f18866b.lambda$getMediaCounts$130(this.f18867c, this.d, this.e);
                return;
        }
    }
}
