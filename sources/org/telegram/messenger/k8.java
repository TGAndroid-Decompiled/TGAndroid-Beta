package org.telegram.messenger;
public final class k8 implements Runnable {
    public final int f18768a;
    public final BaseController f18769b;
    public final long f18770c;
    public final long d;
    public final int e;
    public final int f18771f;

    public k8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18768a = i12;
        this.f18769b = baseController;
        this.f18770c = j10;
        this.d = j11;
        this.e = i10;
        this.f18771f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18768a) {
            case 0:
                ((MediaDataController) this.f18769b).lambda$getMediaCountDatabase$139(this.f18770c, this.d, this.e, this.f18771f);
                return;
            case 1:
                ((MediaDataController) this.f18769b).lambda$putMediaCountDatabase$138(this.f18770c, this.d, this.e, this.f18771f);
                return;
            default:
                ((MessagesStorage) this.f18769b).lambda$updateRepliesMaxReadId$193(this.f18770c, this.d, this.e, this.f18771f);
                return;
        }
    }
}
