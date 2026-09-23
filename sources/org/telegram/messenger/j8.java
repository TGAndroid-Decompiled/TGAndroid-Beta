package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f16452a;
    public final BaseController f16453b;
    public final long f16454c;
    public final long d;
    public final int e;
    public final int f16455f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16452a = i12;
        this.f16453b = baseController;
        this.f16454c = j3;
        this.d = j10;
        this.e = i10;
        this.f16455f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16452a) {
            case 0:
                ((MediaDataController) this.f16453b).lambda$getMediaCountDatabase$139(this.f16454c, this.d, this.e, this.f16455f);
                return;
            case 1:
                ((MediaDataController) this.f16453b).lambda$putMediaCountDatabase$138(this.f16454c, this.d, this.e, this.f16455f);
                return;
            default:
                ((MessagesStorage) this.f16453b).lambda$updateRepliesMaxReadId$193(this.f16454c, this.d, this.e, this.f16455f);
                return;
        }
    }
}
