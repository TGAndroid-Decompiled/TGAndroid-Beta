package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f16647a;
    public final BaseController f16648b;
    public final long f16649c;
    public final long d;
    public final int e;
    public final int f16650f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16647a = i12;
        this.f16648b = baseController;
        this.f16649c = j3;
        this.d = j10;
        this.e = i10;
        this.f16650f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16647a) {
            case 0:
                ((MediaDataController) this.f16648b).lambda$getMediaCountDatabase$139(this.f16649c, this.d, this.e, this.f16650f);
                return;
            case 1:
                ((MediaDataController) this.f16648b).lambda$putMediaCountDatabase$138(this.f16649c, this.d, this.e, this.f16650f);
                return;
            default:
                ((MessagesStorage) this.f16648b).lambda$updateRepliesMaxReadId$193(this.f16649c, this.d, this.e, this.f16650f);
                return;
        }
    }
}
