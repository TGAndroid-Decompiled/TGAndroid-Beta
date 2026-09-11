package org.telegram.messenger;
public final class l7 implements Runnable {
    public final int f18264a;
    public final MediaDataController f18265b;
    public final long f18266c;
    public final long d;
    public final int[] f18267e;

    public l7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18264a = i10;
        this.f18265b = mediaDataController;
        this.f18266c = j3;
        this.d = j10;
        this.f18267e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18264a) {
            case 0:
                this.f18265b.lambda$getMediaCounts$128(this.f18266c, this.d, this.f18267e);
                return;
            case 1:
                this.f18265b.lambda$getMediaCounts$127(this.f18266c, this.d, this.f18267e);
                return;
            default:
                this.f18265b.lambda$getMediaCounts$130(this.f18266c, this.d, this.f18267e);
                return;
        }
    }
}
