package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f16696a;
    public final BaseController f16697b;
    public final long f16698c;
    public final long d;
    public final int e;
    public final int f16699f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16696a = i12;
        this.f16697b = baseController;
        this.f16698c = j3;
        this.d = j10;
        this.e = i10;
        this.f16699f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16696a) {
            case 0:
                ((MediaDataController) this.f16697b).lambda$getMediaCountDatabase$139(this.f16698c, this.d, this.e, this.f16699f);
                return;
            case 1:
                ((MediaDataController) this.f16697b).lambda$putMediaCountDatabase$138(this.f16698c, this.d, this.e, this.f16699f);
                return;
            default:
                ((MessagesStorage) this.f16697b).lambda$updateRepliesMaxReadId$193(this.f16698c, this.d, this.e, this.f16699f);
                return;
        }
    }
}
