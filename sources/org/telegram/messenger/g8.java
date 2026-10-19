package org.telegram.messenger;
public final class g8 implements Runnable {
    public final int f18431a;
    public final BaseController f18432b;
    public final long f18433c;
    public final long d;
    public final int e;
    public final int f18434f;

    public g8(BaseController baseController, long j10, long j11, int i10, int i11, int i12) {
        this.f18431a = i12;
        this.f18432b = baseController;
        this.f18433c = j10;
        this.d = j11;
        this.e = i10;
        this.f18434f = i11;
    }

    @Override
    public final void run() {
        switch (this.f18431a) {
            case 0:
                ((MediaDataController) this.f18432b).lambda$getMediaCountDatabase$139(this.f18433c, this.d, this.e, this.f18434f);
                return;
            case 1:
                ((MediaDataController) this.f18432b).lambda$putMediaCountDatabase$138(this.f18433c, this.d, this.e, this.f18434f);
                return;
            default:
                ((MessagesStorage) this.f18432b).lambda$updateRepliesMaxReadId$193(this.f18433c, this.d, this.e, this.f18434f);
                return;
        }
    }
}
