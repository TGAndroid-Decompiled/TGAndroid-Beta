package org.telegram.messenger;
public final class k8 implements Runnable {
    public final int f18836a;
    public final BaseController f18837b;
    public final long f18838c;
    public final long d;
    public final int e;
    public final int f18839f;

    public k8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18836a = i12;
        this.f18837b = baseController;
        this.f18838c = j10;
        this.d = j11;
        this.e = i10;
        this.f18839f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18836a) {
            case 0:
                ((MediaDataController) this.f18837b).lambda$getMediaCountDatabase$139(this.f18838c, this.d, this.e, this.f18839f);
                return;
            case 1:
                ((MediaDataController) this.f18837b).lambda$putMediaCountDatabase$138(this.f18838c, this.d, this.e, this.f18839f);
                return;
            default:
                ((MessagesStorage) this.f18837b).lambda$updateRepliesMaxReadId$193(this.f18838c, this.d, this.e, this.f18839f);
                return;
        }
    }
}
