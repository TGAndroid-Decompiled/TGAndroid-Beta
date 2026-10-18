package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f18434a;
    public final BaseController f18435b;
    public final long f18436c;
    public final long d;
    public final int e;
    public final int f18437f;

    public g8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18434a = i12;
        this.f18435b = baseController;
        this.f18436c = j10;
        this.d = j11;
        this.e = i10;
        this.f18437f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18434a) {
            case 0:
                ((MediaDataController) this.f18435b).lambda$getMediaCountDatabase$139(this.f18436c, this.d, this.e, this.f18437f);
                return;
            case 1:
                ((MediaDataController) this.f18435b).lambda$putMediaCountDatabase$138(this.f18436c, this.d, this.e, this.f18437f);
                return;
            default:
                ((MessagesStorage) this.f18435b).lambda$updateRepliesMaxReadId$193(this.f18436c, this.d, this.e, this.f18437f);
                return;
        }
    }
}
