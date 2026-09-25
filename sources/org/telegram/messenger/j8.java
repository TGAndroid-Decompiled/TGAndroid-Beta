package org.telegram.messenger;
public final class j8 implements Runnable {
    public final int f16712a;
    public final BaseController f16713b;
    public final long f16714c;
    public final long d;
    public final int e;
    public final int f16715f;

    public j8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f16712a = i12;
        this.f16713b = baseController;
        this.f16714c = j3;
        this.d = j10;
        this.e = i10;
        this.f16715f = i11;
    }

    @Override
    public final void run() {
        switch (this.f16712a) {
            case 0:
                ((MediaDataController) this.f16713b).lambda$getMediaCountDatabase$139(this.f16714c, this.d, this.e, this.f16715f);
                return;
            case 1:
                ((MediaDataController) this.f16713b).lambda$putMediaCountDatabase$138(this.f16714c, this.d, this.e, this.f16715f);
                return;
            default:
                ((MessagesStorage) this.f16713b).lambda$updateRepliesMaxReadId$193(this.f16714c, this.d, this.e, this.f16715f);
                return;
        }
    }
}
