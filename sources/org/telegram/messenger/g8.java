package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f16463a;
    public final BaseController f16464b;
    public final long f16465c;
    public final long d;
    public final int e;
    public final int f16466f;

    public g8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16463a = i12;
        this.f16464b = baseController;
        this.f16465c = j3;
        this.d = j10;
        this.e = i10;
        this.f16466f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16463a) {
            case 0:
                ((MediaDataController) this.f16464b).lambda$getMediaCountDatabase$139(this.f16465c, this.d, this.e, this.f16466f);
                return;
            case 1:
                ((MediaDataController) this.f16464b).lambda$putMediaCountDatabase$138(this.f16465c, this.d, this.e, this.f16466f);
                return;
            default:
                ((MessagesStorage) this.f16464b).lambda$updateRepliesMaxReadId$193(this.f16465c, this.d, this.e, this.f16466f);
                return;
        }
    }
}
