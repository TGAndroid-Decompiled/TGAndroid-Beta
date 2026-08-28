package org.telegram.messenger;
public final class j7 implements Runnable {
    public final int f20664a;
    public final MediaDataController f20665b;
    public final long f20666c;
    public final long d;
    public final int[] f20667e;

    public j7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i9) {
        this.f20664a = i9;
        this.f20665b = mediaDataController;
        this.f20666c = j10;
        this.d = j11;
        this.f20667e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20664a) {
            case 0:
                this.f20665b.lambda$getMediaCounts$128(this.f20666c, this.d, this.f20667e);
                return;
            case 1:
                this.f20665b.lambda$getMediaCounts$127(this.f20666c, this.d, this.f20667e);
                return;
            default:
                this.f20665b.lambda$getMediaCounts$130(this.f20666c, this.d, this.f20667e);
                return;
        }
    }
}
