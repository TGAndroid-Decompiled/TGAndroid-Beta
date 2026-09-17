package org.telegram.messenger;
public final class i8 implements Runnable {
    public final int f17988a;
    public final BaseController f17989b;
    public final long f17990c;
    public final long d;
    public final int f17991e;
    public final int f17992f;

    public i8(BaseController baseController, long j3, long j10, int i10, int i11, int i12) {
        this.f17988a = i12;
        this.f17989b = baseController;
        this.f17990c = j3;
        this.d = j10;
        this.f17991e = i10;
        this.f17992f = i11;
    }

    @Override
    public final void run() {
        switch (this.f17988a) {
            case 0:
                ((MediaDataController) this.f17989b).lambda$getMediaCountDatabase$139(this.f17990c, this.d, this.f17991e, this.f17992f);
                return;
            case 1:
                ((MediaDataController) this.f17989b).lambda$putMediaCountDatabase$138(this.f17990c, this.d, this.f17991e, this.f17992f);
                return;
            default:
                ((MessagesStorage) this.f17989b).lambda$updateRepliesMaxReadId$193(this.f17990c, this.d, this.f17991e, this.f17992f);
                return;
        }
    }
}
