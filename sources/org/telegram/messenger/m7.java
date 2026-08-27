package org.telegram.messenger;

public final class m7 implements Runnable {

    public final int f20945a;

    public final MediaDataController f20946b;

    public final long f20947c;
    public final long d;

    public final int[] f20948e;

    public m7(MediaDataController mediaDataController, long j10, long j11, int[] iArr, int i10) {
        this.f20945a = i10;
        this.f20946b = mediaDataController;
        this.f20947c = j10;
        this.d = j11;
        this.f20948e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20945a) {
            case 0:
                this.f20946b.lambda$getMediaCounts$128(this.f20947c, this.d, this.f20948e);
                break;
            case 1:
                this.f20946b.lambda$getMediaCounts$127(this.f20947c, this.d, this.f20948e);
                break;
            default:
                this.f20946b.lambda$getMediaCounts$130(this.f20947c, this.d, this.f20948e);
                break;
        }
    }
}
