package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f18600a;
    public final BaseController f18601b;
    public final long f18602c;
    public final long d;
    public final int e;
    public final int f18603f;

    public i8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18600a = i12;
        this.f18601b = baseController;
        this.f18602c = j10;
        this.d = j11;
        this.e = i10;
        this.f18603f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18600a) {
            case 0:
                ((MediaDataController) this.f18601b).lambda$getMediaCountDatabase$139(this.f18602c, this.d, this.e, this.f18603f);
                return;
            case 1:
                ((MediaDataController) this.f18601b).lambda$putMediaCountDatabase$138(this.f18602c, this.d, this.e, this.f18603f);
                return;
            default:
                ((MessagesStorage) this.f18601b).lambda$updateRepliesMaxReadId$193(this.f18602c, this.d, this.e, this.f18603f);
                return;
        }
    }
}
