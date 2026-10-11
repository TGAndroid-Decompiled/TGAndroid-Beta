package org.telegram.messenger;
public final class i7 implements Runnable {
    public final int f18162a;
    public final MediaDataController f18163b;
    public final long f18164c;
    public final long d;
    public final int[] f18165e;

    public i7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18162a = i10;
        this.f18163b = mediaDataController;
        this.f18164c = j3;
        this.d = j10;
        this.f18165e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18162a) {
            case 0:
                this.f18163b.lambda$getMediaCounts$128(this.f18164c, this.d, this.f18165e);
                return;
            case 1:
                this.f18163b.lambda$getMediaCounts$127(this.f18164c, this.d, this.f18165e);
                return;
            default:
                this.f18163b.lambda$getMediaCounts$130(this.f18164c, this.d, this.f18165e);
                return;
        }
    }
}
