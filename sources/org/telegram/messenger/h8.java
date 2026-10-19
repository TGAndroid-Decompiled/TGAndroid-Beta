package org.telegram.messenger;
public final class h8 implements Runnable {
    public final int f18512a;
    public final BaseController f18513b;
    public final long f18514c;
    public final long d;
    public final int e;
    public final int f18515f;

    public h8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18512a = i12;
        this.f18513b = baseController;
        this.f18514c = j10;
        this.d = j11;
        this.e = i10;
        this.f18515f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18512a) {
            case 0:
                ((MediaDataController) this.f18513b).lambda$getMediaCountDatabase$139(this.f18514c, this.d, this.e, this.f18515f);
                return;
            case 1:
                ((MediaDataController) this.f18513b).lambda$putMediaCountDatabase$138(this.f18514c, this.d, this.e, this.f18515f);
                return;
            default:
                ((MessagesStorage) this.f18513b).lambda$updateRepliesMaxReadId$193(this.f18514c, this.d, this.e, this.f18515f);
                return;
        }
    }
}
