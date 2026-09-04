package org.telegram.messenger;
public final class m7 implements Runnable {
    public final int f18341a;
    public final MediaDataController f18342b;
    public final long f18343c;
    public final long d;
    public final int[] f18344e;

    public m7(MediaDataController mediaDataController, long j3, long j10, int[] iArr, int i10) {
        this.f18341a = i10;
        this.f18342b = mediaDataController;
        this.f18343c = j3;
        this.d = j10;
        this.f18344e = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18341a) {
            case 0:
                this.f18342b.lambda$getMediaCounts$128(this.f18343c, this.d, this.f18344e);
                return;
            case 1:
                this.f18342b.lambda$getMediaCounts$127(this.f18343c, this.d, this.f18344e);
                return;
            default:
                this.f18342b.lambda$getMediaCounts$130(this.f18343c, this.d, this.f18344e);
                return;
        }
    }
}
