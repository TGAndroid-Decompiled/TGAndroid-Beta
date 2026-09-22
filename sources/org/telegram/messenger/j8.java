package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f16711a;
    public final BaseController f16712b;
    public final long f16713c;
    public final long d;
    public final int e;
    public final int f16714f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16711a = i12;
        this.f16712b = baseController;
        this.f16713c = j3;
        this.d = j10;
        this.e = i10;
        this.f16714f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16711a) {
            case 0:
                ((MediaDataController) this.f16712b).lambda$getMediaCountDatabase$139(this.f16713c, this.d, this.e, this.f16714f);
                return;
            case 1:
                ((MediaDataController) this.f16712b).lambda$putMediaCountDatabase$138(this.f16713c, this.d, this.e, this.f16714f);
                return;
            default:
                ((MessagesStorage) this.f16712b).lambda$updateRepliesMaxReadId$193(this.f16713c, this.d, this.e, this.f16714f);
                return;
        }
    }
}
