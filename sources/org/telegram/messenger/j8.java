package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f16462a;
    public final BaseController f16463b;
    public final long f16464c;
    public final long d;
    public final int e;
    public final int f16465f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16462a = i12;
        this.f16463b = baseController;
        this.f16464c = j3;
        this.d = j10;
        this.e = i10;
        this.f16465f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16462a) {
            case 0:
                ((MediaDataController) this.f16463b).lambda$getMediaCountDatabase$139(this.f16464c, this.d, this.e, this.f16465f);
                return;
            case 1:
                ((MediaDataController) this.f16463b).lambda$putMediaCountDatabase$138(this.f16464c, this.d, this.e, this.f16465f);
                return;
            default:
                ((MessagesStorage) this.f16463b).lambda$updateRepliesMaxReadId$193(this.f16464c, this.d, this.e, this.f16465f);
                return;
        }
    }
}
