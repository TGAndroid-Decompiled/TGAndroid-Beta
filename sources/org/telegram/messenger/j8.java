package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f16475a;
    public final BaseController f16476b;
    public final long f16477c;
    public final long d;
    public final int e;
    public final int f16478f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16475a = i12;
        this.f16476b = baseController;
        this.f16477c = j3;
        this.d = j10;
        this.e = i10;
        this.f16478f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16475a) {
            case 0:
                ((MediaDataController) this.f16476b).lambda$getMediaCountDatabase$139(this.f16477c, this.d, this.e, this.f16478f);
                return;
            case 1:
                ((MediaDataController) this.f16476b).lambda$putMediaCountDatabase$138(this.f16477c, this.d, this.e, this.f16478f);
                return;
            default:
                ((MessagesStorage) this.f16476b).lambda$updateRepliesMaxReadId$193(this.f16477c, this.d, this.e, this.f16478f);
                return;
        }
    }
}
