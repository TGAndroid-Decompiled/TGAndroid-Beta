package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f16697a;
    public final BaseController f16698b;
    public final long f16699c;
    public final long d;
    public final int e;
    public final int f16700f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16697a = i12;
        this.f16698b = baseController;
        this.f16699c = j3;
        this.d = j10;
        this.e = i10;
        this.f16700f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16697a) {
            case 0:
                ((MediaDataController) this.f16698b).lambda$getMediaCountDatabase$139(this.f16699c, this.d, this.e, this.f16700f);
                return;
            case 1:
                ((MediaDataController) this.f16698b).lambda$putMediaCountDatabase$138(this.f16699c, this.d, this.e, this.f16700f);
                return;
            default:
                ((MessagesStorage) this.f16698b).lambda$updateRepliesMaxReadId$193(this.f16699c, this.d, this.e, this.f16700f);
                return;
        }
    }
}
